package org.ml.jenkins_study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){

        return "hello";
    }
    @GetMapping("/hello1")
    public String hello1(){

        return "hello";
    }
    @GetMapping("/test")
    public String test(){

        return "hello\n";
    }
}
