package com.example.gymaholic

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController

class HomeFragment : Fragment() {

    private lateinit var navController: NavController

    companion object {
        @JvmStatic
        fun newInstance() =
                BookingFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.home_fragment, container, false)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = findNavController()

        val trainerImg = view.findViewById<View>(R.id.trainerImage)
        trainerImg.setOnClickListener { navController.navigate(R.id.action_home_to_book, arguments) }
    }
}