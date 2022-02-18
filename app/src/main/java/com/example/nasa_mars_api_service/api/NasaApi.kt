package com.example.nasa_mars_api_service.api

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path


const val API_URL = "https://api.nasa.gov/planetary/"
interface NasaApi {
    @GET("apod?api_key=DEMO_KEY&count=50")
    fun fetchItems() : Call<List<NasaItem>>
}