package com.example.nasa_mars_api_service.ui.fragment.search_list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.nasa_mars_api_service.repository.interfaces.BaseRepository


class SearchListViewModelFactory(
        private val repository: BaseRepository
): ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SearchListViewModel::class.java)) {
            return SearchListViewModel(repository) as T
        }
        throw IllegalArgumentException("Unexpected View Model to create: $modelClass")
    }
}