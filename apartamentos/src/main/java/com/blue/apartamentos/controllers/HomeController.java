package com.blue.apartamentos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index"; // Carga el archivo index.html de src/main/resources/templates/ o static/
    }
}