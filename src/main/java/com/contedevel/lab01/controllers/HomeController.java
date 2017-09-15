package com.contedevel.lab01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String home(@RequestParam(required = false) String name, Model model) {
        model.addAttribute("msg", getHelloStr(name));
        return "home";
    }

    public String getHelloStr(String name) {

        if (!(name == null || name.equals(""))) {
            return String.format("Hello, %s!", name);
        }

        return "Hello, World!";
    }


}
