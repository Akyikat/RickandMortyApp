package com.example.myapplication.repository

import com.example.myapplication.data.model.Episode
import com.example.myapplication.data.model.Season
import com.example.myapplication.network.SeasonApi
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers


interface SeasonsRepository {
    fun fetchSeason(): Observable<MutableList<Season>>
    fun fetchEpisodes(id: Int): Observable<MutableList<Season>>
    fun fetchEpisodeNumber(id: Int): Observable<MutableList<Episode>>
}

class SeasonsRepositoryImpl(private val api: SeasonApi) : SeasonsRepository {
    override fun fetchSeason(): Observable<MutableList<Season>> {
        return api.fetchSeasons()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
    }

    override fun fetchEpisodes(id: Int): Observable<MutableList<Season>> {
        return api.fetchEpisodes(id)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
    }

    override fun fetchEpisodeNumber(id: Int): Observable<MutableList<Episode>> {
        return api.fetchEpisodeNumber(id)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
    }
}