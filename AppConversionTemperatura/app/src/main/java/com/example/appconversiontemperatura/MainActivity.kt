package com.example.appconversiontemperatura

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var inputTemp = findViewById<EditText>(R.id.InputTemperatura)
        var btnCalcular = findViewById<Button>(R.id.btnCalcular)
        var textoConversion = findViewById<TextView>(R.id.textoConversion)

        btnCalcular.setOnClickListener {
            var tempActual = inputTemp.text.toString().toInt()
            var tempEnFar = (tempActual*9)/5+32
            textoConversion.text = "$tempEnFar Fahrenheit"
        }
    }
}