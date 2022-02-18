package com.example.nasa_mars_api_service.ui.fragment.search

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider


class SearchMarsPhotoViewModelFactory: ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SearchMarsPhotoViewModel::class.java)) {
            return SearchMarsPhotoViewModel() as T
        }
        throw IllegalArgumentException("Unexpected View Model: $modelClass")
    }
}