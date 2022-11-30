package com.example.myapplication.fragments

import android.os.Bundle
import android.view.TextureView
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.myapplication.R

class DashboardFragment :Fragment(R.layout.dashboard_fragment) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.text).text = DashboardFragmentArgs.fromBundle(requireArguments()).name
    }

}