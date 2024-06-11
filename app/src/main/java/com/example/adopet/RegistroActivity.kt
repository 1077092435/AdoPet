package com.example.adopet

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RegistroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)
        val emailEditText = findViewById<EditText>(R.id.editTextEmail)
        val passwordEditText = findViewById<EditText>(R.id.editTextPassword)
        val registroButton = findViewById<Button>(R.id.buttonRegistro)

        registroButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            //Logica para acceder al login
            val button = findViewById<Button>(R.id.buttonRegistro)

            button.setOnClickListener {
                val intent: Intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
            }

        }


    }
}