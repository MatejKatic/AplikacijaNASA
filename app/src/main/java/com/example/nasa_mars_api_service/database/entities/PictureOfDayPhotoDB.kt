package com.example.nasa_mars_api_service.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "picture_of_day_photo_table")
data class PictureOfDayPhotoDB(
        @PrimaryKey()
        val id: Int = 0,

        @ColumnInfo(name = "author")
        val author: String = "Matvey Popov",

        @ColumnInfo(name = "title")
        val title: String = "Title",

        @ColumnInfo(name = "description")
        val description: String = "Description",

        @ColumnInfo(name = "date")
        val date: String = "11.02.2002",

        @ColumnInfo(name = "is_favourite")
        val isFavourite: Boolean = false,

        @ColumnInfo(name = "image_src")
        val imageSrc: String = ""
)
