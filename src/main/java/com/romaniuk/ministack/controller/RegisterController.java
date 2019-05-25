package com.romaniuk.ministack.controller;

import com.romaniuk.ministack.model.form.RegisterForm;
import com.romaniuk.ministack.model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {

    @Autowired
    UserService userService;


    @GetMapping("/user/register")
    public String addform(Model model){
        model.addAttribute("registerForm",new RegisterForm());
        return "user/register";
    }

    @PostMapping("/user/register")
    public String register(@ModelAttribute("registerForm") RegisterForm registerForm,
                           Model model) {
        userService.registerUser(registerForm);
        System.out.println(registerForm);
        return "user/register";
    }




}
