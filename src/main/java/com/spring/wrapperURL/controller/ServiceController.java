package com.spring.wrapperURL.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ServiceController {

    @RequestMapping("/user")
    public String domain() {
        return System.getenv("USERDOMAIN");
    }
}
