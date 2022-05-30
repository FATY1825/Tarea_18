package com.example.tarea_18

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var boardList: List<Board>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        boardList = listOf(
            Board(
                font = R.color.purple_200,
                image = R.drawable.rand,
                title = "Fatima del Carmen Ayala Santos"

            ),
            Board(
                font = R.color.teal_200,
                image = R.drawable.rand,
                title = "Universidad Capitan General Gerardo Barrios"
            )

        )
        val adapter = ViewPagerAdapter(boardList)
        viewpag.adapter=adapter

        btnmap.setOnClickListener {
            val intent = Intent(this, MapsActivity::class.java).apply {

            }
            startActivity(intent)
        }

    }

}