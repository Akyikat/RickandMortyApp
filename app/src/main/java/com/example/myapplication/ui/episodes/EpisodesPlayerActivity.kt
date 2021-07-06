package com.example.myapplication.ui.episodes

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.provider.MediaStore
import android.support.v4.media.session.MediaSessionCompat
import android.support.v4.media.session.PlaybackStateCompat
import com.example.myapplication.R
import com.example.myapplication.base.BaseActivity
import com.example.myapplication.base.BaseViewModel
import com.example.myapplication.data.model.Episode
import com.example.myapplication.databinding.ActivityEpisodesPlayerBinding
import com.example.myapplication.ui.quiz.ClickListener
import com.example.myapplication.ui.quiz.QuizListActivity
import com.example.myapplication.ui.quiz.QuizQuestionActivity
import com.example.myapplication.ui.quiz.Tests
import com.google.android.exoplayer2.*
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory
import com.google.android.exoplayer2.source.ExtractorMediaSource
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory
import com.google.android.exoplayer2.upstream.DefaultHttpDataSource
import com.google.android.exoplayer2.upstream.DefaultHttpDataSourceFactory
import com.google.android.exoplayer2.util.Util

//class EpisodesPlayerActivity : BaseActivity<BaseViewModel, ActivityEpisodesPlayerBinding>(
//    BaseViewModel::class)
//{
//
//    override fun getViewBinding() = ActivityEpisodesPlayerBinding.inflate(layoutInflater)
//
//    private lateinit var exoMediaPlayer: ExoPlayer              // exo плеер
//    private lateinit var mediaSession: MediaSessionCompat
//    private lateinit var stateBuilder: PlaybackStateCompat.Builder
//
//    override fun setupViews() {
//        initExoPlayer()
//
//        play("https://drive.google.com/file/d/1j0KLej8InlHAEd5lKaRdIRmR-Dg2Z8_N/view")
//    }
//
//    private fun initExoPlayer() {  // pleer это контейнер который внутри себя хранит exoMediaPlayer который воспроизводит видео
//        binding.player.player = initialize()
//    }
//
//    private fun initialize(): ExoPlayer {
//        initializePlayer()                  //инициализация плеера
//        initializeMediaSession()            //метод управления плеером
//        return exoMediaPlayer
//    }
//
//    private fun initializePlayer() {                           // инициализация exo player
//        val trackSelector = DefaultTrackSelector()             // обрабатывает аудио потока
//        val loadControl = DefaultLoadControl()                 // контроль загрузки видео
//        val renderersFactory = DefaultRenderersFactory(applicationContext) // обработка видео потока
//        exoMediaPlayer =
//            ExoPlayerFactory.newSimpleInstance(renderersFactory, trackSelector, loadControl)
//    }
//
//    private fun initializeMediaSession() { // MediaSession управляет плеером
//        mediaSession = MediaSessionCompat(applicationContext, "sadasdasd")
//        mediaSession.setFlags(
//            MediaSessionCompat.FLAG_HANDLES_MEDIA_BUTTONS or
//                    MediaSessionCompat.FLAG_HANDLES_TRANSPORT_CONTROLS
//        )
//        mediaSession.setMediaButtonReceiver(null)
//
//        stateBuilder = PlaybackStateCompat.Builder()
//            .setActions(
//                PlaybackStateCompat.ACTION_PLAY or
//                        PlaybackStateCompat.ACTION_PAUSE or
//                        PlaybackStateCompat.ACTION_PLAY_PAUSE or
//                        PlaybackStateCompat.ACTION_FAST_FORWARD or
//                        PlaybackStateCompat.ACTION_REWIND
//            )
//
//        mediaSession.setPlaybackState(stateBuilder.build())
//
//        mediaSession.setCallback(SessionCallback())
//
//        mediaSession.isActive = true
//    }
//
//    private inner class SessionCallback : MediaSessionCompat.Callback() {
//
//        private val SEEK_WINDOW_MILLIS = 1_000
//
//        override fun onPlay() {
//            exoMediaPlayer.playWhenReady = true
//        }
//
//        override fun onPause() {
//            exoMediaPlayer.playWhenReady = false
//        }
//
//        override fun onRewind() {
//            exoMediaPlayer.seekTo(exoMediaPlayer.currentPosition - SEEK_WINDOW_MILLIS)
//        }
//
//        override fun onFastForward() {
//            exoMediaPlayer.seekTo(exoMediaPlayer.currentPosition + SEEK_WINDOW_MILLIS)
//        }
//    }
//
//    private fun play(url: String) {
//
//        val userAgent = Util.getUserAgent(
//            applicationContext,
//            applicationContext.getString(R.string.app_name)
//        )
//
//        val httpDataSourceFactory = DefaultHttpDataSourceFactory(
//            userAgent,
//            null /* listener */,
//            DefaultHttpDataSource.DEFAULT_CONNECT_TIMEOUT_MILLIS,
//            DefaultHttpDataSource.DEFAULT_READ_TIMEOUT_MILLIS,
//            true /* allowCrossProtocolRedirects */
//        )
//
//        val mediaSource = ExtractorMediaSource.Factory(
//            DefaultDataSourceFactory(
//                applicationContext,
//                null,
//                httpDataSourceFactory
//            )
//        )
//            .setExtractorsFactory(DefaultExtractorsFactory())
//            .createMediaSource(Uri.parse(url))
//
//        exoMediaPlayer.prepare(mediaSource)
//
//        exoMediaPlayer.playWhenReady = true
//    }
//
//    companion object {
//        fun startEpisodesPlayerActivity(activity: Activity) {
//            val intent = Intent(activity, EpisodesPlayerActivity::class.java)
//            activity.startActivity(intent)
//        }
//    }
//
//    override fun subscribeToLiveData() { }
//}