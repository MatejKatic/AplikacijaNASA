package com.example.nasa_mars_api_service.ui.fragment.mars_photo_description

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.nasa_mars_api_service.repository.interfaces.BaseRepository


class MarsPhotoDescriptionViewModelFactory(
        private val repository: BaseRepository
): ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MarsPhotoDescriptionViewModel::class.java)) {
            return MarsPhotoDescriptionViewModel(repository) as T
        }
        throw IllegalArgumentException("Unexpected view model to create: $modelClass")
    }
}