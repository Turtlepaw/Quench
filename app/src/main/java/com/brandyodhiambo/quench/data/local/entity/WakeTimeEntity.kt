package com.brandyodhiambo.quench.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.brandyodhiambo.quench.utils.Constants.WAKE_TIME_TABLE

@Entity(tableName = WAKE_TIME_TABLE)
data class WakeTimeEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val hour: Int,
    val minute: Int,
    val ampm: String
)
