package com.example.myapplication.data.local

import android.content.Context
import android.content.SharedPreferences

object SharedPreference {

    private const val PREFERENCE_NAME = "FitnessPreference"
    private const val NAME = "NAME"

    private var preference: SharedPreferences? = null

    fun init(context: Context) {
        preference = context.getSharedPreferences(
            PREFERENCE_NAME, Context.MODE_PRIVATE
        )
    }

    fun setName(data: String) {
        preference?.edit()?.putString(
            NAME, data
        )?.apply()
    }

    fun getName(): String? {
        return preference?.getString(
            NAME, null
        )
    }
}