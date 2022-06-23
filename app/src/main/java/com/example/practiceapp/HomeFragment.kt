package com.example.practiceapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.practiceapp.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private var _binding : FragmentHomeBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater,container,false)
        return binding.root
    }
    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)
        val manager = LinearLayoutManager(context, RecyclerView.HORIZONTAL ,false)
        val decoration = DividerItemDecoration(context,manager.orientation)
        binding.fragHomeRecyclerView.layoutManager = manager
        binding.fragHomeRecyclerView.adapter = MoviesHomeAdapter(MoviesProvider.films)
        binding.fragHomeRecyclerView.addItemDecoration(decoration)
    }
}