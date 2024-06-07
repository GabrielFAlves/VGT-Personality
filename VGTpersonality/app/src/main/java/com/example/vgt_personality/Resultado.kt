package com.example.vgt_personality

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Resultado : AppCompatActivity() {

    private lateinit var textView_resultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        // Habilitar o layout para ser estendido até a borda da tela
        enableEdgeToEdge()

        // Inicializar a textView_resultado com o TextView do layout
        textView_resultado = findViewById(R.id.textView_resultado)

        // Obter o resultado da Intent
        val result = intent.getStringExtra("result")

        // Exibir o resultado na interface do usuário
        textView_resultado.text = result
    }
}
