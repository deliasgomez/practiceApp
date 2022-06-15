package com.example.practiceapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MoviesSearchAdapter(private val filmsList: List<Movies>) : RecyclerView.Adapter<MoviesSearchViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesSearchViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_view_search, parent, false)

        return MoviesSearchViewHolder(view)
    }
    override fun onBindViewHolder(holder: MoviesSearchViewHolder, position: Int) {
        val item = filmsList[position]
        holder.render(item)
    }
    override fun getItemCount(): Int = filmsList.size

}


