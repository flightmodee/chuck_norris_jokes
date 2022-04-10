package com.example.project

import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import android.os.Bundle
import com.example.project.adapter.JokeAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapterList = mutableListOf<Joke>()
        JokeList.list.forEach { joke ->
            val j = Joke(value = joke)
            adapterList.add(j)
        }
        recyclerView.adapter = JokeAdapter(adapterList)
    }
}