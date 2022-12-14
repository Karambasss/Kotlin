package com.mywebsite.karambasss.view

import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.mywebsite.karambasss.R
import com.mywebsite.karambasss.data.OneMovieData
import com.mywebsite.karambasss.viewModel.MoviesViewModel
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_movie_details.*


class MovieDetailsActivity : AppCompatActivity() {

    private val mViewModel = MoviesViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details)
        val itemId = intent.getIntExtra("id", 0)
        checkMovieID(itemId)
    }

    private fun initViews() {
        activity_movie_details_overviewText.movementMethod = ScrollingMovementMethod()
    }

    private fun initObservers() {
        mViewModel.apply {
            movieDetails.observe(this@MovieDetailsActivity) {
                setMovieDetails(it)
            }
        }
    }

    private fun setMovieDetails(body: OneMovieData) {
        activity_movie_details_label.text = body.nameRu
        Picasso.get().load(body.posterUrl).resize(1500, 1600)
            .into(activity_movie_details_imageView)
        activity_movie_details_dateText.text = body.year.toString()
        activity_movie_details_scoreText.text = body.ratingKinopoisk.toString()
        activity_movie_details_overviewText.text = body.description ?: "Нет описания"
    }

    private fun checkMovieID(itemId: Int) {
        if (itemId == 0) Toast.makeText(this, "Не нашли такого фильма!", Toast.LENGTH_LONG).show()
        else {
            Toast.makeText(this, "Фильм найден!\nЕго id: $itemId", Toast.LENGTH_SHORT).show()
            initViews()
            initObservers()
            mViewModel.getMovieById(itemId)
        }
    }
}