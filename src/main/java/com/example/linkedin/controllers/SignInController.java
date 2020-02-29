package com.example.linkedin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
public class SignInController {

//    @RequestMapping("/signIn")
//    public ModelAndView controller (@RequestParam("cname") String courseName, @RequestParam("cid") String courseId) {
//
////        HttpSession session = request.getSession();
////        String cname = request.getParameter("cname");
//        System.out.println("the course name is: " + courseName);
////        session.setAttribute("cname", courseName);
//
//
//
////        HttpSession session1 = request.getSession();
////        String cid = request.getParameter("cid");
//        System.out.println("the course id is: " + courseId);
////        session.setAttribute("cid", courseId);
//
//        ModelAndView mv = new ModelAndView();
//        mv.addObject("cname", courseName);
//        mv.addObject("cid", courseId);
//        mv.setViewName("SignIn.jsp");
//        return mv;
////        return "SignIn.jsp";
//    }





    @GetMapping("/signIn")
    public String signIn () {

        return "SignIn.jsp";
    }

    @PostMapping("/home")
    public String details (@RequestParam("email") String email, @RequestParam("password") String password, ModelMap modelMap) {


        modelMap.put("email", email);
        modelMap.put("password", password);

        return "Home.html";
    }

}
