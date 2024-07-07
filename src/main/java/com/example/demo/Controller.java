package com.example.demo;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Tutorial", description = "Tutorial management APIs")
@RequestMapping("/index")
public class Controller {

    @GetMapping
    String hello () {
        return "Hello world";
    }


}
