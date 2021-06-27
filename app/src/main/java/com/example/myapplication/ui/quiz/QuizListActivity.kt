package com.example.myapplication.ui.quiz

import android.app.Activity
import android.content.Intent
import androidx.recyclerview.widget.GridLayoutManager
import com.example.myapplication.base.BaseActivity
import com.example.myapplication.databinding.ActivityQuizPlaygroundBinding
import com.example.myapplication.ui.quiz.Constants.getTests
import com.example.myapplication.utils.showToast


class QuizListActivity : BaseActivity<QuizQuestionViewModel, ActivityQuizPlaygroundBinding>(
    QuizQuestionViewModel::class
), ClickListener {
    override fun getViewBinding() = ActivityQuizPlaygroundBinding.inflate(layoutInflater)

    override fun setupViews() {
        photoArray()
        setupRecyclerView()

    }

    override fun subscribeToLiveData() {
    }

    private fun photoArray() {

    }

    private fun setupRecyclerView() {
        val adapter = QuizListAdapter(this)
        binding.rvPlayground.adapter = adapter
        binding.rvPlayground.layoutManager = GridLayoutManager(this, 2)
        adapter.addItems(getTests())

    }
    companion object {
        fun startQuizListActivity(activity: Activity) {
            val intent = Intent(activity, QuizListActivity::class.java)
            activity.startActivity(intent)
        }
    }

    override fun onItemClick(item: Tests) {
        QuizQuestionActivity.startQuizQuestionActivity(this, item.id)
    }
}