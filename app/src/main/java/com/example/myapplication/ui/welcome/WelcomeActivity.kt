package com.example.myapplication.ui.welcome

import android.app.Activity
import android.content.Intent
import android.view.View
import com.example.myapplication.databinding.ActivityWelcomeBinding
import com.example.myapplication.base.BaseActivity
import com.example.myapplication.base.BaseEvent
import com.example.myapplication.base.BaseViewModel
import com.example.myapplication.data.local.SharedPreference
import com.example.myapplication.ui.choose_path.ChoosePathActivity
import com.example.myapplication.utils.showToast


class WelcomeViewModel : BaseViewModel<BaseEvent>() {

}
class WelcomeActivity : BaseActivity<WelcomeViewModel, ActivityWelcomeBinding>(
    WelcomeViewModel::class
) {

    override fun getViewBinding(): ActivityWelcomeBinding = ActivityWelcomeBinding.inflate(layoutInflater)

    override fun setupViews() {
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        binding.startBtn.setOnClickListener {
            if (binding.etEnterName.text.toString().isEmpty()) {
                showToast("Please enter your name")
            } else {
                SharedPreference.setName(binding.etEnterName.toString())
                ChoosePathActivity.startActivity(this)
//                binding.tvName.text=SharedPreference.getName()
            }
        }

    }

    override fun subscribeToLiveData() { }


    companion object {
        fun startActivity(activity: Activity) {
            val intent = Intent(activity, WelcomeActivity::class.java)
            activity.startActivity(intent)
        }
    }
}