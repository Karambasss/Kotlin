package com.mywebsite.karambasss.data

import com.mywebsite.karambasss.data.Item

data class MoviesData(
    val items: List<Item>,
    val total: Int,
    val totalPages: Int
)