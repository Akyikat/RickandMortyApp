package com.example.myapplication.ui.quiz

import android.app.Activity
import android.app.AlertDialog
import android.content.Intent
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.fragment.app.DialogFragment
import com.example.myapplication.R
import com.example.myapplication.base.BaseActivity
import com.example.myapplication.databinding.ActivityQuizQuestionBinding
import com.example.myapplication.utils.showToast
import retrofit2.http.Body

class QuizQuestionActivity : BaseActivity<QuizQuestionViewModel, ActivityQuizQuestionBinding>(
    QuizQuestionViewModel::class
) {
    override fun getViewBinding() = ActivityQuizQuestionBinding.inflate(layoutInflater)
    class MyDialogFragment : DialogFragment() {}

    private var currentPosition = 0
    private val questionList = Constants.getQuestions()
    private var question: Question = updateCurrentQuestion()
    private var userAnswer: Int? = null
    private var countOfCorrectAnswer = 0

    val arrayBtn = mutableListOf<TextView>()

    private  fun resetAnswers() {
        arrayBtn.forEach {
            it.background = resources.getDrawable(R.drawable.btn_default_option)
        }
    }

    override fun setupViews() {
        updateQuestion()
        addButtonsToArray()
        clickOptionOne()
        clickOptionTwo()
        clickOptionThree()
        clickOptionFour()
        submit()
    }

    private fun addButtonsToArray() {
        arrayBtn.apply {
            add(binding.optionOne)
            add(binding.optionTwo)
            add(binding.optionThree)
            add(binding.optionFour)
        }
    }

    private fun submit() {
        binding.btnSubmit.setOnClickListener {
            resetAnswers()
            updateQuestion()
        }
    }

    private fun updateCurrentQuestion() = questionList[currentPosition]

    private fun updateQuestion() {
        if (userAnswer == question.correctAnswer) countOfCorrectAnswer++
        if (currentPosition == questionList.size) {
            showResultDialog()
            return
        }
        question = updateCurrentQuestion()
        binding.btnSubmit.isEnabled = false
        currentPosition++
        binding.progressBar.progress = currentPosition
        binding.tvProgress.text = "$currentPosition / ${binding.progressBar.max}"
        binding.tvQuestion.text = question.question
        binding.ivImage.setImageResource(question.image)
        binding.optionOne.text = question.optionOne
        binding.optionTwo.text = question.optionTwo
        binding.optionThree.text = question.optionThree
        binding.optionFour.text = question.optionFour
    }

    private fun clickOptionOne() {
        binding.optionOne.setOnClickListener {
            resetAnswers()
            binding.optionOne.background = resources.getDrawable(R.drawable.btn_selected_option)
            binding.btnSubmit.isEnabled = true
            userAnswer = 1
        }
    }

    private fun clickOptionTwo() {
        binding.optionTwo.setOnClickListener {
            resetAnswers()
            binding.optionTwo.background = resources.getDrawable(R.drawable.btn_selected_option)
            binding.btnSubmit.isEnabled = true
            userAnswer = 2
        }
    }

    private fun clickOptionThree() {
        binding.optionThree.setOnClickListener {
            resetAnswers()
            binding.optionThree.background = resources.getDrawable(R.drawable.btn_selected_option)
            binding.btnSubmit.isEnabled = true
            userAnswer = 3
        }
    }

    private fun clickOptionFour() {
        binding.optionFour.setOnClickListener {
            resetAnswers()
            binding.optionFour.background = resources.getDrawable(R.drawable.btn_selected_option)
            binding.btnSubmit.isEnabled = true
            userAnswer = 4
        }
    }

    private fun showResultDialog() {
        val alert = AlertDialog.Builder(this)
        val inflater = layoutInflater.inflate(R.layout.activity_result_dialog, null)
        alert.setView(inflater)
        val button : Button = inflater.findViewById(R.id.btn_finish)
        val body : TextView = inflater.findViewById(R.id.tvBody)
        val titleResult : TextView = inflater.findViewById(R.id.tvTitle)
        val description = when {
            countOfCorrectAnswer > 5 -> "WABBA LUBBA DUB DUB!\n" +
                    "WOW DUDE, YOU’RE you're \n" +
                    "a real fan of the show."
            countOfCorrectAnswer >= questionList.size -> "I have only one question...\n" +
                    "Did you write the script for the show?\n"
            else -> "I think you just heard about this show from your friends."
        }

        titleResult.text = "$countOfCorrectAnswer/${questionList.size}"
        body.text = description

        val dialog = alert.create()

        button.setOnClickListener {
            dialog.dismiss()
        }
        dialog.show()
    }

    override fun subscribeToLiveData() {}

    companion object {
        fun startQuizActivity(activity: Activity) {
            val intent = Intent(activity, QuizQuestionActivity::class.java)
            activity.startActivity(intent)
        }
    }
}