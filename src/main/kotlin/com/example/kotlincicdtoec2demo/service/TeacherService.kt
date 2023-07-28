package com.example.kotlincicdtoec2demo.service

import com.example.kotlincicdtoec2demo.entity.Teacher
import com.example.kotlincicdtoec2demo.repository.TeacherRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TeacherService {

    @Autowired
    lateinit var teacherRepository: TeacherRepository

    fun getTeachers(): List<Teacher> {
        return teacherRepository.findAll().toList()
    }
}