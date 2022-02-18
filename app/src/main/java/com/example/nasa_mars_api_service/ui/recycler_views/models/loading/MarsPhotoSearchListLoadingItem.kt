package com.example.nasa_mars_api_service.ui.recycler_views.models.loading

import com.example.nasa_mars_api_service.ui.recycler_views.models.ListItem


data class MarsPhotoSearchListLoadingItem(
        val id: Int = 123
): ListItem {
    override val idOfItem: Int
        get() = id
}

