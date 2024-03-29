package org.portfolio.contactcloud.ui.onBoarding

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.fragment_first.view.*
import org.portfolio.contactcloud.GlobalSharedPreference
import org.portfolio.contactcloud.R
import org.portfolio.contactcloud.ui.Login

class Second : Fragment() {




        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            // Inflate the layout for this fragment
            val view= inflater.inflate(R.layout.fragment_second, container, false)

            view.textView.animate().alpha(1f).duration=1500
            view.textView2.animate().translationX(180f).alpha(1f).duration=2000
            view.next.setOnClickListener{
                val intent= Intent(activity, Login::class.java)
                val pref= GlobalSharedPreference.getInstance(view.context)
                pref.setValue("firstTime","not")
                startActivity(intent)
                activity?.finish()
            }
            view.next.animate().alpha(1f).duration=2000
            val call=object : OnBackPressedCallback(true) {
                override fun handleOnBackPressed() {

                }

            }
            requireActivity().onBackPressedDispatcher.addCallback(call)
            return view
        }

    }


