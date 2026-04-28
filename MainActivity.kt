package com.example.distribuidoraalimentos

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailField = findViewById<EditText>(R.id.inputEmail)
        val passwordField = findViewById<EditText>(R.id.inputPassword)
        val loginButton = findViewById<Button>(R.id.btnLogin)

        loginButton.setOnClickListener {
            val email = emailField.text.toString()
            val password = passwordField.text.toString()

            if (email.isNotEmpty() && password.isNotEmpty()) {
                val latitudReferencia = -33.4489
                val resultadoRadianes = Math.toRadians(latitudReferencia)

                Log.d("S6_LOG", "Data: $resultadoRadianes")
                Toast.makeText(this, "Validando: $resultadoRadianes", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Error de validación", Toast.LENGTH_SHORT).show()
            }
        }
    }
    // Función para el cálculo de distancia según reglas de negocio (Radio 20km)
    private fun verificarRangoDespacho(latUsuario: Double, lonUsuario: Double) {
        val latDistribuidora = -33.4489 // Ejemplo: Santiago
        val lonDistribuidora = -70.6693

        val radioTierra = 6371.0
        val dLat = Math.toRadians(latUsuario - latDistribuidora)
        val dLon = Math.toRadians(lonUsuario - lonDistribuidora)

        val a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                Math.cos(Math.toRadians(latDistribuidora)) * Math.cos(Math.toRadians(latUsuario)) *
                Math.sin(dLon / 2) * Math.sin(dLon / 2)

        val c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a))
        val distancia = radioTierra * c

        // Aquí aplicamos la lógica del caso de la distribuidora
        if (distancia <= 20.0) {
            println("Despacho gratuito: Dentro del radio de 20km")
        } else {
            println("Aplica tarifa por kilómetro fuera de radio")
        }
    }
}