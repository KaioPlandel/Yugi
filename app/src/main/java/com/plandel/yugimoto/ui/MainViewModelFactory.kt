package com.plandel.yugimoto.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.plandel.yugimoto.repository.Repository
import java.lang.IllegalArgumentException

class MainViewModelFactory constructor(private val repository: Repository) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(MainViewModel::class.java)){
            return MainViewModel(repository) as T
        }else {
            throw IllegalArgumentException("ViewModel Not Found!")
        }
    }
}