package com.plandel.yugimoto.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.plandel.yugimoto.R
import com.plandel.yugimoto.api.RetrofitService
import com.plandel.yugimoto.repository.Repository

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: MainViewModel
    var retrofitService = RetrofitService.getRetrofitInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this,MainViewModelFactory(Repository(retrofitService))).get(MainViewModel::class.java)

        viewModel.getAllCards()

        viewModel.message.observe(this, Observer {
            Log.d("TAG", "onCreate: " + it)
        })
    }
}