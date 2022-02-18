package com.example.nasa_mars_api_service.ui.recycler_views.models


data class LoadMoreMarsPhotos(
        val id: Int = -19
): ListItem {
    override val idOfItem: Int
        get() = id
}
