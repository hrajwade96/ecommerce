package com.example.ecommerceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var s = Student.StudentBuilder()
            .addName("asdasd")
            .addAddress("asdasd")
            .addCGPA("7.6")
            .addRollnumber(10)
            .build()



        for(i in 0..100){
            print(i)
        }


        var singletonStudent = StudentSingleton.getInstance()
        Log.e("MainActivity" , "" + singletonStudent)



        Log.e("RetrofitSingl" , "" + RetrofitSingleton.retrofitInstance)




        btn_main.setOnClickListener {
            var intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
        btn_rec.setOnClickListener{
            var intent = Intent(this,RecActivity::class.java)
            startActivity(intent)
        }
        btn_big.setOnClickListener{
            var intent= Intent(this,BigJsonActivity::class.java)
            startActivity(intent)
        }

    }
}
