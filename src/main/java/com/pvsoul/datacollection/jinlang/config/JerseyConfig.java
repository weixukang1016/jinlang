package com.pvsoul.datacollection.jinlang.config;

import com.pvsoul.datacollection.jinlang.provider.RuntimeExceptionProvider;
import com.pvsoul.datacollection.jinlang.provider.ValidationExceptionProvider;
import org.glassfish.jersey.server.ResourceConfig;

import org.springframework.boot.autoconfigure.jersey.ResourceConfigCustomizer;
import org.springframework.context.annotation.Configuration;


/**
 * Jersey配置类
 *
 */
@Configuration
public class JerseyConfig implements ResourceConfigCustomizer {

    @Override
    public void customize(ResourceConfig config) {
        //config.packages("com.pvsoul.datacollection.jinlang.resource");
        config.register(com.pvsoul.datacollection.jinlang.resource.DataReceiveResource.class);
        config.registerClasses(ValidationExceptionProvider.class);
        config.registerClasses(RuntimeExceptionProvider.class);
    }
}