package hu.atsoft.playground.springdidemo.controllers;

import hu.atsoft.playground.springdidemo.services.GreetingServiceImpl;

public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }
}
