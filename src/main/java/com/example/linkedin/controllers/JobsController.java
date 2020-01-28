package com.example.linkedin.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JobsController {


    @GetMapping("/jobs")
    public String jobs () {

        return "Jobs.html";


    }


}
