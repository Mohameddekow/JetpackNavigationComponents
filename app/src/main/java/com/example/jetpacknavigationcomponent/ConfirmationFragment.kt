package com.example.jetpacknavigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.jetpacknavigationcomponent.databinding.FragmentConfirmationBinding

class ConfirmationFragment : Fragment() {
    lateinit var binding:FragmentConfirmationBinding
    //creating the args object
    private val confirmFragArgs: ConfirmationFragmentArgs by navArgs<ConfirmationFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentConfirmationBinding.inflate(layoutInflater, container, false)

        val recipient = confirmFragArgs.recipient
        val amount = confirmFragArgs.amount
        binding.tvConfirmation.setText("$$amount is sent to $recipient")


        return binding.root
    }

}