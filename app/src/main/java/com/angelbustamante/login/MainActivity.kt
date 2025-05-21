package com.angelbustamante.login

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val user = findViewById<EditText>(R.id.user)
        val pass = findViewById<EditText>(R.id.password)

        val result = findViewById<TextView>(R.id.result)

        val btnLogin = findViewById<Button>(R.id.button)
        btnLogin.setOnClickListener{
            if(user.toString() == "Admin" && pass.toString() == "12345"){
                result.text = "Sesión iniciada"
            }else{
                result.text = "Sesión denegada"
            }


        }
    }
}