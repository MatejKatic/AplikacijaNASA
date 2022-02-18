package com.example.nasa_mars_api_service.core.enums

import com.example.nasa_mars_api_service.network.MarsApiStatus


enum class MainListLoadingItemsTypes(val status: MarsApiStatus) {
    PICTURE_OF_DAY(MarsApiStatus.NOT_ACTIVE),
    FAVOURITES_PHOTOS(MarsApiStatus.NOT_ACTIVE),
    NEW_MARS_PHOTOS(MarsApiStatus.NOT_ACTIVE)
}