package com.laughstorm.javafxboot.demo.service;

import org.springframework.stereotype.Component;

@Component
public class DefaultAwesomeActionService implements AwesomeActionService {

    @Override
    public String processName(final String name) {
        return "Hello " + name + "!";
    }

}
