package com.neon.notesapp.dao

import androidx.room.*
import com.neon.notesapp.entities.Notes

@Dao
interface NotesDao {
    @get: Query("SELECT * FROM notes ORDER BY id DESC")
    val allNotes: List<Notes>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertNote(note: Notes)

    @Delete
    fun deleteNote(note: Notes)
}