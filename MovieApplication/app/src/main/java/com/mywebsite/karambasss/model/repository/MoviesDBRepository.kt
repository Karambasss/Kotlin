package com.mywebsite.karambasss.model.repository

import com.mywebsite.karambasss.data.MoviesData
import com.mywebsite.karambasss.data.OneMovieData
import retrofit2.Call

interface MoviesDBRepository {

    fun getMovies() : Call<MoviesData>

    fun getMovieById(id : Int) : Call<OneMovieData>

}