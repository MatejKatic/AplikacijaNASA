package com.example.nasa_mars_api_service.ui.recycler_views.models.loading

import com.example.nasa_mars_api_service.core.enums.PhotoTypes
import com.example.nasa_mars_api_service.ui.recycler_views.models.ListItem

data class FavouritePhotoLoadingListItem(
        val id: Int = 0,

        val typeOfPhoto: PhotoTypes = PhotoTypes.MARS_PHOTO,
): ListItem {
    override val idOfItem: Int
        get() = -30
}
