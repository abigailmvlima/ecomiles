package br.agk.ecomiles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import br.agk.ecomiles.R

class MainActivity : AppCompatActivity() {

    private lateinit var bt2: Button  // Declaração da variável

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)

        bt2 = findViewById(R.id.bt2)
        bt2.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}