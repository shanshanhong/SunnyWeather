package com.sunnyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import android.media.session.MediaSession

class SunnyWeatherApplication :Application(){
     companion object{
         const val TOKEN="CaZeEoRHrBRk07ER"
         @SuppressLint("StaticFieldLeak")//填入彩云的令牌值，方便之后的获取
         lateinit var context: Context
     }

    override fun onCreate() {
        super.onCreate()
        context=applicationContext
    }
}
