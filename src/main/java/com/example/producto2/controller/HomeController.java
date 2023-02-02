package com.example.producto2.controller;

import com.example.producto2.service.menuService.ProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")

public class HomeController {
    @Autowired
    private ProductosService productosService;

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("productos", productosService.findAll());
        return "home";
    }
}

