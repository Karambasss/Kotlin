package com.mywebsite.karambasss.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.mywebsite.karambasss.data.Item
import com.mywebsite.karambasss.data.MoviesData
import com.mywebsite.karambasss.data.OneMovieData
import com.mywebsite.karambasss.model.repository.MoviesDBRepository
import com.mywebsite.karambasss.model.repository.MoviesDBRepositoryImpl
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MoviesViewModel {

    private val _movies = MutableLiveData<List<Item>>()
    val movies : LiveData<List<Item>> = _movies

    private val _movieDetails = MutableLiveData<OneMovieData>()
    val movieDetails : LiveData<OneMovieData> = _movieDetails

    private val mMoviesRepository : MoviesDBRepository = MoviesDBRepositoryImpl()

    fun getMovies() {
        val result = mMoviesRepository.getMovies()
        result.enqueue(object : Callback<MoviesData>{
            override fun onResponse(call: Call<MoviesData>, response: Response<MoviesData>) {
                Log.d("testLogs", "on Response Success ${response.body()?.items}")
                _movies.postValue(response.body()?.items)
            }

            override fun onFailure(call: Call<MoviesData>, t: Throwable) {
                Log.d("testLogs", "on Failure ${t.message}")
            }
        })
    }

    fun getMovieById(id : Int){
        val result = mMoviesRepository.getMovieById(id)
        result.enqueue(object : Callback<OneMovieData>{
            override fun onResponse(call: Call<OneMovieData>, response: Response<OneMovieData>) {
                Log.d("testLogs", "on Response Success ${response.body()}")
                _movieDetails.postValue(response.body())
            }

            override fun onFailure(call: Call<OneMovieData>, t: Throwable) {
                Log.d("testLogs", "on Failure ${t.message}")
            }
        })
    }

}