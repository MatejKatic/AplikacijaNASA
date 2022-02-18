package com.example.nasa_mars_api_service

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.example.nasa_mars_api_service.framework.startActivity


class NasaReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        context.startActivity<HostActivity>()
    }
}