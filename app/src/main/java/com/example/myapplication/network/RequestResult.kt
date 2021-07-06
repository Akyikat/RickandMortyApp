package com.example.myapplication.network

interface RequestResult {
    fun <S>onSuccess(result : S)
    fun onFailure(t: String?)
}