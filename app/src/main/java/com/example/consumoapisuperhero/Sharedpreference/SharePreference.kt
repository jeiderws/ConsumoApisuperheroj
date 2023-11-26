package com.example.consumoapisuperhero.Sharedpreference

import android.content.Context

class SharePreference(context: Context) {
    val storage=context.getSharedPreferences("SP", 0)
    fun GuardarTokenSH(token:String){
        storage.edit().putString("Token",token).apply()
    }
    fun obtenerToken():String{
        return storage.getString("Token","Token No encontrado").toString()
    }
    fun Borrar(){
        storage.edit().clear()
    }
}