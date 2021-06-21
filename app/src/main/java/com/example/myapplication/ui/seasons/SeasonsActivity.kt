package com.example.myapplication.ui.seasons

import android.content.Context
import android.content.Intent
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.base.BaseActivity
import com.example.myapplication.base.BaseViewModel
import com.example.myapplication.data.model.getVideo
import com.example.myapplication.databinding.ActivitySeasonsBinding

class SeasonsViewModel : BaseViewModel() {

}
class SeasonsActivity : BaseActivity<SeasonsViewModel, ActivitySeasonsBinding>(
    SeasonsViewModel::class
) {
    override fun getViewBinding(): ActivitySeasonsBinding = ActivitySeasonsBinding.inflate(layoutInflater)

    private lateinit var adapter: SeasonsAdapter

    override fun setupViews() {
        setupAdapter()
    }

    private fun setupAdapter() {
        adapter = SeasonsAdapter()
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        adapter.addItems(getVideo())
    }

    override fun subscribeToLiveData() { }

    companion object {
        fun startSeasonsActivity(activity: Context) {
            val intent = Intent(activity, SeasonsActivity::class.java)
            activity.startActivity(intent)
        }
    }
}