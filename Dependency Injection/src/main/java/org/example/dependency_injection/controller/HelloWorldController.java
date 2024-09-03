package org.example.dependency_injection.controller;

import org.example.dependency_injection.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    //TODO: Insert HelloWorldService here
    //@Autowired
    private HelloWorldService helloWorldService;


    @GetMapping("/greet")
    public String greet(@RequestParam(value = "name", defaultValue = "World") String name, Model model) {
        if(helloWorldService != null){
            model.addAttribute("name", helloWorldService.greet(name));
        }else{
            model.addAttribute("name", "ERROR");
        }
        return "greeting";
    }
}
