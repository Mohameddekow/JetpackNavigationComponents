package com.example.jetpacknavigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.jetpacknavigationcomponent.databinding.FragmentViewBalanceBinding

class ViewBalanceFragment : Fragment() {
    lateinit var binding: FragmentViewBalanceBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentViewBalanceBinding.inflate(layoutInflater, container, false)




        return binding.root
    }

}