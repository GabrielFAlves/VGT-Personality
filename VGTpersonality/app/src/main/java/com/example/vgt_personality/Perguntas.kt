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
            listOf("Equipe", "Escritório tradicional", "Prazos rígidos", "Manhã") -> "DEV Tradicional \uD83D\uDE10"
            listOf("Equipe", "Escritório tradicional", "Prazos rígidos", "Tarde") -> "DEV Tradicional \uD83D\uDE10"
            listOf("Equipe", "Escritório tradicional", "Prazos rígidos", "Noite") -> "DEV Tradicional \uD83D\uDE10"
            listOf("Equipe", "Escritório tradicional", "Prazos rígidos", "Madrugada") -> "DEV Tradicional \uD83D\uDE10"
            listOf("Equipe", "Escritório tradicional", "Prazos flexíveis", "Manhã") -> "DEV Tradicional \uD83D\uDE10"
            listOf("Equipe", "Escritório tradicional", "Prazos flexíveis", "Tarde") -> "DEV Tradicional \uD83D\uDE10"
            listOf("Equipe", "Escritório tradicional", "Prazos flexíveis", "Noite") -> "DEV Tradicional \uD83D\uDE10"
            listOf("Equipe", "Escritório tradicional", "Prazos flexíveis", "Madrugada") -> "DEV Tradicional \uD83D\uDE10"
            listOf("Equipe", "Home office", "Prazos rígidos", "Manhã") -> "DEV Commoditie"
            listOf("Equipe", "Home office", "Prazos rígidos", "Tarde") -> "DEV Commoditie"
            listOf("Equipe", "Home office", "Prazos rígidos", "Noite") -> "DEV Commoditie"
            listOf("Equipe", "Home office", "Prazos rígidos", "Madrugada") -> "DEV Commoditie"
            listOf("Equipe", "Home office", "Prazos flexíveis", "Manhã") -> "DEV Commoditie"
            listOf("Equipe", "Home office", "Prazos flexíveis", "Tarde") -> "DEV Commoditie"
            listOf("Equipe", "Home office", "Prazos flexíveis", "Noite") -> "DEV Commoditie"
            listOf("Equipe", "Home office", "Prazos flexíveis", "Madrugada") -> "DEV Commoditie"
            listOf("Equipe", "Espaço de coworking", "Prazos rígidos", "Manhã") -> "DEV Personnalite"
            listOf("Equipe", "Espaço de coworking", "Prazos rígidos", "Tarde") -> "DEV Personnalite"
            listOf("Equipe", "Espaço de coworking", "Prazos rígidos", "Noite") -> "DEV Personnalite"
            listOf("Equipe", "Espaço de coworking", "Prazos rígidos", "Madrugada") -> "DEV Personnalite"
            listOf("Equipe", "Espaço de coworking", "Prazos flexíveis", "Manhã") -> "DEV Personnalite"
            listOf("Equipe", "Espaço de coworking", "Prazos flexíveis", "Tarde") -> "DEV Personnalite"
            listOf("Equipe", "Espaço de coworking", "Prazos flexíveis", "Noite") -> "DEV Personnalite"
            listOf("Equipe", "Espaço de coworking", "Prazos flexíveis", "Madrugada") -> "DEV Personnalite"
            listOf("Individualmente", "Escritório tradicional", "Prazos rígidos", "Manhã") -> "DEV FullSterco"
            listOf("Individualmente", "Escritório tradicional", "Prazos rígidos", "Tarde") -> "DEV FullSterco"
            listOf("Individualmente", "Escritório tradicional", "Prazos rígidos", "Noite") -> "DEV FullSterco"
            listOf("Individualmente", "Escritório tradicional", "Prazos rígidos", "Madrugada") -> "DEV FullSterco"
            listOf("Individualmente", "Escritório tradicional", "Prazos flexíveis", "Manhã") -> "DEV FullSterco"
            listOf("Individualmente", "Escritório tradicional", "Prazos flexíveis", "Tarde") -> "DEV FullSterco"
            listOf("Individualmente", "Escritório tradicional", "Prazos flexíveis", "Noite") -> "DEV FullSterco"
            listOf("Individualmente", "Escritório tradicional", "Prazos flexíveis", "Madrugada") -> "DEV FullSterco"
            listOf("Individualmente", "Home office", "Prazos rígidos", "Manhã") -> "Tech Lead"
            listOf("Individualmente", "Home office", "Prazos rígidos", "Tarde") -> "Tech Lead"
            listOf("Individualmente", "Home office", "Prazos rígidos", "Noite") -> "Tech Lead"
            listOf("Individualmente", "Home office", "Prazos rígidos", "Madrugada") -> "Tech Lead"
            listOf("Individualmente", "Home office", "Prazos flexíveis", "Manhã") -> "Tech Lead"
            listOf("Individualmente", "Home office", "Prazos flexíveis", "Tarde") -> "Tech Lead"
            listOf("Individualmente", "Home office", "Prazos flexíveis", "Noite") -> "Tech Lead"
            listOf("Individualmente", "Home office", "Prazos flexíveis", "Madrugada") -> "Tech Lead"
            listOf("Individualmente", "Espaço de coworking", "Prazos rígidos", "Manhã") -> "DEV Lobo Solitário! AAAAUUUUUUUUUU!!!"
            listOf("Individualmente", "Espaço de coworking", "Prazos rígidos", "Tarde") -> "DEV Lobo Solitário! AAAAUUUUUUUUUU!!!"
            listOf("Individualmente", "Espaço de coworking", "Prazos rígidos", "Noite") -> "DEV Lobo Solitário! AAAAUUUUUUUUUU!!!"
            listOf("Individualmente", "Espaço de coworking", "Prazos rígidos", "Madrugada") -> "DEV Lobo Solitário! AAAAUUUUUUUUUU!!!"
            listOf("Individualmente", "Espaço de coworking", "Prazos flexíveis", "Manhã") -> "DEV Lobo Solitário! AAAAUUUUUUUUUU!!!"
            listOf("Individualmente", "Espaço de coworking", "Prazos flexíveis", "Tarde") -> "DEV Lobo Solitário! AAAAUUUUUUUUUU!!!"
            listOf("Individualmente", "Espaço de coworking", "Prazos flexíveis", "Noite") -> "DEV Lobo Solitário! AAAAUUUUUUUUUU!!!"
            listOf("Individualmente", "Espaço de coworking", "Prazos flexíveis", "Madrugada") -> "DEV Lobo Solitário! AAAAUUUUUUUUUU!!!"
            else -> "Resultado Padrão" // Resultado padrão se nenhuma combinação for encontrada
        }
    }
}
