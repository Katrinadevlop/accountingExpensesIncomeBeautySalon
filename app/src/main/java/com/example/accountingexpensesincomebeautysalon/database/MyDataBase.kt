package com.example.accountingexpensesincomebeautysalon.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.accountingexpensesincomebeautysalon.database.dao.SalonDao
import com.example.accountingexpensesincomebeautysalon.database.entity.SalonEntity

@Database(entities = [SalonEntity::class], version = 1)
abstract class MyDataBase : RoomDatabase() {
    abstract fun authorizationDAO(): SalonDao

    companion object {
        @Volatile
        private var INSTANCE: MyDataBase? = null

        fun get(context: Context): MyDataBase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    MyDataBase::class.java,
                    "accountingExpensesIncomeBeautySalonDB1"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }

    abstract fun salonDao():SalonDao
}
