package com.example.adopet

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.Firebase
import com.google.firebase.database.FirebaseDatabase

class AdopcionActivity : AppCompatActivity() {



    private val database = FirebaseDatabase.getInstance().reference.child("formularios")
    private lateinit var nombreEditText: EditText
    private lateinit var edadEditText: EditText
    private lateinit var motivoAdopcionEditText: EditText
    private lateinit var enviarFormularioButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adopcion)

        nombreEditText = findViewById<EditText>(R.id.editTextNombre)
        edadEditText = findViewById<EditText>(R.id.editTextEdad)
        motivoAdopcionEditText = findViewById<EditText>(R.id.editTextMotivoAdopcion)

        enviarFormularioButton = findViewById<Button>(R.id.buttonEnviarFormulario)

        enviarFormularioButton.setOnClickListener {
            val nombre = nombreEditText.text.toString()
            val edad = edadEditText.text.toString()
            val motivo = motivoAdopcionEditText.text.toString()
            //Logica de conexion validacion con la base de datos

            val formularioId =  database.push().key
            if(formularioId != null){
                val formulario = Formulario(formularioId,nombre,edad,motivo)
                database.child(formularioId).setValue(formulario)
            }

            //Logica para enviar los datos a la base de datos
            val button = findViewById<Button>(R.id.buttonEnviarFormulario)

            button.setOnClickListener {
                val intent: Intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            }

        }
    }
}