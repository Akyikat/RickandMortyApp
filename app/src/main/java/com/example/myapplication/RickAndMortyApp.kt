package com.example.myapplication

import android.app.Application
import com.example.myapplication.data.local.SharedPreference
import com.example.myapplication.di.networkRepository
import com.example.myapplication.di.repositoryModule
import com.example.myapplication.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.loadKoinModules
import org.koin.core.context.startKoin

class RickAndMortyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        SharedPreference.init(applicationContext)
        startKoin{
            androidLogger()
            androidContext(this@RickAndMortyApp)
            inject()
        }
    }

    private fun inject() = loadKoinModules

    private val loadKoinModules by lazy {
        loadKoinModules(listOf(viewModelModule, repositoryModule, networkRepository))
    }
}

