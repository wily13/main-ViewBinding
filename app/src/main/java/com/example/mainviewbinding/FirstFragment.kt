package com.example.mainviewbinding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mainviewbinding.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private var _binding : FragmentFirstBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.tvFirstFragment.text = "this is view binding in fragment first"

        return view

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}