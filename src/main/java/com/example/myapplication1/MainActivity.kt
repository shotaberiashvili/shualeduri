package com.example.myapplication1

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun harry() {
        val i = Intent(applicationContext, Harry::class.java)
        startActivity(i)
    }

    fun hermione() {
        val i = Intent(applicationContext, Hermione::class.java)
        startActivity(i)
    }

    fun ron() {
        val i = Intent(applicationContext, Ron::class.java)
        startActivity(i)
    }
}