package com.cadastrousuario

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btLogin: Button = findViewById(R.id.btn_login)
        btLogin.setOnClickListener{
            exibirMenu()
        }
    }

    private fun exibirMenu() {
        val intent = Intent(this, Menu::class.java)
        startActivity(intent)

    }
}