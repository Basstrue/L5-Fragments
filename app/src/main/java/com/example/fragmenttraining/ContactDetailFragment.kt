package com.example.fragmenttraining

import android.os.Bundle
import android.provider.Settings.Global.getString
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.example.fragmenttraining.databinding.FragmentDetailContactBinding

class ContactDetailFragment: Fragment(R.layout.fragment_detail_contact) {

    private var cd_fragment_binding: FragmentDetailContactBinding? = null

    var received_name: String? = ""

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = FragmentDetailContactBinding.inflate(inflater, container, false)
        cd_fragment_binding = binding

        received_name = arguments?.getString("contact_name")
        binding.detailsName.text = received_name

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        cd_fragment_binding = null
    }
}