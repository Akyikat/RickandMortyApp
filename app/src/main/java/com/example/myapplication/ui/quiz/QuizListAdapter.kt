package com.example.myapplication.ui.quiz

import android.view.LayoutInflater
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.myapplication.databinding.ItemQuizContainerBinding
import com.example.myapplication.ui.main.BaseAdapter
import com.example.myapplication.ui.main.BaseViewHolder

class QuizListAdapter(private var listener: ClickListener): BaseAdapter() {

    var quizList = mutableListOf<Tests>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        val binding = ItemQuizContainerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return  QuizListViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return quizList.size
    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        setupQuizListViewHolder(holder as QuizListViewHolder, position)
    }

    private fun setupQuizListViewHolder(holder: QuizListViewHolder, position: Int) {
        val item = quizList[position]
        holder.bind(item)
        holder.itemView.setOnClickListener {
            listener.onItemClick(item)
        }
    }

    fun addItems(items: MutableList<Tests>) {
        quizList = items
        notifyDataSetChanged()
    }

}

interface ClickListener {
    fun onItemClick(item: Tests)
}

class QuizListViewHolder(var binding: ItemQuizContainerBinding): BaseViewHolder(binding.root){
    fun bind(item: Tests) {
        binding.description.text = item.title

        Glide.with(binding.ivQuizContainer.context)
            .load(item.image)
            .into(binding.ivQuizContainer)
    }


}
