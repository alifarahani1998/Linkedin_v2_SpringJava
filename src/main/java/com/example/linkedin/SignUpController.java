package com.example.linkedin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SignUpController {

    @RequestMapping("/signUp")
    public String controller () {
        return "SignUp.jsp";
    }

}
