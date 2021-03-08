package com.apprendev.bottomnavigation

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        changeFragment(FragmentHome())
        nav.setOnNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_home -> changeFragment(FragmentHome())
            R.id.nav_feed -> changeFragment(FragmentFeed())
            R.id.nav_account -> changeFragment(FragmentAccount())
        }
        return false
    }

    private fun changeFragment(fragment: Fragment) {
        val sf = supportFragmentManager.beginTransaction()
        sf.apply {
            sf.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            sf.replace(R.id.container, fragment)
            sf.addToBackStack(null)
            sf.commit()
        }
    }

}