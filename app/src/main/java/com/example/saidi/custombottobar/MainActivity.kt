package com.example.saidi.custombottobar

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.widget.ImageButton
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fab: FloatingActionButton = findViewById(R.id.fab)
        fab.setOnClickListener {
            Toast.makeText(this, R.string.text_home, Toast.LENGTH_SHORT).show()
        }

        val fav: ImageButton = findViewById(R.id.btn_fav)
        fav.setOnClickListener {
            Toast.makeText(this, R.string.text_favorites, Toast.LENGTH_SHORT).show()
        }

        val music: ImageButton = findViewById(R.id.btn_music)
        music.setOnClickListener {
            Toast.makeText(this, R.string.text_music, Toast.LENGTH_SHORT).show()
        }
    }
}
