package com.mywebsite.karambasss.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mywebsite.karambasss.*
import com.mywebsite.karambasss.viewModel.MoviesViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MoviesActivity : AppCompatActivity() {

    private lateinit var mViewModel : MoviesViewModel

    // private val name : String by lazy { getName } // можем геттер поставить (Прикольный способ, чтобы инициализировать поле без lateinit

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movies)

        mViewModel = MoviesViewModel()

        val result = mViewModel.getMovies()

        // getting the recyclerview by its id
        val recyclerview = findViewById<RecyclerView>(R.id.movies_activity_recyclerView)

        // this creates a GridLayoutManager
        recyclerview.layoutManager = GridLayoutManager(this,2) // сколько плиток в ряду

        val apiInterface = ApiInterface.create().getMovies()

        // Посылаем запрос
        //apiInterface.enqueue( Callback<List<Movie>>())
        apiInterface.enqueue( object : Callback<MoviesData>, CustomAdapter.ItemClickListener { // Callback обратный ответ c web-сервера
            // OnResponse - успешный ответ
            override fun onResponse(call: Call<MoviesData>?, response: Response<MoviesData>?) {
                Log.d("testLogs", "on Response Success ${response?.body()?.items}")

                // This will pass the ArrayList to our Adapter
                val adapter = CustomAdapter(response?.body()?.items, this)

                // Setting the Adapter with the recyclerview
                recyclerview.adapter = adapter

            }
            // onFailure - ошибочный ответ
            override fun onFailure(call: Call<MoviesData>?, t: Throwable?) {
                Log.d("testLogs", "on Failure ${t?.message}")
            }

            override fun onItemClick(id: Int) {
                // Toast.makeText(this@MoviesActivity, "Ячейка с id = $id нажата!", Toast.LENGTH_SHORT).show()

                val intent = Intent(this@MoviesActivity, MovieDetailsActivity::class.java)
                intent.putExtra("id", id) // посылаем в MovieDetailsActivity полученный id фильма
                startActivity(intent)
            }
        })

    }
    override fun onBackPressed() {
        super.onBackPressed()
        this.finishAffinity()
    }
}