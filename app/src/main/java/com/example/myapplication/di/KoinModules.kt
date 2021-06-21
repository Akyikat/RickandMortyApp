package com.example.myapplication.di

import com.example.myapplication.base.BaseViewModel
import com.example.myapplication.ui.choose_path.ChoosePathViewModel
import com.example.myapplication.ui.splash.SplashViewModel
import com.example.myapplication.ui.welcome.WelcomeViewModel
import com.example.myapplication.ui.seasons.SeasonsViewModel
import com.example.myapplication.ui.quiz.QuizQuestionViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val viewModelModule = module {
    viewModel { SeasonsViewModel() }
    viewModel { SplashViewModel() }
    viewModel { WelcomeViewModel() }
    viewModel { QuizQuestionViewModel() }
    viewModel { BaseViewModel() }
    viewModel { ChoosePathViewModel() }
}

val repositoryModule = module {
//    factory { ProjectRepositorImpl(get()) }
//    factory { TaskRepositoryImpl(get()) }
}
//
val networkRepository = module {
//    single { RetrofitClient(get()) }
//    single { provideOkHttpClient(get()) }
//    single { provideHttpLoginingInterceptor() }
//    single { provideProjectApi(get()) }
//    single { provideTasksApi(get()) }
}


