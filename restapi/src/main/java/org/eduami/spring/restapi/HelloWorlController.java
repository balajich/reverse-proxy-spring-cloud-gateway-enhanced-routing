package org.eduami.spring.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorlController {
    @GetMapping("/**")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/ping")
    public String ping() {
        return "i am ok";
    }
}
