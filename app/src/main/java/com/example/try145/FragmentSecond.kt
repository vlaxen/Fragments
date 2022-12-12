package com.example.try145

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class FragmentSecond : Fragment(R.layout.fragment_second) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button = view.findViewById<Button>(R.id.switchButtonBack)
        button.setOnClickListener {
            (requireActivity() as MainActivity).switchToFragmentFirst()
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            FragmentSecond()
    }
}