package com.example.kotlincicdtoec2demo.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class AWSController {

    @GetMapping("/hello")
    fun helloAWS(): ResponseEntity<String> {
        return ResponseEntity.ok("Hello world!")
    }
}