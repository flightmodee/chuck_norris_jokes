package com.example.project

import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import android.os.Bundle
import com.example.project.adapter.JokeAdapter
import io.reactivex.Single
import io.reactivex.rxkotlin.subscribeBy

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Version 1 de l'application
        val adapterList = mutableListOf<Joke>()
        JokeList.list.forEach { joke ->
            val j = Joke(value = joke)
            adapterList.add(j)
        }
        recyclerView.adapter = JokeAdapter(adapterList)

        val jokeService:JokeApiService = JokeApiServiceFactory.createService()
        val joke: Single<Joke> = jokeService.giveMeAJoke()


    }
}