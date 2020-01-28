package com.example.linkedin.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class JobsController {


    @GetMapping("/jobs")
    public String jobs () {

        return "Jobs.html";


    }


    @PostMapping("/JobDetails")
    public String postJob (@RequestParam("jobId") String jobId, @RequestParam("jobTitle") String jobTitle, ModelMap modelMap) {


        modelMap.put("jobId", jobId);
        modelMap.put("jobTitle", jobTitle);


        return "JobDet.html";
    }


}
