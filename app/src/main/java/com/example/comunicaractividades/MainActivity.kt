package com.example.comunicaractividades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.comunicaractividades.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.Boton.setOnClickListener {
            var nombre = binding.Nombre.text.toString()
            var intent = Intent(this, Pantalla2::class.java)

            intent.putExtra("dato", nombre)

            startActivity(intent)
        }

        val extras = intent.extras
        val s = extras?.getString("dato")?: "error"

        binding.info.text = s
    }
}