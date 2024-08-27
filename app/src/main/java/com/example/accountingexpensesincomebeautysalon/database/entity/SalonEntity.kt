package com.example.accountingexpensesincomebeautysalon.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "authorization")
data class SalonEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val idSalon: String,
    val passwordSalon:String
)
