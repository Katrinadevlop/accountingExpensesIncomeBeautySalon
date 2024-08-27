package com.example.accountingexpensesincomebeautysalon.database.dao

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.accountingexpensesincomebeautysalon.database.entity.SalonEntity

interface SalonDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveSalon(salon: SalonEntity)

    @Query("SELECT * FROM authorization WHERE 'id'=:id")
    fun getByIdSalon(id:Int): SalonEntity?

    fun insert(authorization: SalonEntity) {}
}