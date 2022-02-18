package com.example.nasa_mars_api_service.preferences.interfaces

import android.content.SharedPreferences


interface BaseApplicationPreferences {

    fun getNumberOfFavouritePhotos(): Int
    fun getNumberOfAvailableMarsPhotos(): Int
    fun getNumberOfAvailableMarsPhotoPages(): Int
    fun getNumberOfAvailablePictureOfDayPhotos(): Int
    fun getNumberOfAvailableSearchMarsPhotoPages(): Int

    fun updateNumberOfFavouritePhotos(number: Int)
    fun updateNumberOfAvailableMarsPhotos(number: Int)
    fun updateNumberOfAvailableMarsPhotoPages(number: Int)
    fun updateNumberOfAvailablePictureOfDayPhotos(number: Int)
    fun updateNumberOfAvailableSearchMarsPhotoPages(number: Int)

}