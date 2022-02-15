package com.lyl.easydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class EasyDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasyDemoApplication.class, args);
    }

    @GetMapping("/test")
    public String test(){
        return "TEST";
    }

}
