package com.example.practiceapp


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.practiceapp.databinding.FragmentSearchBinding

class SearchFragment : Fragment() {
    private var binding : FragmentSearchBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSearchBinding.inflate(inflater,container,false)
        return binding!!.root
    }
    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)
        val manager = LinearLayoutManager(context)
        val decoration = DividerItemDecoration(context,manager.orientation)
        binding!!.recyclerFilms.layoutManager = manager
        binding!!.recyclerFilms.adapter = MoviesSearchAdapter(MoviesProvider.films)
        binding!!.recyclerFilms.addItemDecoration(decoration)
    }
}