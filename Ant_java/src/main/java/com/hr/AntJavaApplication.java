package com.hr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hr.dao")
public class AntJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AntJavaApplication.class, args);
    }

}
