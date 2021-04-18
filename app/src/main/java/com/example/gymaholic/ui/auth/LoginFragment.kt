package com.example.gymaholic.ui.auth

import android.os.Bundle
import android.view.*
import android.view.View.GONE
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.example.gymaholic.R


class LoginFragment : Fragment() {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.login_fragment, container, false)

        //val drawer = view.findViewById<DrawerLayout>(R.id.drawer_layout)
        //drawer.visibility = GONE
        // Inflate the layout for this fragment
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = findNavController()

        val loginBtn = view.findViewById<View>(R.id.login_btn)
        loginBtn.setOnClickListener { navController.navigate(R.id.action_login_to_home, arguments) }
        val signupBtn = view.findViewById<View>(R.id.signup_btn)
        signupBtn.setOnClickListener { navController.navigate(R.id.action_login_to_signup, arguments) }
    }


    override fun onPrepareOptionsMenu(menu: Menu) {
        val item = menu.findItem(R.id.action_logout)
        if (item != null) item.isVisible = false
    }

    companion object {

        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance() =
                SignupFragment()
    }
}