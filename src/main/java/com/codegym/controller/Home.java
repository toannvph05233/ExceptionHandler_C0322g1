package com.codegym.controller;

import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Home {
    @GetMapping("/home")
    public ModelAndView show(@RequestParam String a){
        ModelAndView modelAndView = new ModelAndView("home");
        String[] arr = {"Toàn","Hoàng"};
        modelAndView.addObject("arr",arr);
        return modelAndView;
    }


}
