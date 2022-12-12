package com.example.try145

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class FragmentFirst : Fragment(R.layout.fragment_first) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button = view.findViewById<Button>(R.id.switchButton)
        button.setOnClickListener {
            (requireActivity() as MainActivity).switchToFragmentSecond()
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            FragmentFirst()
    }
}