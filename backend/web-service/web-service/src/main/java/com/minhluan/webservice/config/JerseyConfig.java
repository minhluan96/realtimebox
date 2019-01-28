package com.minhluan.webservice.config;

import com.minhluan.webservice.api.controllers.FileController;
import com.minhluan.webservice.api.controllers.UserController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(UserController.class);
        register(FileController.class);
    }
}
