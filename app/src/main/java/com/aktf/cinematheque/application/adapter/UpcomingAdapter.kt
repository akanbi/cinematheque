package com.aktf.cinematheque.application.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.aktf.cinematheque.R
import kotlinx.android.synthetic.main.upcoming_movie_element.view.*

class UpcomingAdapter() : RecyclerView.Adapter<UpcomingAdapter.UpcomingMoviewViewHolder>() {

    lateinit var list: List<String>

    constructor(list: List<String>) : this() {
        this.list = list
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UpcomingMoviewViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.upcoming_movie_element, parent, false)
        return UpcomingMoviewViewHolder(view)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: UpcomingMoviewViewHolder, position: Int) {
        holder.buildViewHolder(list[position])
    }

    fun refreshList(list: List<String>) {
        this.list = list
        notifyDataSetChanged()
    }

    class UpcomingMoviewViewHolder(var view: View) : RecyclerView.ViewHolder(view) {
        fun buildViewHolder(upcomingMovie: String) {
            view.name.text = upcomingMovie
        }
    }
}