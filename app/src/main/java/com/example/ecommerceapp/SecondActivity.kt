package com.example.ecommerceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        var singletonStudent = StudentSingleton.getInstance()
        Log.e("MainActivity" , "" + singletonStudent)


        Log.e("RetrofitSingleto" , "" + RetrofitSingleton.retrofitInstance)
    }
}
