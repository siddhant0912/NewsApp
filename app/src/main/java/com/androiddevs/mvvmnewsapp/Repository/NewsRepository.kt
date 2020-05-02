package com.androiddevs.mvvmnewsapp.Repository

import androidx.room.Query
import com.androiddevs.mvvmnewsapp.api.RetrofitInstance
import com.androiddevs.mvvmnewsapp.db.ArticleDatabase

class NewsRepository(
    val db:ArticleDatabase
) {
    suspend fun getBreakingNews(countrycode:String,pageNumber: Int)= RetrofitInstance.api.getBreakingNews(countrycode,pageNumber)

    suspend fun searchnews(searchQuery: String, pageNumber: Int) =RetrofitInstance.api.searchfornews(searchQuery,pageNumber)

}