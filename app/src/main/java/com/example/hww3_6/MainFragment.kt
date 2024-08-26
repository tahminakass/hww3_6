package com.example.hww3_6

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.hww3_6.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    lateinit var viewBinding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = FragmentMainBinding.inflate(layoutInflater)
        return viewBinding.root
    }
}

