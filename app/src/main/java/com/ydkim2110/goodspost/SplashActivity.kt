package com.ydkim2110.goodspost

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.ydkim2110.goodspost.ui.login.LoginActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            launch(LoginActivity::class.java)
        }, 1500)


    }

    private fun launch(activity: Class<*>) {
        Intent(this, activity).apply {
            startActivity(this)
            finish()
        }
    }

}
