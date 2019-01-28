package com.minhluan.webservice.api.services;

import com.google.api.services.drive.Drive;
import com.google.api.services.drive.model.File;
import com.google.api.services.drive.model.FileList;
import com.minhluan.webservice.api.models.FileRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class FileService {

    public FileRequest fetchAllFiles(String nextPageToken) {
        Drive drive = GoogleDriveService.getInstance();
        List<File> files = new ArrayList<>();
        FileList result = null;
        FileRequest fileRequest = null;

        try {
            result = drive.files().list().setPageSize(10)
                    .setFields("nextPageToken, files(id, name, mimeType, iconLink, createdTime, size, webViewLink, fileExtension)")
                    .setPageToken(nextPageToken).execute();

            files = result.getFiles();
            nextPageToken = result.getNextPageToken();

            fileRequest = new FileRequest(files, nextPageToken);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileRequest;
    }
}
