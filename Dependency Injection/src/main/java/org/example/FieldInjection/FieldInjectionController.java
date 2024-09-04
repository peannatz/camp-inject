package org.example.FieldInjection;

import org.example.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FieldInjectionController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping("/field/{name}")
    public String greet(@PathVariable String name) {
        return greetingService.greet(name);
    }

}
