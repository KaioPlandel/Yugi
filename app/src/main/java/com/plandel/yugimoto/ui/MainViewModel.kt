package com.plandel.yugimoto.ui

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.plandel.yugimoto.model.Card
import com.plandel.yugimoto.model.Data
import com.plandel.yugimoto.repository.Repository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel constructor(private val repository: Repository) : ViewModel() {

    var listCards = MutableLiveData<Data>()
    var message = MutableLiveData<String>()

    fun getAllCards() {
        val request = repository.getAllCards()
        request.enqueue(object : Callback<Data>{
            override fun onResponse(call: Call<Data>, response: Response<Data>) {
                Log.d("TAG", "onResponse: " + response.body())
            }

            override fun onFailure(call: Call<Data>, t: Throwable) {
                Log.d("TAG", "onResponse: " + t.message)
            }

        })


    }
}