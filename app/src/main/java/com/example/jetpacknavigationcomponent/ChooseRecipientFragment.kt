package com.example.jetpacknavigationcomponent

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.jetpacknavigationcomponent.databinding.FragmentChooseRecipientBinding

class ChooseRecipientFragment : Fragment() {
    lateinit var binding: FragmentChooseRecipientBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentChooseRecipientBinding.inflate(layoutInflater, container, false)

        binding.apply {
            btnNext.setOnClickListener {

                /** using safe args to pass data **/
                val recipient = etRecipient.text.toString().trim()

                if (TextUtils.isEmpty(recipient)) {
                    etRecipient.setError("recipient name can't be empty")
                } else {
                    val action =
                        ChooseRecipientFragmentDirections.actionChooseRecipientFragmentToSpecifyAmountFragment()
                            .setRecipient(recipient)
                    findNavController().navigate(action)

                }


//                /**  using bundle to pass the data  ***/
//
//                val recipient = etRecipient.text.toString().trim()
//                if (TextUtils.isEmpty(recipient)) {
//                    etRecipient.setError("recipient name can't be empty")
//                } else {
//                    val bundle = Bundle()
//                    val specifyFrag = SpecifyAmountFragment()
//                    bundle.putString("recipient", recipient)
//                    specifyFrag.arguments = bundle
//
//                    findNavController().navigate(
//                        R.id.action_chooseRecipientFragment_to_specifyAmountFragment,
//                        bundle
//                    )
//                }
            }

            btnCancel.setOnClickListener {
                activity?.onBackPressed()
            }


        }

        return binding.root
    }

}