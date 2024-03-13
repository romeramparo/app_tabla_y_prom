package com.example.examen_romeramparo_parcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.StringBuilder

//Romer amparo Garcia 2021-2208
class Multiply_View : AppCompatActivity() {


    private lateinit var num_tabla: EditText
    private lateinit var result_table: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multiply_view)

        val btn: Button = findViewById(R.id.btn_inicio)
        btn.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity:: class.java)
                startActivity(intent)
        }

        num_tabla = findViewById(R.id.num_tabla)
        result_table = findViewById(R.id.result_tabla)
        val calcular: Button = findViewById(R.id.btn_calcular)

        calcular.setOnClickListener {
            calcularTabla()


    }
}

    private fun calcularTabla(){
        val numero: Int = num_tabla.text.toString().toInt()

        val resultado = StringBuilder()

        for (i in 1..14){
            val multiplicacion = numero * i
            resultado.append("$numero x $i = $multiplicacion\n")
        }
        result_table.text = resultado.toString()
    }
}
//Romer Samil Amparo Garcia 2021-2208