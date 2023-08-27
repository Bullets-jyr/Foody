package com.example.foody.ui.fragments.overview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import coil.load
import com.example.foody.R
import com.example.foody.databinding.FragmentOverviewBinding
import com.example.foody.models.Result

class OverviewFragment : Fragment() {

    private var _binding: FragmentOverviewBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_overview, container, false)
        _binding = FragmentOverviewBinding.inflate(inflater, container, false)

        val args = arguments
        val myBundle: Result? = args?.getParcelable("recipeBundle")

        binding.mainImageView.load(myBundle?.image)
        binding.titleTextView.text = myBundle?.title
        binding.likesTextView.text = myBundle?.aggregateLikes.toString()
        binding.timeTextView.text = myBundle?.readyInMinutes.toString()
        binding.summaryTextView.text = myBundle?.summary

        if(myBundle?.vegetarian == true){
            binding.vegetarianImageView.setColorFilter(ContextCompat.getColor(requireContext(), R.color.green))
            binding.vegetarianTextView.setTextColor(ContextCompat.getColor(requireContext(), R.color.green))
        }

        if(myBundle?.vegan == true){
            binding.veganImageView.setColorFilter(ContextCompat.getColor(requireContext(), R.color.green))
            binding.veganTextView.setTextColor(ContextCompat.getColor(requireContext(), R.color.green))
        }

        if(myBundle?.glutenFree == true){
            binding.glutenFreeImageView.setColorFilter(ContextCompat.getColor(requireContext(), R.color.green))
            binding.glutenFreeTextView.setTextColor(ContextCompat.getColor(requireContext(), R.color.green))
        }

        if(myBundle?.dairyFree == true){
            binding.dairyFreeImageView.setColorFilter(ContextCompat.getColor(requireContext(), R.color.green))
            binding.dairyFreeTextView.setTextColor(ContextCompat.getColor(requireContext(), R.color.green))
        }

        if(myBundle?.veryHealthy == true){
            binding.healthyImageView.setColorFilter(ContextCompat.getColor(requireContext(), R.color.green))
            binding.healthyTextView.setTextColor(ContextCompat.getColor(requireContext(), R.color.green))
        }

        if(myBundle?.cheap == true){
            binding.cheapImageView.setColorFilter(ContextCompat.getColor(requireContext(), R.color.green))
            binding.cheapTextView.setTextColor(ContextCompat.getColor(requireContext(), R.color.green))
        }

        return binding.root
    }
}