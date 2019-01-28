package com.minhluan.webservice.api.controllers;

import com.google.gson.Gson;
import com.minhluan.webservice.api.models.User;
import com.minhluan.webservice.api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriInfo;
import java.util.List;

@Component
@Path("/users")
public class UserController {

    @Autowired
    private UserService userService;

    private Gson gson = new Gson();

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public String getAll() {
        List<User> users = userService.getAllUsers();
        return gson.toJson(users);
    }

    @GET
    @Path("/find/{username}")
    public String getUserByUsername(@PathParam("username") String username) {
        return gson.toJson(userService.getUserByUsername(username));
    }
}
