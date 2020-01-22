package com.example.ecommerceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.gson.GsonBuilder
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.internal.schedulers.IoScheduler
import kotlinx.android.synthetic.main.activity_big_json.*
import kotlinx.android.synthetic.main.activity_rec.*
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class BigJsonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_big_json)

        rv2.setHasFixedSize(true)
        rv2.layoutManager = LinearLayoutManager(this)

        val retrofit = Retrofit.Builder().addConverterFactory(
            GsonConverterFactory.create(
                GsonBuilder().create()))
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .baseUrl("http://gray-tomato.herokuapp.com/").build()

        val postsApi = retrofit.create(INetworkAPI::class.java)

        var response = postsApi.getAllMovies()

        response
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(IoScheduler())
            .subscribe({s->
                val postList = s.body()
                postList?.let {
                    rv2.adapter = BigJsonAdapter(it.allMovies, this)
                }
            },{error ->
                Toast.makeText(this,"${error.message}", Toast.LENGTH_SHORT).show()
            })







    }
}
