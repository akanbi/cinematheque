package com.aktf.cinematheque.application.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.aktf.cinematheque.R
import com.aktf.cinematheque.application.adapter.UpcomingAdapter
import com.aktf.cinematheque.application.viewmodel.UpcomingMovieViewModel
import kotlinx.android.synthetic.main.upcoming_list_activity.*

class UpcomingListActivity : AppCompatActivity() {

    private lateinit var upcomingMovieViewModel: UpcomingMovieViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.upcoming_list_activity)

        initAdapterComponent()
        initViewModel()
    }

    private fun initAdapterComponent() {
        upcomingMovies.adapter = UpcomingAdapter(emptyList())
    }

    private fun initViewModel() {
        this.upcomingMovieViewModel = ViewModelProviders.of(this).get(UpcomingMovieViewModel::class.java)
        upcomingMovieViewModel.init()
        buildObserver()
    }

    private fun buildObserver() {
        val observer = Observer<List<String>> {
            (upcomingMovies.adapter as UpcomingAdapter).refreshList(it)
        }
        upcomingMovieViewModel.upcomingMoviesLiveData?.observeForever(observer)
    }


}