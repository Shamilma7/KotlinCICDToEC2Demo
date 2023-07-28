package com.example.kotlincicdtoec2demo.entity

import jakarta.persistence.Id
import jakarta.persistence.MappedSuperclass

import java.util.UUID;


@MappedSuperclass
open class EntityWithUUID(
    @Id
    val id: UUID = UUID.randomUUID()
)