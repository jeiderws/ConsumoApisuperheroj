package com.example.consumoapisuperhero.Dato

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Query

interface LoguinInterface {

    @POST("Loguin")
    fun loquinpost( @Body kk : LoguinData)  : Call<Response>

}