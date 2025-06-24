package com.example.appejemplouno

import android.os.Bundle
import android.widget.Button
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
        //------------------------------------------------------------------
        val txtSaludo= findViewById<TextView>(R.id.txtSaludo)
        val btnHola = findViewById<Button>(R.id.btnHola)
        val btnAdios = findViewById<Button>(R.id.btnAdios)
        cambioDeSaludo(txtSaludo,btnHola,btnAdios)
    }
    fun cambioDeSaludo(t: TextView,b1: Button, b2: Button){
        val saludoHola = "Bienvenido a mi App"
        val saludoAdios = "Fue un gusto conocerlo"

        //Click event-------
        b1.setOnClickListener {
            t.text = saludoHola
        }
        b2.setOnClickListener {
            t.text = saludoAdios
        }
    }
}