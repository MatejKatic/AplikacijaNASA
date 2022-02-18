package com.example.nasa_mars_api_service.core.models

import android.os.Parcelable
import com.example.nasa_mars_api_service.core.enums.MarsDateTypes
import com.example.nasa_mars_api_service.core.enums.MarsRovers
import com.example.nasa_mars_api_service.core.enums.MarsRoversCamera
import kotlinx.android.parcel.Parcelize


@Parcelize
data class MarsPhotoToSearch(
        val dateType: MarsDateTypes = MarsDateTypes.MARS_SOL,
        val date: String = "1000",
        val rover: MarsRovers = MarsRovers.CURIOSITY,
        val camera: MarsRoversCamera = MarsRoversCamera.RHAZ
):Parcelable
