package com.pvsoul.datacollection.jinlang.resource;

import com.pvsoul.datacollection.jinlang.dao.JinLangDataDao;
import com.pvsoul.datacollection.jinlang.dao.ResultDao;
import com.pvsoul.datacollection.jinlang.service.DataReceiveService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

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
    //@ApiOperation("实时轨迹点推送")
    public Response pushData(JinLangDataDao data) {

        log.info(data.toString());
        ResultDao resultDao = dataReceiveService.SaveData(data);
        return Response.status(Response.Status.OK).entity(resultDao).build();
    }

}
