package com.example.myapplication.ui.choose_path

import android.app.Activity
import android.content.Intent
import com.example.myapplication.base.BaseActivity
import com.example.myapplication.base.BaseViewModel
import com.example.myapplication.databinding.ActivityEpisodesBinding

class ChoosePathViewModel : BaseViewModel() {

}

class ChoosePathActivity : BaseActivity<ChoosePathViewModel, ActivityEpisodesBinding>(
    ChoosePathViewModel::class
) {
    override fun getViewBinding(): ActivityEpisodesBinding = ActivityEpisodesBinding.inflate(layoutInflater)

    override fun setupViews() { }

    override fun subscribeToLiveData() { }

    companion object {
        fun startActivity(activity: Activity) {
            val intent = Intent(activity, ChoosePathActivity::class.java)
            activity.startActivity(intent)
        }
    }

}