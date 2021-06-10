package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class SplashActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        Handler(Looper.getMainLooper()).postDelayed({
            openActivity() }, 1500)
    }

    private fun openActivity() {

//        if (prefs.name.isEmpty)
        val intent = Intent(this, WelcomeActivity::class.java)
        startActivity(intent)
        finish()

    }
}