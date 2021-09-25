package com.example.jetpacknavigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.jetpacknavigationcomponent.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMainBinding.inflate(layoutInflater, container, false)

        binding.apply {
            btnTransaction.setOnClickListener {
                findNavController().navigate(R.id.action_mainFragment_to_viewTransactionFragment3)
            }
            btnSendMoney.setOnClickListener {
                findNavController().navigate(R.id.action_mainFragment_to_chooseRecipientFragment2)
            }
            btnViewBalance.setOnClickListener {
                findNavController().navigate(R.id.action_mainFragment_to_viewBalanceFragment)
            }
        }



        //return the root
        return binding.root
    }


}