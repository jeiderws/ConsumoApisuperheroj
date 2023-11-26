package com.example.consumoapisuperhero.Sharedpreference

import android.app.Application

class Shared:Application() {
    companion object{
        lateinit var prefe: SharePreference
    }
    override fun onCreate() {
        super.onCreate()
        prefe=SharePreference(applicationContext)
    }

}