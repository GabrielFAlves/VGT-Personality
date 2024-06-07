package com.example.vgt_personality

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class Perguntas : AppCompatActivity() {

    private lateinit var button_tela_resultado: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perguntas)

        button_tela_resultado = findViewById(R.id.button_tela_resultado)

        button_tela_resultado.setOnClickListener {
            val result = calculateResult()
            val intent = Intent(this, Resultado::class.java)
            intent.putExtra("result", result)
            startActivity(intent)
        }
    }

    private fun calculateResult(): String {
        val radioGroups = listOf(
            findViewById<RadioGroup>(R.id.radioGroup1),
            findViewById<RadioGroup>(R.id.radioGroup2),
            findViewById<RadioGroup>(R.id.radioGroup3),
            findViewById<RadioGroup>(R.id.radioGroup4)
        )

        val userSelections = radioGroups.map { radioGroup ->
            findViewById<RadioButton>(radioGroup.checkedRadioButtonId).text.toString()
        }

        return when (userSelections) {
            listOf("Equipe", "Escritório tradicional", "Prazos rígidos", "Manhã") -> "Desenvolvedor Tradicional"
            listOf("Equipe", "Escritório tradicional", "Prazos rígidos", "Tarde") -> "Desenvolvedor Tradicional"
            listOf("Equipe", "Escritório tradicional", "Prazos rígidos", "Noite") -> "Desenvolvedor Tradicional"
            listOf("Equipe", "Escritório tradicional", "Prazos rígidos", "Madrugada") -> "Desenvolvedor Tradicional"
            listOf("Equipe", "Escritório tradicional", "Prazos flexíveis", "Manhã") -> "Desenvolvedor Tradicional"
            listOf("Equipe", "Escritório tradicional", "Prazos flexíveis", "Tarde") -> "Desenvolvedor Tradicional"
            listOf("Equipe", "Escritório tradicional", "Prazos flexíveis", "Noite") -> "Desenvolvedor Tradicional"
            listOf("Equipe", "Escritório tradicional", "Prazos flexíveis", "Madrugada") -> "Desenvolvedor Tradicional"
            listOf("Equipe", "Home office", "Prazos rígidos", "Manhã") -> "Resultado 9"
            listOf("Equipe", "Home office", "Prazos rígidos", "Tarde") -> "Resultado 10"
            listOf("Equipe", "Home office", "Prazos rígidos", "Noite") -> "Resultado 11"
            listOf("Equipe", "Home office", "Prazos rígidos", "Madrugada") -> "Resultado 12"
            listOf("Equipe", "Home office", "Prazos flexíveis", "Manhã") -> "Resultado 13"
            listOf("Equipe", "Home office", "Prazos flexíveis", "Tarde") -> "Resultado 14"
            listOf("Equipe", "Home office", "Prazos flexíveis", "Noite") -> "Resultado 15"
            listOf("Equipe", "Home office", "Prazos flexíveis", "Madrugada") -> "Resultado 16"
            listOf("Equipe", "Espaço de coworking", "Prazos rígidos", "Manhã") -> "Resultado 17"
            listOf("Equipe", "Espaço de coworking", "Prazos rígidos", "Tarde") -> "Resultado 18"
            listOf("Equipe", "Espaço de coworking", "Prazos rígidos", "Noite") -> "Resultado 19"
            listOf("Equipe", "Espaço de coworking", "Prazos rígidos", "Madrugada") -> "Resultado 20"
            listOf("Equipe", "Espaço de coworking", "Prazos flexíveis", "Manhã") -> "Resultado 21"
            listOf("Equipe", "Espaço de coworking", "Prazos flexíveis", "Tarde") -> "Resultado 22"
            listOf("Equipe", "Espaço de coworking", "Prazos flexíveis", "Noite") -> "Resultado 23"
            listOf("Equipe", "Espaço de coworking", "Prazos flexíveis", "Madrugada") -> "Resultado 24"
            listOf("Individualmente", "Escritório tradicional", "Prazos rígidos", "Manhã") -> "Resultado 33"
            listOf("Individualmente", "Escritório tradicional", "Prazos rígidos", "Tarde") -> "Resultado 34"
            listOf("Individualmente", "Escritório tradicional", "Prazos rígidos", "Noite") -> "Resultado 35"
            listOf("Individualmente", "Escritório tradicional", "Prazos rígidos", "Madrugada") -> "Resultado 36"
            listOf("Individualmente", "Escritório tradicional", "Prazos flexíveis", "Manhã") -> "Resultado 37"
            listOf("Individualmente", "Escritório tradicional", "Prazos flexíveis", "Tarde") -> "Resultado 38"
            listOf("Individualmente", "Escritório tradicional", "Prazos flexíveis", "Noite") -> "Resultado 39"
            listOf("Individualmente", "Escritório tradicional", "Prazos flexíveis", "Madrugada") -> "Resultado 40"
            listOf("Individualmente", "Home office", "Prazos rígidos", "Manhã") -> "Resultado 41"
            listOf("Individualmente", "Home office", "Prazos rígidos", "Tarde") -> "Resultado 42"
            listOf("Individualmente", "Home office", "Prazos rígidos", "Noite") -> "Resultado 43"
            listOf("Individualmente", "Home office", "Prazos rígidos", "Madrugada") -> "Resultado 44"
            listOf("Individualmente", "Home office", "Prazos flexíveis", "Manhã") -> "Resultado 45"
            listOf("Individualmente", "Home office", "Prazos flexíveis", "Tarde") -> "Resultado 46"
            listOf("Individualmente", "Home office", "Prazos flexíveis", "Noite") -> "Resultado 47"
            listOf("Individualmente", "Home office", "Prazos flexíveis", "Madrugada") -> "Resultado 48"
            listOf("Individualmente", "Espaço de coworking", "Prazos rígidos", "Manhã") -> "Resultado 49"
            listOf("Individualmente", "Espaço de coworking", "Prazos rígidos", "Tarde") -> "Resultado 50"
            listOf("Individualmente", "Espaço de coworking", "Prazos rígidos", "Noite") -> "Resultado 51"
            listOf("Individualmente", "Espaço de coworking", "Prazos rígidos", "Madrugada") -> "Resultado 52"
            listOf("Individualmente", "Espaço de coworking", "Prazos flexíveis", "Manhã") -> "Resultado 53"
            listOf("Individualmente", "Espaço de coworking", "Prazos flexíveis", "Tarde") -> "Resultado 54"
            listOf("Individualmente", "Espaço de coworking", "Prazos flexíveis", "Noite") -> "Resultado 55"
            listOf("Individualmente", "Espaço de coworking", "Prazos flexíveis", "Madrugada") -> "Resultado 56"
            else -> "Resultado Padrão" // Resultado padrão se nenhuma combinação for encontrada
        }
    }
}
