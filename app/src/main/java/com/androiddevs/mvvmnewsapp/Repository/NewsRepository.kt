package com.androiddevs.mvvmnewsapp.Repository


import com.androiddevs.mvvmnewsapp.api.RetrofitInstance
import com.androiddevs.mvvmnewsapp.db.ArticleDatabase
import com.androiddevs.mvvmnewsapp.models.Article

class NewsRepository(
    val db:ArticleDatabase
) {
    suspend fun getBreakingNews(countrycode:String,pageNumber: Int)= RetrofitInstance.api.getBreakingNews(countrycode,pageNumber)

    suspend fun searchnews(searchQuery: String, pageNumber: Int) =RetrofitInstance.api.searchfornews(searchQuery,pageNumber)

    suspend fun upsert(article: Article) =db.getArticleDao().upsert(article)

    fun getSavednews() =db.getArticleDao().getAllArticles()

    suspend fun deletArticle(article:Article) =db.getArticleDao().deleteArticle(article)

}