package com.miproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

    @GetMapping("/")
    public String getIndex(){
        return "index";
    }

    @GetMapping("/about-us")
    public String aboutUs(){
        return "about";
    }

    @GetMapping("/productos")
    public String productos(){
        return "product";
    }

    @GetMapping("/contacto")
    public String contact(){
        return "contact";
    }

    @GetMapping("/blog")
    public String blog(){
        return "blog";
    }

    @GetMapping("/error ")
    public String errorNotFound(){
        return "error404";
    }

    @GetMapping("/feature")
    public String feature(){
        return "feature";
    }

    @GetMapping("/testimonial")
    public String testimonio(){
        return "testimonial";
    }

}
