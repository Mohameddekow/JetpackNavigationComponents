package com.example.jetpacknavigationcomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import com.example.jetpacknavigationcomponent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

    override fun onSupportNavigateUp(): Boolean {
        val navControler = findNavController(R.id.transactions_nav_graph)
        return navControler.navigateUp() || super.onSupportNavigateUp()
    }

}