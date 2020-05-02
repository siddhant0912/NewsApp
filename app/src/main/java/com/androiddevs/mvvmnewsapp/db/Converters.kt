package com.androiddevs.mvvmnewsapp.db


import androidx.room.TypeConverter
import com.androiddevs.mvvmnewsapp.models.Source

class Converters {
    @TypeConverter
    fun Fromsource(source:Source ):String{
        return source.name

    }

    @TypeConverter
    fun ToSource(name:String):Source {
        return Source(name, name)
    }
}