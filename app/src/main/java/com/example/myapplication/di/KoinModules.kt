package com.example.myapplication.di

import com.example.myapplication.network.RetrofitClient
import com.example.myapplication.network.provideHttpLoginingInterceptor
import com.example.myapplication.network.provideOkHttpClient
import com.example.myapplication.network.provideSeasonApi
import com.example.myapplication.repository.SeasonsRepositoryImpl
import com.example.myapplication.ui.choose_path.ChoosePathViewModel
import com.example.myapplication.ui.splash.SplashViewModel
import com.example.myapplication.ui.welcome.WelcomeViewModel
import com.example.myapplication.ui.seasons.SeasonsViewModel
import com.example.myapplication.ui.quiz.QuizQuestionViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val viewModelModule = module {
    viewModel { SeasonsViewModel(get()) }
    viewModel { SplashViewModel() }
    viewModel { WelcomeViewModel() }
    viewModel { QuizQuestionViewModel() }
    viewModel { ChoosePathViewModel() }
}
val repositoryModule = module {
    factory { SeasonsRepositoryImpl(get()) }
}

val networkRepository = module {
    single { RetrofitClient(get()) }
    single { provideOkHttpClient(get()) }
    single { provideHttpLoginingInterceptor() }
    single { provideSeasonApi(get()) }
}


