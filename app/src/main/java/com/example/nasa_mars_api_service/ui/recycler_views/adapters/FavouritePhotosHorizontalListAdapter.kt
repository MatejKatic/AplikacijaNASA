package com.example.nasa_mars_api_service.ui.recycler_views.adapters

import com.example.nasa_mars_api_service.core.models.FavouritePhoto
import com.example.nasa_mars_api_service.ui.recycler_views.call_backs.BaseDiffCallBack
import com.example.nasa_mars_api_service.ui.recycler_views.delegates.MainListDelegates
import com.example.nasa_mars_api_service.ui.recycler_views.models.ListItem
import com.hannesdorfmann.adapterdelegates4.AsyncListDifferDelegationAdapter


class FavouritePhotosHorizontalListAdapter(
        favouritePhotoHorizontalListItemClickListener: (FavouritePhoto) -> Unit,
        favouritePhotoHorizontalListItemLongClickListener: (FavouritePhoto) -> Unit,
        favouritePhotoHorizontalListItemDeleteFromFavouritesClickListener: (FavouritePhoto) -> Boolean
): AsyncListDifferDelegationAdapter<ListItem>(BaseDiffCallBack) {
    init {
        delegatesManager
            .addDelegate(MainListDelegates.favouritePhotosHorizontalListItemDelegate(favouritePhotoHorizontalListItemClickListener, favouritePhotoHorizontalListItemLongClickListener, favouritePhotoHorizontalListItemDeleteFromFavouritesClickListener))
    }
}