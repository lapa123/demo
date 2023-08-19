package com.example.demo.tests;
import com.example.demo.service.impl.FileServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Test.*;

@SpringBootTest
public class FileServiceTest {
    @Autowired
    private FileServiceImpl fileServiceImpl;

    @Test
    public void testCompareFiles() {
       boolean result = fileServiceImpl.compareFiles("C:\\Users\\User\\IdeaProjects\\demo\\doc.txt", "C:\\Users\\User\\IdeaProjects\\demo\\fog.txt");
        Assert.isTrue(result, "files are compared");
    }
}