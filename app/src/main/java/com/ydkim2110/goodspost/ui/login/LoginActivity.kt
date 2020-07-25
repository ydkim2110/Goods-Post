package com.ydkim2110.goodspost.ui.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import com.ydkim2110.goodspost.R
import com.ydkim2110.goodspost.utils.addFragment
import kotlinx.android.synthetic.main.activity_login.*
import timber.log.Timber

class LoginActivity : AppCompatActivity() {

    private var doubleBackToExit = false

    private lateinit var loginFragment: LoginFragment
    private lateinit var signUpFragment: SignUpFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginFragment = LoginFragment()
        signUpFragment = SignUpFragment()

        addFragment(loginFragment, layoutContainer.id)
    }

    override fun onBackPressed() {
        if (supportFragmentManager.backStackEntryCount > 0) {
            supportFragmentManager.popBackStackImmediate()
        } else {
            if (doubleBackToExit) {
                super.onBackPressed()
            } else {
                Toast.makeText(this, "Tap back again to exit", Toast.LENGTH_SHORT).show()

                doubleBackToExit = true
                Handler().postDelayed({ doubleBackToExit = false }, 1500)
            }
        }
    }
}
