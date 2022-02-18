package com.example.nasa_mars_api_service.ui.recycler_views.models.loading

import com.example.nasa_mars_api_service.ui.recycler_views.models.ListItem


data class GridListLoadingMarsPhotos(
        val title: String = "Title Loading",

        val listOfPhotos: List<ListItem> = listOf()
): ListItem {
    override val idOfItem: Int
        get() = title.hashCode() * 2
}
