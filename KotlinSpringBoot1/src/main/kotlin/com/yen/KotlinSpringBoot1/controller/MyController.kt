package com.yen.KotlinSpringBoot1.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class MyController {

    @GetMapping("/hello")
    fun sayHello(): String {
        return "Hello from Kotlin Spring Boot!"
    }

}
