package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_subactivity.*
class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subactivity)
        GoToMain.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)


        }
    }
}

