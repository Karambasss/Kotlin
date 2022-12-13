package com.mywebsite.karambasss

import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_movie_details.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MovieDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details)
        activity_movie_details_overviewText.movementMethod = ScrollingMovementMethod()
        // Получение из MoviesActivity id фильма
        val itemId = intent.getIntExtra("id", 0)
        if (itemId == 0) Toast.makeText(this, "Не нашли такого фильма!", Toast.LENGTH_LONG).show()
        else{
            Toast.makeText(this, "Фильм найден!\nЕго id: $itemId", Toast.LENGTH_SHORT).show()
            val apiInterface = ApiInterface.create().getMovieById(itemId)

            apiInterface.enqueue(object : Callback<OneMovieData>{
                override fun onResponse(
                    call: Call<OneMovieData>,
                    response: Response<OneMovieData>
                ) {
                    val body = response.body()

                    activity_movie_details_label.text = body?.nameRu
                    Picasso.get().load(body?.posterUrl).resize(1500, 1600).into(activity_movie_details_imageView)
                    activity_movie_details_dateText.text = body?.year.toString()
                    activity_movie_details_scoreText.text = body?.ratingKinopoisk.toString()
                    activity_movie_details_overviewText.text = body?.description
                }
                override fun onFailure(call: Call<OneMovieData>, t: Throwable) {
                    Log.d("testLogs", "on Failure ${t?.message}")
                }
            })
        }


    }

}