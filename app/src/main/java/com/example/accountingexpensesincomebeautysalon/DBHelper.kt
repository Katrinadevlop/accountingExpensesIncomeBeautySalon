package com.example.accountingexpensesincomebeautysalon

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log

class DBHelper(context: Context, factory: SQLiteDatabase.CursorFactory?) :
    SQLiteOpenHelper(context, DATABASE_NAME, factory, DATABASE_VERSION) {

    override fun onCreate(db: SQLiteDatabase) {
        val createTable = ("CREATE TABLE " + TABLE_NAME + " ("
                + ID_COL + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + IDSALON_COL + " TEXT,"
                + PASSWORDSALON_COL + " TEXT)")
        db.execSQL(createTable)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS $TABLE_NAME")
        onCreate(db)
    }

    fun addName(idSalon: String, passwordSalon: String) {
        val values = ContentValues()
        values.put(IDSALON_COL, idSalon)
        values.put(PASSWORDSALON_COL, passwordSalon)
        val db = this.writableDatabase
        db.insert(TABLE_NAME, null, values)
        db.close()
    }

    fun getName(): Cursor? {
        val db = this.readableDatabase
        return db.rawQuery("SELECT * FROM authorization", null)
    }

    companion object {
        private const val DATABASE_NAME = "C:\\Users\\katya\\AndroidStudioProjects\\accountingExpensesIncomeBeautySalon\\app\\src\\main\\assets\\accountingExpensesIncomeBeautySalonDB.db"
        private const val DATABASE_VERSION = 1
        const val TABLE_NAME = "authorization"
        const val ID_COL = "id"
        const val IDSALON_COL = "id_salon"
        const val PASSWORDSALON_COL = "password"
    }
}
