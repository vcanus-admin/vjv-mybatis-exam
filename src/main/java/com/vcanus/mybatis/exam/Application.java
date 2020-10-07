package com.vcanus.mybatis.exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {
        "com.vcanus.mybatis",
        "com.vcanus.mybatis.exam"})
@SpringBootApplication
public class Application {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello World");
        ApplicationContext context = SpringApplication.run(Application.class,args);
    }
}
