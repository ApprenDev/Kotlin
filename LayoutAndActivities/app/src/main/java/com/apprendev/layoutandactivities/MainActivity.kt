package com.apprendev.layoutandactivities

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOne.setOnClickListener(this)
        btnTwo.setOnClickListener(this)
        btnThirty.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btnOne -> startActivity(Intent(this, LinearActivity::class.java))
            R.id.btnTwo -> startActivity(Intent(this, RelativeActivity::class.java))
            R.id.btnThirty -> startActivity(Intent(this, ConstraintActivity::class.java))
        }
    }

}