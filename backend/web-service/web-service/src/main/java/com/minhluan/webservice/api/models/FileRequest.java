package com.minhluan.webservice.api.models;

import com.google.api.services.drive.model.File;

import java.util.List;

public class FileRequest {

    private List<File> files;

    private String nextPageToken;

    public FileRequest() {
    }

    public FileRequest(List<File> files, String nextPageToken) {
        this.files = files;
        this.nextPageToken = nextPageToken;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public String getNextPageToken() {
        return nextPageToken;
    }

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }
}
