package com.example.project

import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import android.os.Bundle
import android.util.Log
import com.example.project.adapter.JokeAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //displaying each joke on the Logcat
        JokeList.list.forEach { it ->
            Log.d(null, it)
        }

        recyclerView.adapter = JokeAdapter(JokeList.list)
    }
}