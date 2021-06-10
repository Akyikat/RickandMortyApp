package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.myapplication.base.utils.viewBinding
import com.example.myapplication.databinding.ActivityWelcomeBinding
import com.example.myapplication.main.MainActivity


class WelcomeActivity : AppCompatActivity() {
    private val binding by viewBinding(ActivityWelcomeBinding::inflate)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        binding.start.setOnClickListener {
            if (binding.tvEnterName.text.toString().isEmpty()) {
                Toast.makeText(
                    this,
                    "Please enter your name", Toast.LENGTH_SHORT
                ).show()
            }else{
                val intent = Intent(this, MainActivity::class.java)
            }
        }

//        lateinit var viewModel: VM
//
//        override fun onCreate(savedInstanceState: Bundle?) {
//            super.onCreate(savedInstanceState)
//            setContentView(layoutId)
//            viewModel = getViewModel(clazz = clazz)
//            setupViews()
//            subscribeToLiveData()
//            subscribeToMessages()
//        }
    }
}