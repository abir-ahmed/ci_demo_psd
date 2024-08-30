package com.example.ci_demo_psd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GreetingServiceTest {

    private final GreetingService greetingService = new GreetingService();

    @Test
    void testGreet() {
        String result = greetingService.greet("World");
        assertEquals("Hello, World", result);
    }
}
