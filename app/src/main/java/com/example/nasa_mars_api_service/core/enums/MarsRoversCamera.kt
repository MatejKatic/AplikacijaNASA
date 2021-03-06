package com.example.nasa_mars_api_service.core.enums


enum class MarsRoversCamera(val fullName: String) {
    FHAZ("Front Hazard Avoidance Camera"),
    RHAZ("Rear Hazard Avoidance Camera"),
    MAST("Mast Camera"),
    CHEMCAM("Chemistry and Camera Complex"),
    MAHLI("Mars Hand Lens Imager"),
    MARDI("Mars Descent Imager"),
    NAVCAM("Navigation Camera"),
    PANCAM("Panoramic Camera"),
    MINITES("Miniature Thermal Emission Spectrometer (Mini-TES)");

    companion object {
        fun getAvailableCamerasFromRover(rover: MarsRovers): List<MarsRoversCamera> {
            return when (rover) {
                MarsRovers.CURIOSITY -> listOf(
                        FHAZ,
                        RHAZ,
                        MAST,
                        CHEMCAM,
                        MAHLI,
                        MARDI,
                        NAVCAM
                )
                MarsRovers.SPIRIT -> listOf(
                        FHAZ,
                        RHAZ,
                        NAVCAM,
                        PANCAM,
                        MINITES
                )
                MarsRovers.OPPORTUNITY -> listOf(
                        FHAZ,
                        RHAZ,
                        NAVCAM,
                        PANCAM,
                        MINITES
                )
            }
        }
    }
}