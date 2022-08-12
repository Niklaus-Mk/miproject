package com.miproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    
    @GetMapping("/admin/upload-product")
    public ModelAndView newProduct(){
        ModelAndView modelView = new ModelAndView("admin/uploadProduct");
        return modelView;
    }
}
