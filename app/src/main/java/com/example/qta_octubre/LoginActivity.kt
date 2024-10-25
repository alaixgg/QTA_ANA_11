package com.example.qta_octubre

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        val btningresar = findViewById<Button>(R.id.btn_ingresar)


        btningresar.setOnClickListener{
            val intent = Intent(this,Inicio::class.java)
            startActivity(intent)
        }

    }
}