package com.example.examen_romeramparo_parcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1: Button = findViewById(R.id.btn_tabla)
        val btn2: Button = findViewById(R.id.btn_prom)

        btn1.setOnClickListener {
            val intent: Intent = Intent(this, Multiply_View:: class.java)
            startActivity(intent)
        }

        btn2.setOnClickListener {
            val intent: Intent = Intent(this, Prom_View:: class.java)
            startActivity(intent)
        }

    }
}