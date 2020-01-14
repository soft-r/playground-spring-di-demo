package hu.atsoft.playground.springdidemo.controllers;

import hu.atsoft.playground.springdidemo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello() {
        System.out.println("Hello from MyController");
//        return "Hello from MyController";
        return greetingService.sayGreeting();
    }
}
