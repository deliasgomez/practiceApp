package com.example.practiceapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewFragHomeAdapter( private val filmsHomeList: List<RecyclerViewFragHome>): RecyclerView.Adapter<HomeFragRecyclerViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeFragRecyclerViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_recycler_frag_home, parent, false)

        return HomeFragRecyclerViewHolder(view)
    }
    override fun onBindViewHolder(holder: HomeFragRecyclerViewHolder, position: Int) {
        val item = filmsHomeList[position]
        holder.render(item)
    }
    override fun getItemCount(): Int = filmsHomeList.size

}