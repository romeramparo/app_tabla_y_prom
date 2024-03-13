package com.example.examen_romeramparo_parcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


//Romer Samil Amparo Garcia 2021-2208
class Prom_View : AppCompatActivity() {

    private lateinit var num1EditText: EditText
    private lateinit var num2EditText: EditText
    private lateinit var num3EditText: EditText
    private lateinit var numMayorTextView: TextView
    private lateinit var numMenorTextView: TextView
    private lateinit var promedioTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prom_view)

        val btn: Button = findViewById(R.id.inicio)
        btn.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity:: class.java)
            startActivity(intent)
        }
        num1EditText = findViewById(R.id.num_1)
        num2EditText = findViewById(R.id.num_2)
        num3EditText = findViewById(R.id.num_3)
        numMayorTextView = findViewById(R.id.num_mayor)
        numMenorTextView = findViewById(R.id.num_menor)
        promedioTextView = findViewById(R.id.prom_num)
        val btn_calcular_prom: Button = findViewById(R.id.btn_calcular_prom)

        btn_calcular_prom.setOnClickListener {
            calcularResultados()
        }

    }

    private fun calcularResultados(){

        val num1 = num1EditText.text.toString().toFloat()
        val num2 = num2EditText.text.toString().toFloat()
        val num3 = num3EditText.text.toString().toFloat()

        val numMayor = maxOf(num1, num2, num3)

        val numMenor = minOf(num1, num2, num3)

        val promedio = (num1 + num2 + num3) / 3

        numMayorTextView.text = "EL numro mayor es: $numMayor"
        numMenorTextView.text = "El numero menor es: $numMenor"
        promedioTextView.text = "El promedio de los numero es: $promedio"
    }
}

//Romer Samil Amparo Garcia 2021-2208
