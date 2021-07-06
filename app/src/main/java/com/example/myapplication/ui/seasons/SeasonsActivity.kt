package com.example.myapplication.ui.seasons

import android.content.Context
import android.content.Intent
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.base.BaseActivity
import com.example.myapplication.base.SeasonsEvent
import com.example.myapplication.data.model.Season
import com.example.myapplication.databinding.ActivitySeasonsListBinding
import com.example.myapplication.ui.episodes.EpisodeListActivity
import org.koin.androidx.viewmodel.ext.android.getViewModel


class SeasonsActivity : BaseActivity<SeasonsViewModel, ActivitySeasonsListBinding>(
    SeasonsViewModel::class
), SeasonClickListener {
    override fun getViewBinding(): ActivitySeasonsListBinding =
        ActivitySeasonsListBinding.inflate(layoutInflater)

    private lateinit var adapter: SeasonsAdapter

    override fun setupViews() {
        viewModel = getViewModel(clazz = SeasonsViewModel::class)
        viewModel.fetchSeason()
        setupAdapter()
    }

    private fun setupAdapter() {
        adapter = SeasonsAdapter(this)
        binding.rvPlayground.adapter = adapter
        binding.rvPlayground.layoutManager = LinearLayoutManager(this)
    }

    override fun subscribeToLiveData() {
        viewModel.event.observe(this, Observer {
            when (it) {
                is SeasonsEvent.SeasonsFetched -> {
                    adapter.addItems(it.array)
         //           binding.title = it.item.title
                }
            }
        })
    }

    companion object {
        fun startSeasonsActivity(activity: Context) {
            val intent = Intent(activity, SeasonsActivity::class.java)
            activity.startActivity(intent)
        }
    }

    override fun onItemClick(item: Season) {
        val intent = Intent(this, EpisodeListActivity::class.java)
        intent.putExtra("SEASON_ID", item.id)
        startActivity(intent)
    }
}