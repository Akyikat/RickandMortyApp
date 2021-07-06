package com.example.myapplication.ui.episodes

import android.content.Intent
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.base.BaseActivity
import com.example.myapplication.base.EpisodesEvent
import com.example.myapplication.data.model.Episode
import com.example.myapplication.data.model.Season
import com.example.myapplication.databinding.ActivityEpisodeListBinding
import com.example.myapplication.ui.choose_path.ChoosePathActivity
import com.example.myapplication.ui.seasons.SeasonsAdapter
import com.example.myapplication.ui.seasons.SeasonsViewModel
import org.koin.androidx.viewmodel.ext.android.getViewModel

class EpisodeListActivity : BaseActivity<SeasonsViewModel, ActivityEpisodeListBinding>(
    SeasonsViewModel::class
) {
    override fun getViewBinding() = ActivityEpisodeListBinding.inflate(layoutInflater)

    private val adapter by lazy { SeasonsAdapter() {
        goToDetails(it)
    } }

    override fun setupViews() {
        viewModel = getViewModel(clazz = SeasonsViewModel::class)
        val id = intent.getIntExtra("SEASON_ID", 0)
        viewModel.fetchEpisodes(id)
        setupRecyclerView()
    }

    private fun setupRecyclerView(){
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL, false)
    }

    override fun subscribeToLiveData() {
        viewModel.event.observe(this, Observer {
            when(it) {
                is EpisodesEvent.EpisodeBySeasonsFetched -> {
                    adapter.addItems(it.array)
                }
            }
        })
    }
    private fun goToDetails(data: Season){
        val intent = Intent(this, ChoosePathActivity::class.java)
        intent.putExtra(SEASONS, data)
        startActivity(intent)
    }

    companion object{
        val SEASONS = "seasons"
    }
}