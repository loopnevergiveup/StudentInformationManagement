package com.web.studentmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentmanagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentmanagementApplication.class, args);
        System.out.println("http://localhost:8081");
    }

}
