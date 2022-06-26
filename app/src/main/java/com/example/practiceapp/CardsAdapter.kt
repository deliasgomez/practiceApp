package com.example.practiceapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CardsAdapter(private val cardList: List<Cards>) : RecyclerView.Adapter<CardsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardsViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_cards_profile, parent, false)

        return CardsViewHolder(view)
    }
    override fun onBindViewHolder(holder: CardsViewHolder, position: Int) {
        val item = cardList[position]
        holder.render(item)
    }
    override fun getItemCount(): Int = cardList.size

}