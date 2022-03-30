package com.plandel.yugimoto.repository

import com.plandel.yugimoto.api.RetrofitService

class Repository constructor(private val retrofitService: RetrofitService) {

    fun getAllCards() = retrofitService.getAllCards()

}