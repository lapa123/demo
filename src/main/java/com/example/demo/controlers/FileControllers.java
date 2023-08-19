package com.example.demo.controlers;
import com.example.demo.service.impl.FileServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

@RestController
@RequestMapping("/files")
public class FileControllers {
    private final FileServiceImpl fileServiceImpl;

    @Autowired
    public FileControllers(FileServiceImpl fileService) {
        this.fileServiceImpl = fileService;
    }

    @PostMapping("/compareFiles")
    public String compareFiles(@RequestParam("fileName1") MultipartFile file1, @RequestParam("fileName2") MultipartFile file2) {
        String fileOne = file1.getName();
        String fileTwo = file2.getName();
        Path path1 = Paths.get(fileOne);
        Path path2 = Paths.get(fileTwo);
        fileServiceImpl.compareFiles("path1", "path2");
        return "files are compared";

    }


    @PostMapping("/create")
    public String createFile(@RequestParam("path") String path1, @RequestParam("content") String fileName) {

        fileServiceImpl.createFile("path1");
        return "create";
    }

    @PostMapping("/copy")
    public String copyFile(@RequestParam ("fileName1") MultipartFile file1 ,@RequestParam("fileName2")MultipartFile file2)  {
        String fileS = file1.getName();
        String fileD = file2.getName();
    Path sourcePath = Paths.get(fileS);
        Path destinationPath = Paths.get(fileD);
        fileServiceImpl.copyFile("sourcePath","destinationPath");

        return "File is copied";
    }




    }

