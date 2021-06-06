package com.loaner.mobile.store

import android.content.Context
import android.content.SharedPreferences

class Prefs(context: Context) {
    private var DB_NAME = "com.loaner.mobile.store"
    private var ALL_DETAILS_FILLED = "ALL_DETAILS_FILLED"


    private val preferences: SharedPreferences = context.getSharedPreferences(DB_NAME,Context.MODE_PRIVATE)

    var allDetailsFilled : Boolean?
        get() = preferences.getBoolean(ALL_DETAILS_FILLED, false)
        set(value) = preferences.edit().putBoolean(ALL_DETAILS_FILLED, value!!).apply()
}