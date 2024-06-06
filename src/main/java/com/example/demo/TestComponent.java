package com.example.demo;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestComponent {

    private final String username;

    public TestComponent(@Value("${app.username}") String username) {
        this.username = username;
    }

    @PostConstruct
    void init() {
        System.out.println(username);
    }
}
