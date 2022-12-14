package com.mywebsite.karambasss.model.repository

import com.mywebsite.karambasss.data.MoviesData
import com.mywebsite.karambasss.data.OneMovieData
import com.mywebsite.karambasss.model.apis.ApiInterface
import retrofit2.Call

class MoviesDBRepositoryImpl : MoviesDBRepository {

    private val apiInterface = ApiInterface.create()

    override fun getMovies(): Call<MoviesData> {
        return apiInterface.getMovies()
    }

    override fun getMovieById(id: Int): Call<OneMovieData> {
        return apiInterface.getMovieById(id)
    }


}