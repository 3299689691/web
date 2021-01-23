package com.qwer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = "com.qwer.admin")
@MapperScan("com.qwer.admin.mapper")
public class QwerApplication {

    public static void main(String[] args) {
        SpringApplication.run(QwerApplication.class, args);
    }

}
