package com.example.nasa_mars_api_service.ui.recycler_views.call_backs

import androidx.recyclerview.widget.DiffUtil
import com.example.nasa_mars_api_service.ui.recycler_views.models.ListItem


object BaseDiffCallBack: DiffUtil.ItemCallback<ListItem>() {
    override fun areItemsTheSame(oldItem: ListItem, newItem: ListItem): Boolean {
        return oldItem.idOfItem == newItem.idOfItem
    }

    override fun areContentsTheSame(oldItem: ListItem, newItem: ListItem): Boolean {
        return oldItem.equals(newItem)
    }
}