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
}