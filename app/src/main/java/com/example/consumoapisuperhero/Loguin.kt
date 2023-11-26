package com.example.consumoapisuperhero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.consumoapisuperhero.Dato.Api
import com.example.consumoapisuperhero.Dato.LoguinData
import com.example.consumoapisuperhero.databinding.ActivityLoguinBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Loguin : AppCompatActivity() {
    lateinit var binding: ActivityLoguinBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoguinBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.Loguinbtn.setOnClickListener {
            loguear()
        }
    }

    fun loguear() {
        var user = binding.USernatext.text.toString()
        var pass = binding.Passwtext.text.toString()
        var param = LoguinData(user,pass)
        Api.llamar.loquinpost(param).enqueue(object : Callback<com.example.consumoapisuperhero.Dato.Response> {
                override fun onResponse(
                    call: Call<com.example.consumoapisuperhero.Dato.Response>,
                    response: Response<com.example.consumoapisuperhero.Dato.Response>
                ) {
                 
                    if (response.isSuccessful ) {
                        startActivity(Intent(this@Loguin, Usuario::class.java))
                        Toast.makeText(this@Loguin, "logueau", Toast.LENGTH_SHORT).show()


                    } else {
                        Log.e("TA malo", "Ditaseaaaaaa")
                        Log.e("TA malo", response.message())
                        Log.e("TA malo", response.code().toString())
                        binding.txtErrorInicio.text="Usuario incorrecto"

                    }

                }

                override fun onFailure(
                    call: Call<com.example.consumoapisuperhero.Dato.Response>,
                    t: Throwable
                ) {
                    Log.e("TA malo", t.message.toString())
                }
            })
    }
}