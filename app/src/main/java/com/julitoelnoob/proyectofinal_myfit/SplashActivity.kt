package com.julitoelnoob.proyectofinal_myfit

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val i = Intent(this, AuthActivity::class.java)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(i)
            finish()
        }, 1000)
    }
}