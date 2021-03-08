package com.apprendev.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        changeFragment(OneFragment())

        btnOne.setOnClickListener(this)
        btnTwo.setOnClickListener(this)
        btnThree.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.btnOne -> changeFragment(OneFragment())
            R.id.btnTwo -> changeFragment(TwoFragment())
            R.id.btnThree -> changeFragment(ThirtyFragment())
        }
    }

    private fun changeFragment(fragment: Fragment) {
        val sm = supportFragmentManager.beginTransaction()
        sm.apply {
            sm.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            sm.replace(R.id.container, fragment)
            sm.addToBackStack(null)
            sm.commit()
        }
    }

}