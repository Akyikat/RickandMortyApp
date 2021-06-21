package com.example.myapplication.ui.choose_path

import android.app.Activity
import android.content.Intent
import com.example.myapplication.base.BaseActivity
import com.example.myapplication.base.BaseViewModel
import com.example.myapplication.databinding.ActivityChoosePathBinding
import com.example.myapplication.ui.seasons.SeasonsActivity.Companion.startSeasonsActivity
import com.example.myapplication.ui.quiz.QuizQuestionActivity.Companion.startQuizActivity

class ChoosePathViewModel : BaseViewModel() {

}

class ChoosePathActivity : BaseActivity<ChoosePathViewModel, ActivityChoosePathBinding>(
    ChoosePathViewModel::class
) {
    override fun getViewBinding(): ActivityChoosePathBinding = ActivityChoosePathBinding.inflate(layoutInflater)

    override fun setupViews() {
        binding.ibEpisodes.setOnClickListener { startSeasonsActivity(this) }
        binding.ibQuiz.setOnClickListener { startQuizActivity(this) }
    }

    override fun subscribeToLiveData() { }

    companion object {
        fun startActivity(activity: Activity) {
            val intent = Intent(activity, ChoosePathActivity::class.java)
            activity.startActivity(intent)
        }
    }

}