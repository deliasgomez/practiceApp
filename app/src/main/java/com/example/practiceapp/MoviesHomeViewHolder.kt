package com.example.practiceapp

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MoviesHomeViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val punctuations = view.findViewById<TextView>(R.id.punctuation_view)
    private val nameFilm = view.findViewById<TextView>(R.id.titleFilm)

    fun render(moviesHomeModel: Movies) {
        punctuations.text = moviesHomeModel.punctuation.toString()
        nameFilm.text = moviesHomeModel.name
    }

}