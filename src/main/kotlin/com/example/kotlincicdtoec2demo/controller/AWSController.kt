package com.example.kotlincicdtoec2demo.controller

import com.example.kotlincicdtoec2demo.entity.Teacher
import com.example.kotlincicdtoec2demo.service.TeacherService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class AWSController {

    @Autowired
    lateinit var teacherService: TeacherService

    @GetMapping("/hello")
    fun helloAWS(): ResponseEntity<String> {
        return ResponseEntity.ok("Hello world!")
    }

    @GetMapping("/isAlive")
    fun isAlive(): ResponseEntity<String> {
        return ResponseEntity.ok("Hello! This endpoint got updated and so it should be updated calling through api gateway also")
    }

    @GetMapping("/teachers")
    fun getTeacher(): ResponseEntity<List<Teacher>> {
        return ResponseEntity.ok().body(teacherService.getTeachers())
    }
}