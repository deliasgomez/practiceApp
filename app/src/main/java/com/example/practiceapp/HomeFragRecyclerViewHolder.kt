package com.example.practiceapp

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HomeFragRecyclerViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val punctuations = view.findViewById<TextView>(R.id.punctuation_view)
    private val nameFilm = view.findViewById<TextView>(R.id.titleFilm)

    fun render(recyclerViewFragHomeModel: RecyclerViewFragHome) {
        punctuations.text = recyclerViewFragHomeModel.punctuation.toString()
        nameFilm.text = recyclerViewFragHomeModel.nameFilm
    }

}