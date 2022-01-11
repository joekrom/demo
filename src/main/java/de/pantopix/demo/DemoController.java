package de.pantopix.demo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Value("${pwd}")
    private String message;

    @RequestMapping
    public String helloWorld() {
        return "Hello";
    }

    @RequestMapping("/test")
    public String proptest(){
        return message;
    }

}
