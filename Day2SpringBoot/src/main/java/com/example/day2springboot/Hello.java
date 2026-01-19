package com.example.day2springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@ResponseBody // return plain text;
public class Hello {

    @GetMapping("/")
    public String hello(){
        return "front";
    }

    @GetMapping("/home")
    public String home(){
        return "Home";
    }

    @GetMapping("/cont")
    public String cont(){
        return "contact";
    }



}
