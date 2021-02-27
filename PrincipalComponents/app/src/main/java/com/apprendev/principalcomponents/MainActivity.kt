package com.apprendev.principalcomponents

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var etEmail: EditText
    lateinit var btnLogin: Button
    lateinit var etPassword: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etEmail = findViewById(R.id.etEmail)
        btnLogin = findViewById(R.id.btnLogin)
        etPassword = findViewById(R.id.etPassword)

        btnLogin.setOnClickListener(this)

        etEmail.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {}

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                if (s!!.isNotEmpty()) {
                    etPassword.isEnabled = true

                } else {
                    etPassword.text.clear()
                    etPassword.isEnabled = false
                }
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        })

        etPassword.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {}

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                if (s!!.isNotEmpty()) {
                    btnLogin.isEnabled = true
                    btnLogin.setBackgroundResource(R.drawable.background_button)

                } else {
                    btnLogin.isEnabled = false
                    btnLogin.setBackgroundResource(R.drawable.backgroun_button_disable)
                }
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        })
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.btnLogin -> {
                //Action
            }
        }
    }


}