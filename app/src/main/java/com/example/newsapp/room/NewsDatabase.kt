package com.example.newsapp.room

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.newsapp.model.Article

@Database(entities = [Article::class], version = 1)
@TypeConverters(NewsConverter::class)
abstract class NewsDatabase : RoomDatabase(){
    abstract fun newsDao() : NewsDao
}