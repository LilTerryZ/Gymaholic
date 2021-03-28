package com.example.gymaholic

import android.icu.util.Calendar
import android.icu.util.GregorianCalendar
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.DatePicker
import android.widget.TimePicker
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController

class BookingFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private lateinit var navController: NavController

    companion object {

        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance() =
                BookingFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.booking_fragment, container, false)
        // Inflate the layout for this fragment
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = findNavController()

        val dateBtn = view.findViewById<View>(R.id.date_btn)
        dateBtn.setOnClickListener {

            val dialogDateView = View.inflate(activity, R.layout.date_booking, null)
            val dialogTimeView = View.inflate(activity, R.layout.time_booking, null)
            val alertDialog: AlertDialog = AlertDialog.Builder(requireContext()).create()

            dialogDateView.findViewById<View>(R.id.date_set_btn).setOnClickListener {
                val datePicker = dialogDateView.findViewById<View>(R.id.date_picker) as DatePicker
                val timePicker = dialogTimeView.findViewById<View>(R.id.time_picker) as TimePicker
                val calendar: Calendar = GregorianCalendar(datePicker.year,
                        datePicker.month,
                        datePicker.dayOfMonth,
                        timePicker.hour,
                        timePicker.minute)
                val time = calendar.timeInMillis
                alertDialog.dismiss()
            }
            alertDialog.setView(dialogDateView)
            alertDialog.show()
        }
            val timeBtn = view.findViewById<View>(R.id.time_btn)
        timeBtn.setOnClickListener {
            val dialogDateView = View.inflate(activity, R.layout.date_booking, null)
            val dialogTimeView = View.inflate(activity, R.layout.time_booking, null)
            val alertDialog: AlertDialog = AlertDialog.Builder(requireContext()).create()
            dialogTimeView.findViewById<View>(R.id.time_set_btn).setOnClickListener {
                val datePicker = dialogDateView.findViewById<View>(R.id.date_picker) as DatePicker
                val timePicker = dialogTimeView.findViewById<View>(R.id.time_picker) as TimePicker
                val calendar: Calendar = GregorianCalendar(datePicker.year,
                        datePicker.month,
                        datePicker.dayOfMonth,
                        timePicker.hour,
                        timePicker.minute)
                val time = calendar.timeInMillis
                alertDialog.dismiss()
            }
            alertDialog.setView(dialogTimeView)
            alertDialog.show()
        }

    }


}