package com.example.nasa_mars_api_service

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import com.example.nasa_mars_api_service.databinding.ActivitySplashScreenBinding
import com.example.nasa_mars_api_service.di.DI
import com.example.nasa_mars_api_service.di.components.DaggerAppComponent
import com.example.nasa_mars_api_service.framework.*
import com.example.nasa_mars_api_service.network.NetworkMonitor
import com.example.nasa_mars_api_service.ui.activity.MainActivity
import timber.log.Timber


private const val DELAY = 5000L
const val DATA_IMPORTED = "hr.algebra.nasa.data_imported"
class SplashScreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashScreenBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        startAnimations()
        redirect()
    }



    private fun startAnimations() {
        binding.ivSplash.startAnimation(R.anim.rotate)
        binding.tvSplash.startAnimation(R.anim.pulse)

    }

    private fun redirect() {
        if (getBooleanPreference(DATA_IMPORTED)) {
            callDelayed(DELAY) {startActivity<HostActivity>()}
        } else {
            if (isOnline()) {
                Intent(this, NasaService::class.java).apply {
                    NasaService.enqueue(
                        this@SplashScreenActivity,
                        this
                    )
                }

            } else {
                binding.tvSplash.text = getString(R.string.no_internet)
                callDelayed(DELAY) {finish()}
            }
        }
    }
}