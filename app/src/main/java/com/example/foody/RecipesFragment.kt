package com.example.foody

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.foody.databinding.FragmentRecipesBinding
import kotlinx.android.synthetic.main.fragment_recipes.view.*

class RecipesFragment : Fragment() {
    lateinit var binding: FragmentRecipesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentRecipesBinding.inflate(inflater)

        binding.recyclerView.showShimmer()

        return binding.root
    }
}