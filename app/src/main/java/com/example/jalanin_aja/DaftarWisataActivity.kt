package com.example.jalanin_aja

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.jalanin_aja.R


@Suppress("DEPRECATION")
class DaftarWisataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar_wisata)

        val wisata = intent.getParcelableExtra<Wisata>("wisata")
        if (wisata!= null){
            val textView : TextView = findViewById(R.id.DaftarWisataActivityTv)
            val imageView : ImageView = findViewById(R.id.DaftarWisataActivityIv)

            textView.text = wisata.name
            imageView.setImageResource(wisata.image)
        }


    }
}