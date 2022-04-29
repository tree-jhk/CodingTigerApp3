package com.example.codingtigerapp3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.codingtigerapp3.fragments.AboutMe2_Fragment
import com.example.codingtigerapp3.fragments.BlogFragment
import com.example.codingtigerapp3.fragments.ToVisitorsFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.fragment_blog.*

class MainActivityReal : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_real)

        val blogFragment = BlogFragment()
        val aboutme2Fragment  = AboutMe2_Fragment()
        val toVisitorsFragment = ToVisitorsFragment()

        makeCurrentFragment(aboutme2Fragment)

        findViewById<BottomNavigationView>(R.id.bottom_navigation).setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.ic_blog->makeCurrentFragment(blogFragment)
                R.id.ic_aboutme->makeCurrentFragment(aboutme2Fragment)
                R.id.ic_tovisitors->makeCurrentFragment(toVisitorsFragment)
            }
            true
        }

    }
    private fun makeCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_wrapper, fragment)
            commit()
        }
    }

    override fun onBackPressed() {
        if(webview.canGoBack())
        {
            webview.goBack()
        }
        else
        {
            super.onBackPressed()
        }
    }

}