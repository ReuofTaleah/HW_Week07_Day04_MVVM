package com.example.usingmvvm.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Api {
    companion object{
        private val retrofit: Retrofit
        init{
            retrofit= Retrofit.Builder()
                .baseUrl("https://618ebc2e50e24d0017ce141f.mockapi.io/User/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        fun getInstance(): Retrofit {
            return retrofit
        }
    }
}