package com.example.linkedin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class SignUpController {

    @GetMapping("/signUp")
    public String controller () {
        return "SignUp.jsp";
    }




}
