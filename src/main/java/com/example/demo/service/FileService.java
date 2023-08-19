package com.example.demo.service;

public interface FileService {
    boolean compareFiles(String filePath1, String filePath2);

    boolean createFile(String path);

    boolean copyFile(String sourcePath, String destinationPath);
}
