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
public FileControllers(FileServiceImpl fileService){
    this.fileServiceImpl = fileService;
}
    @PostMapping("/compareFiles")
    public String compareFiles(@RequestParam ("fileName1") String file1 , @RequestParam ("fileName2") String file2){
        Path path1 = Paths.get(file1);
        Path path2 = Paths.get(file2);
    fileServiceImpl.compareFiles("path1","path2");
return "files are compared";

    }




    @PostMapping("/create")
    public String createFile(@RequestParam ("fileName") String filename)  {
        Path path = Paths.get(filename);
        fileServiceImpl.createFile("path");
        return "create";
    }

    @PostMapping("/copy")
    public String copyFile(@RequestParam ("fileName1") String  file1 ,@RequestParam ("fileName2")String file2)  {
        Path sourcePath = Paths.get(file1);
        Path destinationPath = Paths.get(file2);
        fileServiceImpl.copyFile("sourcePath","destinationPath");

        return "File is copied";
    }




    }

