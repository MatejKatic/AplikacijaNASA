package com.example.nasa_mars_api_service.ui.recycler_views.models

import com.example.nasa_mars_api_service.core.models.PictureOfDayPhoto


data class PictureOfDayItem(
        val title: String = "Picture of Day:",
        val picture: PictureOfDayPhoto = PictureOfDayPhoto()
): ListItem {
    override val idOfItem: Int
        get() = title.hashCode()
}