package org.example;

import exercise1.ConsoleLogger;
import exercise1.FileLogger;
import exercise1.Logger;
import exercise1.UserService;
import exercise2.AuthentificationService;
import exercise2.PasswordValidator;
import org.apache.catalina.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyInjectionApplication {

    public static void main(String[] args) {
        SpringApplication.run(DependencyInjectionApplication.class, args);

        AuthentificationService authentificationService = new AuthentificationService();
        PasswordValidator passwordValidator = new PasswordValidator();
        authentificationService.setPasswordValidator(passwordValidator);

        String validPassword = "12345678";
        String invalidPassword = "1234567";

        System.out.println(authentificationService.authenticate(validPassword));
        System.out.println(authentificationService.authenticate(invalidPassword));

    }
}
