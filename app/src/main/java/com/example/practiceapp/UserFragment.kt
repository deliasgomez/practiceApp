package com.example.practiceapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class UserFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreate(savedInstanceState)
        val v = inflater.inflate(R.layout.fragment_user, container, false)
        val recyclerView = v.findViewById<RecyclerView>(R.id.frag_user_recyclerView)
        val manager = LinearLayoutManager(context)
        val decoration = DividerItemDecoration(context,manager.orientation)
        recyclerView.layoutManager = manager
        recyclerView.adapter = FilmAdapter(FilmsRecyclerviewProvider.films)
        recyclerView.addItemDecoration(decoration)
        return v

    }

}