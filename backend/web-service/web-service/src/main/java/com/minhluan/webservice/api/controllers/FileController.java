package com.minhluan.webservice.api.controllers;

import com.google.api.services.drive.model.File;
import com.google.gson.Gson;
import com.minhluan.webservice.api.models.FileRequest;
import com.minhluan.webservice.api.services.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import java.util.List;

@Component
@Path("/files")
public class FileController {

    @Autowired
    private FileService fileService;

    private Gson gson = new Gson();

    @GET
    public String getAllFiles(@Context UriInfo info) {
        String token = info.getQueryParameters().getFirst("nextPageToken");
        FileRequest fileRequest = fileService.fetchAllFiles(token);
        return gson.toJson(fileRequest);
    }
}
