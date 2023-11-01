package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var adapter: AnimeAdapter
    lateinit var recycler: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    private fun init() {
        recycler = binding.rvAnime
        adapter = AnimeAdapter()
        recycler.adapter = adapter
        adapter.setList(myUser())
    }

    fun myUser(): ArrayList<AnimeModel> {
        val animeList = ArrayList<AnimeModel>()

        val anime = AnimeModel("Маг целитель", "Одиночество на двоих")
        animeList.add(anime)

        val anime1 = AnimeModel("Маг целитель", "Одиночество на двоих")
        animeList.add(anime1)

        val anime2 = AnimeModel("Маг целитель", "Одиночество на двоих")
        animeList.add(anime2)

        val anime3 = AnimeModel("Маг целитель", "Одиночество на двоих")
        animeList.add(anime3)

        val anime4 = AnimeModel("Маг целитель", "Одиночество на двоих")
        animeList.add(anime4)

        return animeList
    }
}