package com.example.myapplication.ui.episodes

import com.example.myapplication.base.BaseActivity
import com.example.myapplication.base.BaseViewModel
import com.example.myapplication.databinding.ActivityEpisodesBinding

class EpisodeViewModel : BaseViewModel() {

}
class EpisodesActivity : BaseActivity<EpisodeViewModel, ActivityEpisodesBinding>(
    EpisodeViewModel::class
) {
    override fun getViewBinding(): ActivityEpisodesBinding = ActivityEpisodesBinding.inflate(layoutInflater)

    override fun setupViews() {
        TODO("Not yet implemented")
    }

    override fun subscribeToLiveData() {
        TODO("Not yet implemented")
    }

}