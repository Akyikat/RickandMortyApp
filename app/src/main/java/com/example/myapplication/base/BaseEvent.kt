package com.example.myapplication.base

import com.example.myapplication.data.model.Season

sealed class BaseEvent

sealed class SeasonsEvent : BaseEvent() {
    class SeasonsFetched(val array: MutableList<Season>) : SeasonsEvent()
}

sealed class EpisodesEvent : BaseEvent() {
    class EpisodeBySeasonsFetched(val array: MutableList<Season>): EpisodesEvent()
}