package com.example.practiceapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class FilmAdapter(private val filmsList: List<FilmsRecyclerviewSearch>) : RecyclerView.Adapter<FilmViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_film, parent, false)

        return FilmViewHolder(view)
    }
    override fun onBindViewHolder(holder: FilmViewHolder, position: Int) {
        val item = filmsList[position]
        holder.render(item)
    }
    override fun getItemCount(): Int = filmsList.size

}


