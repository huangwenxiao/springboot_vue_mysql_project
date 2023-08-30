package com.example.sjkkeshe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//一个接口用于获取资源
@SpringBootApplication
public class SjkkesheApplication {

    public static void main(String[] args) {
        SpringApplication.run(SjkkesheApplication.class, args);
    }

    @GetMapping
    public String health()
    { return "sucess";} //一个基本的方法用于检测是否正常链接
    //@是注解的意思
}

