package com.example.ecommerceapp
import io.reactivex.Observable
import retrofit2.Response
import retrofit2.http.GET

interface INetworkAPI {

    @GET("getAllUsers")
    fun getAllPosts(): Observable<Response<List<Post>>>


    @GET("getAllMoviesForHomePage")
    fun getAllMovies(): Observable<Response<HomeMovieResponse>>
}