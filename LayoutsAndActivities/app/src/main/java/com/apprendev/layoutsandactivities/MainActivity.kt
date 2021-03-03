 package com.apprendev.layoutsandactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

 class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin.setOnClickListener(this)

    }

     override fun onClick(v: View?) {
         when(v?.id) {
             R.id.btnLogin -> {
                 val intent = Intent(this, SecondActivity::class.java)
                 intent.putExtra("email", etEmail.text.toString())
                 startActivity(intent)
             }
         }
     }
 }