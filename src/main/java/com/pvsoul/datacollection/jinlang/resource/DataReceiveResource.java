package com.pvsoul.datacollection.jinlang.resource;

//import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONObject;
import com.pvsoul.datacollection.jinlang.dao.JinLangDataDao;
import com.pvsoul.datacollection.jinlang.dao.ResultDao;
import com.pvsoul.datacollection.jinlang.service.DataReceiveService;
import com.pvsoul.datacollection.jinlang.util.JinlangAuth;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.text.ParseException;

//@Api(value = "DataReceiveResource")
@Path("api/datareceive")
@Component
@Slf4j
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class DataReceiveResource {

    @Autowired
    private DataReceiveService dataReceiveService;

    @POST
    @Path("/pushdata")
    //@ApiOperation("接收锦浪云平台推送数据")
    public Response pushData(@Context HttpServletRequest request, JinLangDataDao data) throws ParseException {
        String verb = request.getMethod();
        String contentType = request.getHeader("content-type");
        String date = request.getHeader("date");
        String canonicalizedResource = request.getRequestURI();
        String authorization = request.getHeader("authorization");
        boolean isAuth = JinlangAuth.checkAuth(verb, contentType, date, canonicalizedResource, authorization);
        ResultDao resultDao;
        if (isAuth) {
            log.info(JSONObject.toJSONString(data));
            resultDao = dataReceiveService.SaveData(data);
        } else {
            log.info("Jinlang Authorization is wrong");
            log.info("verb:" + verb);
            log.info("contentType:" + contentType);
            log.info("date:" + date);
            log.info("canonicalizedResource:" + canonicalizedResource);
            log.info("authorization:" + authorization);
            log.info("RemoteHost:" + request.getRemoteHost());
            resultDao = new ResultDao();
            resultDao.setSuccess(false);
            resultDao.setCode(String.valueOf(Response.Status.UNAUTHORIZED.getStatusCode()));
            resultDao.setMsg("Jinlang Authorization is wrong");
        }
        return Response.status(Response.Status.OK).entity(resultDao).build();
    }

}
