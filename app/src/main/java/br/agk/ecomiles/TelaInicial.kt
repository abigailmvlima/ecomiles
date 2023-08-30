package br.agk.ecomiles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TelaInicial : AppCompatActivity() {

    private lateinit var btentrar: Button  // Declaração da variável

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)

        btentrar = findViewById(R.id.btentrar)
        btentrar.setOnClickListener {
            val intent = Intent(this, TelaLogin::class.java)
            startActivity(intent)
        }
    }
}