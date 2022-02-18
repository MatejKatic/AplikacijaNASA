package com.example.nasa_mars_api_service.core.models

import androidx.annotation.AnimatorRes
import androidx.annotation.StringRes


interface ResourceProvider {

    fun string(@StringRes id: Int): String

}