package com.example.practiceapp


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.practiceapp.databinding.FragmentUserBinding


class UserFragment : Fragment() {
    private var binding : FragmentUserBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentUserBinding.inflate(inflater, container, false)
        return binding!!.root
    }
    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)
        val manager = LinearLayoutManager(context, RecyclerView.HORIZONTAL ,false)
        val decoration = DividerItemDecoration(context,manager.orientation)
        binding!!.fragUserRecyclerView.layoutManager = manager
        binding!!.fragUserRecyclerView.adapter = CardsAdapter(CardsProvider.cards)
        binding!!.fragUserRecyclerView.addItemDecoration(decoration)
    }
}
