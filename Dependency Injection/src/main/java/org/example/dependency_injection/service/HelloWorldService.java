package org.example.dependency_injection.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    public String greet(String name) {
        return "Hello, " + name + "!";
    }
}
