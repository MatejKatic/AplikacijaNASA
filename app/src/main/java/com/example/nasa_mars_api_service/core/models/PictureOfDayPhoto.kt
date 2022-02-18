package com.example.nasa_mars_api_service.core.models

import com.example.nasa_mars_api_service.ui.recycler_views.models.ListItem


data class PictureOfDayPhoto(
        val id: Int = 0,

        val author: String = "Matvey Popov",

        val title: String = "Tittle",

        val description: String = "Description",

        val date: String = "11.02.2002",

        val isFavourite: Boolean = false,

        val imageSrc: String = "",

): ListItem {
    override val idOfItem: Int
        get() = id
}
