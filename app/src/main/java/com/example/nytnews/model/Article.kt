package com.example.nytnews.model

data class Article(
    val title: String = "",
    val abstract: String = "",
    val fullArticleUrl: String = "",
    val author: String = "",
    val publishedDate: String = "",
    val mediaList: List<String> = listOf()
)