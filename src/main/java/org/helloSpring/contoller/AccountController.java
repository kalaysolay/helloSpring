package org.helloSpring.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @GetMapping("/hello")
    public static String helloSpring(String[] args) {
        return "Hello World";
    }
}
