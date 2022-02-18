package com.example.nasa_mars_api_service.core.models

import android.content.Context
import javax.inject.Inject

class AndroidResourceProvider @Inject constructor(
    private val context: Context
): ResourceProvider {


    override fun string(id: Int): String {
        return context.resources.getString(id)
    }
}