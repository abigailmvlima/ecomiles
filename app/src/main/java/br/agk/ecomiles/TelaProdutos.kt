package br.agk.ecomiles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.bumptech.glide.Glide

class TelaProdutos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_telaprodutos)

        val listContainer = findViewById<LinearLayout>(R.id.listContainer)

        // Dados de exemplo para a lista
        val dataList = listOf(
            Quadruple("Novo Kindle 11ª Geração", "Marca: Amazon","https://m.media-amazon.com/images/I/71IMo1bzDRL._AC_SX679_.jpg", "1.000 milhas"),
            Quadruple("Echo (4ª Geração)", "Marca: Amazon","https://mobilestore.ec/wp-content/uploads/2021/01/Alexa-Echo-Dot-4ta-Gen-Azul-Mobile-Store-Ecuador.png", "5.000 milhas"),
            Quadruple("Lâmpada Inteligente Smart Color", "Marca:Elgin","https://m.media-amazon.com/images/I/616vj2QtAEL._AC_SL1500_.jpg", "800 milhas")
        )

        // Adiciona itens à lista dinamicamente
        for (item in dataList) {
            val itemView = layoutInflater.inflate(R.layout.list_item, listContainer, false)
            val titleTextView = itemView.findViewById<TextView>(R.id.titleTextView)
            val descTextView = itemView.findViewById<TextView>(R.id.descTextView)
            val itemImageView = itemView.findViewById<ImageView>(R.id.itemImageView)
            val milhasTextView = itemView.findViewById<TextView>(R.id.milhasTextView)

            titleTextView.text = item.first
            descTextView.text = item.second
            milhasTextView.text = item.fourth

            // Carregar a imagem usando a biblioteca Glide (é necessário adicionar a dependência no build.gradle)
            Glide.with(this)
                .load(item.third)
                .placeholder(R.drawable.placeholder_image)
                .into(itemImageView)

            listContainer.addView(itemView)
        }
    }
}

