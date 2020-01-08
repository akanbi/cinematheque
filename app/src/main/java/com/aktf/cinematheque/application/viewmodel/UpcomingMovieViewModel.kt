package com.aktf.cinematheque.application.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UpcomingMovieViewModel : ViewModel() {

    fun list(): List<String> {
        return arrayListOf("IT A coisa", "O Irlandes", "Era uma vez em hollywood", "The Witcher", "Walking Dead")
    }

    var upcomingMoviesLiveData: MutableLiveData<List<String>>? = null

    fun init() {
        if (upcomingMoviesLiveData == null)
            this.upcomingMoviesLiveData = MutableLiveData()

        upcomingMoviesLiveData?.value = list()
    }

}