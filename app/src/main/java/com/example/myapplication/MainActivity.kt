package com.example.myapplication
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*







public class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val CountingNum = findViewById<TextView>(R.id.CountingNum)
        val btn_event =findViewById<ImageButton>(R.id.addBtn)
        var count = 0

        SettingButton.setOnClickListener {
            val intent = Intent(this, SubActivity::class.java)
            startActivity(intent)
        }
        btn_event.setOnClickListener {
            count++
            CountingNum.text = count.toString()
        }
        }
    }


