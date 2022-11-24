package com.neon.notesapp.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes")
data class Notes(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "title") var title:String,
    @ColumnInfo(name = "sub_title") var subtitle: String,
    @ColumnInfo(name = "date_time") var dateTime: String,
    @ColumnInfo(name = "description") var description: String,
    @ColumnInfo(name = "img_url") var imgUrl: String,
    @ColumnInfo(name = "web_url") var webUrl: String,
    @ColumnInfo(name = "color") var color: String,

): java.io.Serializable {
    override fun toString(): String {
        return "$title: $dateTime"
    }
}
