package com.example.appclasificacionedad

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
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

        var edadUsuario = findViewById<EditText>(R.id.edadUsuario)
        var btnEdad = findViewById<Button>(R.id.btnEdad)

        btnEdad.setOnClickListener {
            var edadEnInt = edadUsuario.text.toString().toInt()
            var clasificacion = when {
                edadEnInt < 13 -> "Eres un niño"
                edadEnInt in 13..17 -> "Eres un adolescente"
                edadEnInt >= 18 -> "Eres un adulto"
                else -> "Edad no válida"
            }

            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("clasificatoria", clasificacion)
            println(clasificacion)
            startActivity(intent)
        }
    }
}