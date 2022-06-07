package com.example.practiceapp

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class FilmViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val names = view.findViewById<TextView>(R.id.tvFilmTitle)
    private val year = view.findViewById<TextView>(R.id.tvFilmYear)
    private val actors = view.findViewById<TextView>(R.id.tvFilmActors)
    private val photo = view.findViewById<ImageView>(R.id.imageFilm)

    fun render(filmsRecyclerviewSearchModel: FilmsRecyclerviewSearch){
        names.text = filmsRecyclerviewSearchModel.name
        year.text = filmsRecyclerviewSearchModel.year.toString()
        actors.text = filmsRecyclerviewSearchModel.actors
        Glide.with(photo.context).load(filmsRecyclerviewSearchModel.photo).into(photo)

    }
}