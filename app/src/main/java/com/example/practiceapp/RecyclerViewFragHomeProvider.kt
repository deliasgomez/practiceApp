package com.example.practiceapp

class RecyclerViewFragHomeProvider {
    companion object{
        val filmsHome = listOf<RecyclerViewFragHome>(
            RecyclerViewFragHome(4.5 , "Batman"),
            RecyclerViewFragHome(4.6, "Dangerous"),
            RecyclerViewFragHome(4.5,"Fast and furious 2"),
            RecyclerViewFragHome(5.0, "Titanic")

        )
    }
}