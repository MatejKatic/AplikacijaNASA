package com.example.nasa_mars_api_service

import android.content.Context
import android.content.Intent
import androidx.core.app.JobIntentService
import com.example.nasa_mars_api_service.api.NasaFetcher



private const val JOB_ID = 1
class NasaService : JobIntentService() {
    // bg metoda
    override fun onHandleWork(intent: Intent) {
        NasaFetcher(this).fetchItems()

    }

    companion object {
        fun enqueue(context: Context, intent: Intent) {
            enqueueWork(context, NasaService::class.java, JOB_ID, intent)
        }
    }
}