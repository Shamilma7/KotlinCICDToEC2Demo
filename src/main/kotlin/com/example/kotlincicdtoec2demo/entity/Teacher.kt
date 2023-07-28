package com.example.kotlincicdtoec2demo.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.util.*


@Entity
class Teacher(
    @Id()
    @Column(name = "id")
    val id: UUID? = null,
    @Column(name = "NAME")
    var name: String? = null,
    @Column(name = "pictureurl")
    val pictureURL: String? = null,
    @Column(name = "email")
    val email: String? = null
)