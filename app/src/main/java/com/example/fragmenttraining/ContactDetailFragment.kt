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

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = FragmentDetailContactBinding.inflate(inflater, container, false)
        var name: String = ""
        cd_fragment_binding = binding
        var name_field: TextView = binding.detailsName
        val bundle: Bundle? = arguments
        if (arguments?.getString("name") != null) {
            //val text1 = bundle?.getString("name")
            //name_field.text = text1.toString()}
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        cd_fragment_binding = null
    }
}