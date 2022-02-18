package com.example.nasa_mars_api_service.ui.recycler_views.models


data class HorizontalFavouritePhotosListRecycler(
        val title: String = "Favourites Photos: ",
        val listOfItems: List<ListItem> = listOf()
): ListItem {
    override val idOfItem: Int
        get() = title.hashCode() - 2
}
