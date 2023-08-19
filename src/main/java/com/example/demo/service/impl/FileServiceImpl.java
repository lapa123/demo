package com.example.demo.service.impl;

import com.example.demo.service.FileService;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.Arrays;


import java.nio.file.*;


@Service
public class FileServiceImpl implements FileService {
    @Override
    public boolean compareFiles(String path1, String path2) {
        File file1 = new File(path1);
        File file2 = new File(path2);

        try (InputStream is1 = new FileInputStream(file1);
             InputStream is2 = new FileInputStream(file2)) {

            byte[] content1 = is1.readAllBytes();
            byte[] content2 = is2.readAllBytes();

            return Arrays.equals(content1, content2);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
    @Override
    public boolean createFile(String path) {
        File file = new File(path);

        try {
            return file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();

        return false;
    }
}
@Override
public boolean copyFile(String sourcePath, String destinationPath) {
    File sourceFile = new File(sourcePath);
    File destFile = new File(destinationPath);

    try (InputStream is = new FileInputStream(sourceFile);
         OutputStream os = new FileOutputStream(destFile)) {
        byte[] buffer = new byte[1024];
        int length;
        while ((length = is.read(buffer)) > 0) {
            os.write(buffer, 0, length);
        }
        return true;
    } catch (IOException e) {
        e.printStackTrace();
        return false;
    }
}
}
