package br.agk.ecomiles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    private lateinit var btentrar: Button  // Declaração da variável
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main2)

        btentrar = findViewById(R.id.btentrar)
        btentrar.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }

        val linkcad = findViewById<TextView>(R.id.linkcad)

        // Configurar um link clicável no TextView
        linkcad.movementMethod = LinkMovementMethod.getInstance()

    }
}