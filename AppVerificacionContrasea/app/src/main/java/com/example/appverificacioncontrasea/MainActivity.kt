package com.example.appverificacioncontrasea

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

        var contraseña = findViewById<EditText>(R.id.contraseña)
        var btnVerificar = findViewById<Button>(R.id.btnVerificar)

        btnVerificar.setOnClickListener {
            val esSegura = when {
                contraseña.length() >= 8 -> "Contraseña segura"
                else -> "Contraseña débil"
            }
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("nivelSeguridad", esSegura)
            startActivity(intent)

        }
    }
}