package com.example.myapplication.ui.seasons

import com.example.myapplication.base.BaseEvent
import com.example.myapplication.base.BaseViewModel
import com.example.myapplication.base.EpisodesEvent
import com.example.myapplication.base.SeasonsEvent
import com.example.myapplication.repository.SeasonsRepositoryImpl

class SeasonsViewModel(private val repository: SeasonsRepositoryImpl) : BaseViewModel<BaseEvent>() {

    fun fetchSeason() {
        loading.value = true
        disposable.add(
            repository.fetchSeason()
                .doOnTerminate { loading.value = false }
                .subscribe(
                    { event.value = SeasonsEvent.SeasonsFetched(it) },
                    { message.value = it.message })
        )
    }

    fun fetchEpisodes(id: Int) {
        loading.value = true
        disposable.add(
            repository.fetchEpisodes(id)
                .doOnTerminate { loading.value = false }
                .subscribe(
                    { event.value = EpisodesEvent.EpisodeBySeasonsFetched(it) },
                    { message.value = it.message })
        )
    }
}