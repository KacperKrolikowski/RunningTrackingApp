package com.krolikowski.runningtrackingapp.db

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey

//Single run record model (in Room)

@Entity(tableName = "running_table")
data class Run(
    var img: Bitmap? = null,
    var timestamp: Long = 0L,
    var avgSpeedInKMH: Float = 0f,
    var distanceInMeters: Int = 0,
    var timeInMillis: Long = 0L,
    var caloriesBurned: Int = 0
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
}