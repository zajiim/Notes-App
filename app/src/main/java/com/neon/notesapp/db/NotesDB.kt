package com.neon.notesapp.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.neon.notesapp.dao.NotesDao
import com.neon.notesapp.entities.Notes

@Database(entities = [Notes::class], version = 1, exportSchema = false)
abstract class NotesDB: RoomDatabase() {

    companion object {
        var notesDB: NotesDB? = null

        @Synchronized
        fun getDB(context: Context): NotesDB {
            if(notesDB == null) {
                notesDB = Room.databaseBuilder(context, NotesDB::class.java, "notes.db")
                    .build()

            }
            return  notesDB!!
        }

    }
    abstract fun noteDao(): NotesDao
}