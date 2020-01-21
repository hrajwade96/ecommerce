package com.example.ecommerceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        var singletonStudent = StudentSingleton.getInstance()
        Log.e("MainActivity", "" + singletonStudent)


        Log.e("RetrofitSingleton", "" + RetrofitSingleton.retrofitInstance)
        val BASE_URL = "https://api.github.com/search/"
        var tv_user: TextView? = null
        var str: String = ""

            tv_user = findViewById(R.id.tv_users)

        }



    }