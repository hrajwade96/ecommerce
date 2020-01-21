package com.example.ecommerceapp

import com.google.gson.annotations.SerializedName

data class Post(

    @SerializedName("name") val name: String,
    @SerializedName("desctiption") val desctiption: String

)