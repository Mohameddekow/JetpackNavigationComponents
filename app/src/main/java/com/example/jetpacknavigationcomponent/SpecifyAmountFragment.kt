package com.example.jetpacknavigationcomponent

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.jetpacknavigationcomponent.databinding.FragmentSpecifyAmountBinding

class SpecifyAmountFragment : Fragment() {
    lateinit var binding: FragmentSpecifyAmountBinding

    //argument object
    private val specifyFragArgs: SpecifyAmountFragmentArgs by navArgs<SpecifyAmountFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSpecifyAmountBinding.inflate(layoutInflater, container, false)

        val recipient = specifyFragArgs.recipient
        val message = "Sending money to $recipient ..."
        binding.recipientDetails.setText(message)

        binding.apply {
            btnSend.setOnClickListener {
                val amount = etAmount.text.toString().trim()


                if (TextUtils.isEmpty(amount)) {
                    etAmount.setError("amount required")
                } else {
                    val amount = etAmount.text.toString().trim().toInt()
                    val action =
                        SpecifyAmountFragmentDirections.actionSpecifyAmountFragmentToConfirmationFragment()
                            .setAmount(amount)
                            .setRecipient(recipient)
                    findNavController().navigate(action)
                }
            }
            btnCancel.setOnClickListener {
                activity?.onBackPressed()
            }
        }


//          /** retrieving data from the bundle **/
//          val recipient = arguments?.getString("recipient")
//
//          val message = "Sending money to $recipient ..."
//
//          binding.recipientDetails.text = message
//
//          binding.apply{
//              btnSend.setOnClickListener{
//                  val amount = etAmount.text.toString().trim()
//
//                  if (TextUtils.isEmpty(amount)){
//                      etAmount.setError("amount required")
//                  }else{
//                      val bundle = Bundle()
//                      val confirmFrag = ConfirmationFragment()
//
//                      //the int amount
//                      val amount = etAmount.text.toString().trim().toInt()
//
//                      bundle.putInt("amount", amount)
//                      bundle.putString("recipient", recipient)
//                      confirmFrag.arguments = bundle
//
//                      findNavController().navigate(
//                          R.id.action_specifyAmountFragment_to_confirmationFragment,
//                          bundle
//                          )
//                  }
//              }
//              btnCancel.setOnClickListener {
//                  activity?.onBackPressed()
//              }
//          }


        return binding.root
    }

}