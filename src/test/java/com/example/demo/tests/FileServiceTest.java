package com.example.demo.tests;
import com.example.demo.service.impl.FileServiceImpl;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertTrue;
@RunWith(SpringRunner.class)
@SpringBootTest
public class FileServiceTest {
    @Autowired
   private FileServiceImpl fileServiceImpl;
}
