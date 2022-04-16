package com.example.fragmenttraining

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.fragmenttraining.databinding.FragmentListContactBinding

class ContactListFragment: Fragment(R.layout.fragment_list_contact) {

    private var cl_fragment_binding: FragmentListContactBinding? = null


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = FragmentListContactBinding.inflate(inflater, container, false)
        cl_fragment_binding = binding

        binding.contact1.setOnClickListener{
            val name: String = binding.contact1.text.toString()
            var bundle: Bundle? = null
            bundle?.putString("name", name)
            ContactListFragment().arguments = bundle
            replaceFragment(ContactDetailFragment())
        }
        return binding.root
    }

    private fun replaceFragment(fragment: Fragment){
        parentFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(null)
            .commit()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        cl_fragment_binding = null
    }
    }






