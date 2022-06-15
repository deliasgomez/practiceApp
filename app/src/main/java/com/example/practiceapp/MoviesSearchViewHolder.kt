package com.example.practiceapp

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class MoviesSearchViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val names = view.findViewById<TextView>(R.id.tvFilmTitle)
    private val year = view.findViewById<TextView>(R.id.tvFilmYear)
    private val actors = view.findViewById<TextView>(R.id.tvFilmActors)
    private val photo = view.findViewById<ImageView>(R.id.imageFilm)

    fun render(moviesSearchModel: Movies){
        names.text = moviesSearchModel.name
        year.text = moviesSearchModel.year.toString()
        actors.text = moviesSearchModel.actors
        Glide.with(photo.context).load(moviesSearchModel.photo).into(photo)
    }
}