package org.example.ConstructorInjection;

import org.example.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConstructorInjectionController {

    private final GreetingService greetingService;

    public ConstructorInjectionController(GreetingService greetingService){
        this.greetingService = greetingService;
    }


    @GetMapping("/constructor/{name}")
    public String greet(@PathVariable String name) {
        return greetingService.greet(name);
    }
}
