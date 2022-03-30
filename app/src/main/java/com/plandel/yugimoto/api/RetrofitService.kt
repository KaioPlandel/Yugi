package com.plandel.yugimoto.api

import com.plandel.yugimoto.model.Data
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface RetrofitService {

    @GET("api/v7/cardinfo.php?archetype=Blue-Eyes")
    fun getAllCards(): Call<Data> //mudei em vez de lista coloquei o call para data pra ver se funciona

    companion object {
       private val retrofitService: RetrofitService by lazy {
            var retrofit = Retrofit.Builder()
                .baseUrl("https://db.ygoprodeck.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
           retrofit.create(RetrofitService::class.java)
        }

        fun getRetrofitInstance(): RetrofitService {
            return retrofitService
        }
    }
}