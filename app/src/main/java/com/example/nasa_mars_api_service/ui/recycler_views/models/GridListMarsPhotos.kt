package com.example.nasa_mars_api_service.ui.recycler_views.models

import com.example.nasa_mars_api_service.core.models.MarsPhoto


data class GridListMarsPhotos(

        val title: String = "Title",

        val listOfPhotos: List<MarsPhoto> = listOf()

): ListItem {
    override val idOfItem: Int
        get() = title.hashCode()
}
