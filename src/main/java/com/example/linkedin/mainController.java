package com.example.linkedin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class mainController {

    @RequestMapping("/login")
    public String controller () {

        return "Welcome To Linkedin new version!";
    }
}
