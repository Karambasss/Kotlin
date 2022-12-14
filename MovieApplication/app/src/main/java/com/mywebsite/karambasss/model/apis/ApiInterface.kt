package com.mywebsite.karambasss.model.apis

import com.mywebsite.karambasss.data.MoviesData
import com.mywebsite.karambasss.data.OneMovieData
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path

interface ApiInterface {
    // делаем запрос
    @GET("api/v2.2/films?order=RATING&type=ALL&ratingFrom=8&ratingTo=10&yearFrom=2000&yearTo=2022&page=1")
    @Headers(
        "accept: application/json",
        "X-API-KEY: 60b4e2dc-4f51-48b6-81ac-b0ec78e88d22"
    )
    fun getMovies() : Call<MoviesData>  // возвращает данные MoviesData

    @GET("api/v2.2/films/{film_id}")
    @Headers(
        "accept: application/json",
        "X-API-KEY: 60b4e2dc-4f51-48b6-81ac-b0ec78e88d22"
    )
    fun getMovieById(@Path("film_id") film_id : Int?) : Call<OneMovieData>

    // удаленный доступ к коду
    companion object {
        // url к чему делаем запрос
        private var BASE_URL = "https://kinopoiskapiunofficial.tech/" // https://kinopoiskapiunofficial.tech/

        // инициализация самого retrofit builder
        fun create() : ApiInterface {

            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()
            return retrofit.create(ApiInterface::class.java)

        }
    }
}