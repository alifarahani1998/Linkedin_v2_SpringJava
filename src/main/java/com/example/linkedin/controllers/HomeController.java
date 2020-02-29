package com.example.linkedin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {


        @GetMapping("/Home")
        public String control () {
            return "Home.html";
        }


        @PostMapping("/Jobs")
        public String jobs (@RequestParam("email") String email, @RequestParam("password") String password, ModelMap modelMap) {


            modelMap.put("email", email);
            modelMap.put("password", password);

            return "Jobs.html";
        }

    }

