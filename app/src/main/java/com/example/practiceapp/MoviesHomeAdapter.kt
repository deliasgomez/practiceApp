package com.example.practiceapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MoviesHomeAdapter(private val filmsHomeList: List<Movies>): RecyclerView.Adapter<MoviesHomeViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesHomeViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_view_home, parent, false)

        return MoviesHomeViewHolder(view)
    }
    override fun onBindViewHolder(holder: MoviesHomeViewHolder, position: Int) {
        val item = filmsHomeList[position]
        holder.render(item)
    }
    override fun getItemCount(): Int = filmsHomeList.size

}