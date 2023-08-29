package br.agk.ecomiles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.bumptech.glide.Glide

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main3)

        val listContainer = findViewById<LinearLayout>(R.id.listContainer)

        // Dados de exemplo para a lista
        val dataList = listOf(
            Quadruple("Novo Kindle 11ª Geração", "Marca: Amazon","https://m.media-amazon.com/images/I/71IMo1bzDRL._AC_SX679_.jpg", "1.000 milhas"),
            Quadruple("Título 2", "Descrição 2","https://images-na.ssl-images-amazon.com/images/G/32/kindle/journeys/PUx_1hPmoyVDyBdI/ZjUyYzMwYTEt-w372._SY232_CB598124054_.jpg", "500 milhas"),
            Quadruple("Título 3", "Descrição 3","https://images-na.ssl-images-amazon.com/images/G/32/br-events/2022/gateway/CategoryBubbleShoveler/XCM_CUTTLE_ORIGIN_1442798_2419248_400x400_2X_pt_BR_Version_1._CB633595703_.png", "1.000 milhas")
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

