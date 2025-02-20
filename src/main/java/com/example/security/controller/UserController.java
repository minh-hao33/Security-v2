package com.example.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping("/login")
    public String loginPage() {
        return "login"; // Thymeleaf sẽ render login.html
    }

    @GetMapping("/home")
    public String homePage() {
        return "home";
    }
}
