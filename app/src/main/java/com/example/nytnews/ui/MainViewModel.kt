package com.example.nytnews.ui

import androidx.lifecycle.ViewModel
import com.example.nytnews.data.NYTApiInstance
import com.example.nytnews.model.Article
import com.example.nytnews.model.BookCategory
import com.example.nytnews.model.BookInfo

class MainViewModel : ViewModel() {

    val nytInstance = NYTApiInstance

    fun getBusinessArticle(): List<Article> {
        return nytInstance.businessArticleList
    }

    fun getAutomobileArticle(): List<Article> {
        return  nytInstance.autoMobileArticleList
    }

    fun getBookCategory(): List<BookCategory> {
        return nytInstance.bookCategoryDataSets
    }

    fun getBookInfo(): List<BookInfo> {
        return nytInstance.bookInfoList
    }

}