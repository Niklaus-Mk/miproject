package com.miproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    
    @GetMapping("subirProducto")
    public ModelAndView newProduct(){
        ModelAndView modelView = new ModelAndView("subirProducto");
        return modelView;
    }

    @GetMapping("/admin/new-product")
    public String uploadProduct(){
        return "admin/uploadProduct";
    }
}
