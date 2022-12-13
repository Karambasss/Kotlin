package com.mywebsite.karambasss.viewModel

import com.mywebsite.karambasss.model.repository.MoviesDBRepository
import com.mywebsite.karambasss.model.repository.MoviesDBRepositoryImpl

class MoviesViewModel {

    private val mMoviesRepository : MoviesDBRepository = MoviesDBRepositoryImpl()

    fun getMovies() : String{
        return mMoviesRepository.getMovies()
    }


}