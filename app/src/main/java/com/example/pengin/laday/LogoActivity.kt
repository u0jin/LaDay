package com.example.pengin.laday

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class LogoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logo)
        supportActionBar?.hide()

        var intent = Intent(this, PrevActivity::class.java)
        startActivity(intent)

    }
}
