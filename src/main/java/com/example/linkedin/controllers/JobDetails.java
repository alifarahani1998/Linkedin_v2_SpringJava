package com.example.linkedin.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class JobDetails {


    @GetMapping("/jobDetails")
    public String getDetails () {

        return "JobDet.html";

    }

}

