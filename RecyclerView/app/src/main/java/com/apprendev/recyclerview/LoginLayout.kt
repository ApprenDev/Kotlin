package com.apprendev.recyclerview

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login_layout.*

class LoginLayout : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_layout)

        btnLogin.setOnClickListener(this)
        btnSignUp.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btnLogin -> startActivity(Intent(this, MainActivity::class.java))
            R.id.btnSignUp -> Toast.makeText(this, "Sign Up", Toast.LENGTH_SHORT).show()
        }
    }

}