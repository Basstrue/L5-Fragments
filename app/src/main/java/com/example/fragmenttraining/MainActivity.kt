package com.example.fragmenttraining

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.fragmenttraining.databinding.ActivityMainBinding

interface Communicator {
    fun passDataCom(editTextInput: String)}

class MainActivity : AppCompatActivity(), Communicator {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, ContactListFragment()).commit()
    }

    override fun passDataCom(editTextInput: String) {
        TODO("Not yet implemented")
    }
}