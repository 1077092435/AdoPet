package com.example.adopet

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_perfil)


        val adopcionButton = findViewById<Button>(R.id.buttonAdopcion)

        adopcionButton.setOnClickListener {

            //Logica de conexion validacion con la base de datos

            //Logica para acceder al perfil


            adopcionButton.setOnClickListener {
                val intent: Intent = Intent(this, AdopcionActivity::class.java)
                startActivity(intent)
            }

        }


    }
}