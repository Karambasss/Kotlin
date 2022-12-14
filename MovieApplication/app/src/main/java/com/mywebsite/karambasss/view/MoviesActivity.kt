package com.mywebsite.karambasss.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mywebsite.karambasss.R
import com.mywebsite.karambasss.view.adapters.CustomAdapter
import com.mywebsite.karambasss.viewModel.MoviesViewModel

class MoviesActivity : AppCompatActivity(), CustomAdapter.ItemClickListener {

    private val mViewModel: MoviesViewModel = MoviesViewModel()

    private lateinit var mMoviesRecycler: RecyclerView

    private lateinit var mMoviesAdapter: CustomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movies)
        initViews()
        initObservers()
        mViewModel.getMovies()
    }

    private fun initViews() {
        mMoviesRecycler = findViewById(R.id.movies_activity_recyclerView)
        mMoviesRecycler.layoutManager = GridLayoutManager(this, 2) // сколько плиток в ряду
    }

    private fun initObservers() {
        mViewModel.apply {
            movies.observe(this@MoviesActivity) {
                mMoviesAdapter = CustomAdapter(it, this@MoviesActivity)
                mMoviesRecycler.adapter = mMoviesAdapter
            }
        }
    }

    override fun onItemClick(id: Int) {
        val intent = Intent(this@MoviesActivity, MovieDetailsActivity::class.java)
        intent.putExtra("id", id) // посылаем в MovieDetailsActivity полученный id фильма
        startActivity(intent)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        this.finishAffinity()
    }
}