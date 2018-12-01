package com.example.pengin.laday

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class PrevActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prev)
        supportActionBar?.hide()
    }
}
