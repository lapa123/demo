package com.example.demo.controlers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileUploadControllers {
    @PostMapping("/upload-file")
    public String uploadFile(@RequestParam("file")MultipartFile file){
        return "Successfully upload";

    }
}

