package com.example.appevaluacionnumero

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.graphics.Color
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var numeroIngresado = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val tipoDeNumero = findViewById<TextView>(R.id.tipoDeNumero)
        val btnEvaluar = findViewById<Button>(R.id.btnEvaluar)
        val inputUsuario = findViewById<EditText>(R.id.inputNumber)

        btnEvaluar.setOnClickListener {
            var numeroIngresado = inputUsuario.text.toString().toInt()
            if (numeroIngresado > 0){
                tipoDeNumero.text = "positivo"
                tipoDeNumero.setTextColor(Color.GREEN)
            }else if (numeroIngresado < 0){
                tipoDeNumero.text = "negativo"
                tipoDeNumero.setTextColor(Color.RED)
            }else if(numeroIngresado == 0){
                tipoDeNumero.text = "Igual a cero"
                tipoDeNumero.setTextColor(Color.BLUE)
            }else{
                tipoDeNumero.text = "Input no valido"
            }
        }

    }
}