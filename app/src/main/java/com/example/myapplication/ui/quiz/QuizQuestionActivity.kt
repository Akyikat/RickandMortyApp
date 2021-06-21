package com.example.myapplication.ui.quiz

import android.app.Activity
import android.content.Intent
import android.util.Log
import com.example.myapplication.base.BaseActivity
import com.example.myapplication.databinding.ActivityQuizQuestionBinding

class QuizQuestionActivity : BaseActivity<QuizQuestionViewModel, ActivityQuizQuestionBinding>(
    QuizQuestionViewModel::class
) {
    override fun getViewBinding() = ActivityQuizQuestionBinding.inflate(layoutInflater)

    override fun setupViews() {
        val questionList = Constants.getQuestions()
        Log.i("Questions size", "${questionList.size}")

        val currentPosition = 1
        val question: Question? = questionList[currentPosition -1]
        binding.progressBar.progress = currentPosition
        binding.tvProgress.text = "$currentPosition" + "/" + binding.progressBar.max

        binding.tvQuestion.text = question!!.question
        binding.ivImage.setImageResource(question.image)
        binding.optionOne.text = question.optionOne
        binding.optionTwo.text = question.optionTwo
        binding.optionThree.text = question.optionThree
        binding.optionFour.text = question.optionFour
    }

    override fun subscribeToLiveData() {}

    companion object {
        fun startQuizActivity(activity: Activity) {
            val intent = Intent(activity, QuizQuestionActivity::class.java)
            activity.startActivity(intent)
        }
    }
}