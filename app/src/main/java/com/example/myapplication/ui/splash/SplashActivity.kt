package com.example.myapplication.ui.splash

import android.content.Intent
import android.os.Handler
import android.os.Looper
import android.view.View
import com.example.myapplication.databinding.ActivitySplashBinding
import com.example.myapplication.base.BaseActivity
import com.example.myapplication.base.BaseEvent
import com.example.myapplication.base.BaseViewModel
import com.example.myapplication.ui.choose_path.ChoosePathActivity
import com.example.myapplication.ui.welcome.WelcomeActivity

class SplashViewModel : BaseViewModel<BaseEvent>() {

}

class SplashActivity: BaseActivity<SplashViewModel, ActivitySplashBinding>(
    SplashViewModel::class
) {


    override fun getViewBinding(): ActivitySplashBinding = ActivitySplashBinding.inflate(layoutInflater)

    override fun setupViews() {
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        Handler(Looper.getMainLooper()).postDelayed({
            //сделать проверку на открытие следующего активити
//            if (prefs.name.isNotEmpty) ChoosePathActivity.startActivity(this)
//            else WelcomeActivity.startActivity(this)

            WelcomeActivity.startActivity(this)
        }, 1500)
    }

    private fun openActivity() {
        val intent = Intent(this, WelcomeActivity::class.java)
        startActivity(intent)
        finish()
    }

    override fun subscribeToLiveData() {

    }
}