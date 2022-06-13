package com.example.practiceapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.OrientationHelper
import androidx.recyclerview.widget.RecyclerView



class UserFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_user, container, false)
    }

    @SuppressLint("WrongConstant")
    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)

        val recyclerView = view?.findViewById<RecyclerView>(R.id.frag_user_recyclerView)
        val manager = LinearLayoutManager(context, OrientationHelper.HORIZONTAL ,false)
        val decoration = DividerItemDecoration(context,manager.orientation)
        recyclerView?.layoutManager = manager
        recyclerView?.adapter = RecyclerViewFragHomeAdapter(RecyclerViewFragHomeProvider.filmsHome)
        recyclerView?.addItemDecoration(decoration)

    }
}
