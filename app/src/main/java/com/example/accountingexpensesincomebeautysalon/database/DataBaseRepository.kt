package com.example.accountingexpensesincomebeautysalon.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.accountingexpensesincomebeautysalon.database.entity.SalonEntity

@Dao
interface DataBaseRepository {
    @Query("SELECT * FROM authorization")
    fun getAll(): List<SalonEntity>

    @Insert
    fun insert(authorization: SalonEntity)

}
