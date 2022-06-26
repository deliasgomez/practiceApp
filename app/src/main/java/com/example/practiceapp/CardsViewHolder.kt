package com.example.practiceapp

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CardsViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val function = view.findViewById<TextView>(R.id.card_functions)
    private val resumeFunctions = view.findViewById<TextView>(R.id.card_resume_functions)
    private val totalFunctionsPerformed = view.findViewById<TextView>(R.id.card_total_functions_performed)
    fun render(cardsModel: Cards) {
        function.text = cardsModel.function
        resumeFunctions.text = cardsModel.resume
        totalFunctionsPerformed.text = cardsModel.totalFunctions.toString()
    }
}