package org.example;

import exercise1.ConsoleLogger;
import exercise1.FileLogger;
import exercise1.Logger;
import exercise1.UserService;
import org.apache.catalina.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyInjectionApplication {

    public static void main(String[] args) {
        SpringApplication.run(DependencyInjectionApplication.class, args);

        Logger consoleLogger = new ConsoleLogger();
        UserService userServiceWithConsoleLogger = new UserService(consoleLogger);

        userServiceWithConsoleLogger.registerUser("John");

        Logger fileLogger = new FileLogger();
        UserService userServiceWithFileLogger = new UserService(fileLogger);
        userServiceWithFileLogger.registerUser("Jane");
    }

}
