package com.example.myapplication.network

import com.example.myapplication.data.model.Episode
import com.example.myapplication.data.model.Season
import io.reactivex.Observable
import retrofit2.http.*

interface SeasonApi {

        @GET("api/seasons/")
        fun fetchSeasons(): Observable<MutableList<Season>>

        @GET("/api/seasons/{id}/")
        fun fetchEpisodes(@Path("id") id: Int): Observable<MutableList<Season>>

        @GET("/api/seasons/<season_id>/episode/{id}/")
        fun fetchEpisodeNumber(@Path("id") id: Int): Observable<MutableList<Episode>>

}