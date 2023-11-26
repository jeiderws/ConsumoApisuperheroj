package com.example.consumoapisuperhero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.consumoapisuperhero.Dato.User
import com.example.consumoapisuperhero.Sharedpreference.Shared.Companion.prefe
import com.example.consumoapisuperhero.databinding.ActivityUsuarioBinding

class Usuario : AppCompatActivity() {
    lateinit var  binding: ActivityUsuarioBinding
    var listSuperHero: MutableList<User> = mutableListOf()
    var listSuperHero2: MutableList<User> = mutableListOf()
    lateinit var token: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUsuarioBinding.inflate(layoutInflater)
        setContentView(binding.root)
        token = prefe.obtenerToken()

    }
}