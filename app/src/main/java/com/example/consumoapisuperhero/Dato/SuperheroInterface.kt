package com.example.consumoapisuperhero.Dato

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Path

interface SuperheroInterface {
    @GET("Superheroes")
    fun getsuperhero(@Header("Authorization") token: String): Call<List<User>>

    @GET("Superheroes/{id}")
    fun getSuperheroId(@Header("Authorization") token: String, @Path("id") id: Int): Call<User  >

    @POST("Superheroes")
    fun postSuperHero(@Header("Authorization") token: String,@Body superhero: User): Call<User>

    @DELETE("Superheroes/{id}")
    fun eliminarsuperhero(@Header("Authorization") token: String,@Path("id") id: Int): Call<User>

}