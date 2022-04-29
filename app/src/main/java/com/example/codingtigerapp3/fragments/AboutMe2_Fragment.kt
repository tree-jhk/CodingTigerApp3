package com.example.codingtigerapp3.fragments

import AboutMePages.App_Introduction
import AboutMePages.Hobby_Introduction
import AboutMePages.Plan_Introduction
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.codingtigerapp3.R
import kotlinx.android.synthetic.main.fragment_about_me2_.*

class AboutMe2_Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about_me2_, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        app_introduction.setOnClickListener {
            activity?.let{
                val intent = Intent(context, App_Introduction::class.java)
                startActivity(intent)
            }
        }
        hobby_introduction.setOnClickListener {
            activity?.let{
                val intent = Intent(context, Hobby_Introduction::class.java)
                startActivity(intent)
            }
        }
        plan_introduction.setOnClickListener {
            activity?.let{
                val intent = Intent(context, Plan_Introduction::class.java)
                startActivity(intent)
            }
        }
    }
}