package com.example.gymaholic.dialogs

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.example.gymaholic.R

class LogoutDialog : DialogFragment() {

    private lateinit var navController: NavController
    companion object {
        @JvmStatic
        fun newInstance() =
                LogoutDialog()
    }
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        navController = findNavController()
        return AlertDialog.Builder(requireActivity())
                .setTitle(R.string.app_name)
                .setMessage("Do you want to logout?")
                .setPositiveButton(R.string.yes_op) { dialog, id ->
                    navController.navigate(R.id.action_global_logout, arguments)
                }
                .setNegativeButton(R.string.no_op) { dialog, id -> dialog.cancel() }
                .create()
    }
}