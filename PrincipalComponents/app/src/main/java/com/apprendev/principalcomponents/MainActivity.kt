package com.apprendev.principalcomponents

import android.os.Bundle
import android.util.Patterns
import android.view.LayoutInflater
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.etEmail
import kotlinx.android.synthetic.main.dialog_error_message.*
import www.sanju.motiontoast.MotionToast

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin.setOnClickListener(this)
        tvForgotPassword.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.btnLogin -> {
                goToLogin(etEmail.text.toString(), etPassword.text.toString())
            }
            R.id.tvForgotPassword -> {
                showForgotPassword()
            }
        }
    }

    private fun goToLogin(email: String, password: String) {
        when {
            !Patterns.EMAIL_ADDRESS.matcher(email).matches() -> {
                showMessageError(getString(R.string.error_wrong_email))
            }
            password.isEmpty() -> {
                showMessageError(getString(R.string.error_empty_password))
            }
            else -> {
                showMessageSuccess(getString(R.string.login_success_message))
            }
        }
    }

    private fun showForgotPassword() {
        val view = LayoutInflater.from(this).inflate(R.layout.dialog_error_message, null)
        val builder = AlertDialog.Builder(this).setView(view)
        val forgotDialog = builder.show()

        forgotDialog.imgExit.setOnClickListener { forgotDialog.dismiss() }

        forgotDialog.btnSend.setOnClickListener {
            forgotDialog.dismiss()
            showMessageSuccess(getString(R.string.forgot_message_success))
        }
    }

    private fun showMessageError(msgError: String) {
        MotionToast.createToast(
            this, getString(R.string.general_error), msgError,
            MotionToast.TOAST_ERROR,
            MotionToast.GRAVITY_BOTTOM,
            MotionToast.LONG_DURATION,
            ResourcesCompat.getFont(this, R.font.helvetica_regular)
        )
    }

    private fun showMessageSuccess(msg: String) {
        MotionToast.createToast(
            this, getString(R.string.general_success), msg,
            MotionToast.TOAST_SUCCESS,
            MotionToast.GRAVITY_BOTTOM,
            MotionToast.LONG_DURATION,
            ResourcesCompat.getFont(this, R.font.helvetica_regular)
        )
    }

}
