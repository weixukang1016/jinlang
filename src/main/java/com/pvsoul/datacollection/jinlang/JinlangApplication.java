package com.pvsoul.datacollection.jinlang;

import org.glassfish.jersey.server.ResourceConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@MapperScan("com.pvsoul.datacollection.jinlang.mapper")
public class JinlangApplication {

    public static void main(String[] args) {
        SpringApplication.run(JinlangApplication.class, args);
    }

    @Bean
    public ResourceConfig resourceConfig() {
        return new ResourceConfig();
    }
}
