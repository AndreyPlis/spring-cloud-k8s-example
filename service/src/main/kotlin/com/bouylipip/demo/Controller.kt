package com.bouylipip.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello")
class Controller {
    @GetMapping
    fun hello(): String =  "hell"
}