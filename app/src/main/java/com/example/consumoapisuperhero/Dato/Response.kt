package com.example.consumoapisuperhero.Dato

data class Response(
    val DateTime: String,
    val Token: String,
    val User: User,
    val sucees : Boolean
)