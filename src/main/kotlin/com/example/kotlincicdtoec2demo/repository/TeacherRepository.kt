package com.example.kotlincicdtoec2demo.repository

import com.example.kotlincicdtoec2demo.entity.Teacher
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface TeacherRepository : CrudRepository<Teacher, UUID> {
}