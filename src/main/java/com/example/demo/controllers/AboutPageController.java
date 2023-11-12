package com.example.demo.controllers;

import com.example.demo.domain.InhousePart;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutPageController {
    @GetMapping("/aboutpage")
    public String goToAboutPage(){
        return "aboutpage";
    }
}
