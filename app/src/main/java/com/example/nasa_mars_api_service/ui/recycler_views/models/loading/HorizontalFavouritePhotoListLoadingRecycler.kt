package com.example.nasa_mars_api_service.ui.recycler_views.models.loading

import com.example.nasa_mars_api_service.ui.recycler_views.models.ListItem

data class HorizontalFavouritePhotoListLoadingRecycler(
        val title: String = "Title",
        val listOfItems: List<ListItem> = listOf()
): ListItem {
    override val idOfItem: Int
        get() = 2 * title.hashCode()
}
