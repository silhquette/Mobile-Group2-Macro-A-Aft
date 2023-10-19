package com.example.jalanin_aja

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.jalanin_aja.R

class DaftarProvinsiActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var wisataList: ArrayList<Wisata>
    private lateinit var wisataAdapter: WisataAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar_provinsi)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        wisataList = ArrayList()

        wisataList.add(Wisata(R.drawable.aceh, "Nanggroe Aceh Darussalam"))
        wisataList.add(Wisata(R.drawable.sumatera_utara, "Sumatera Utara"))
        wisataList.add(Wisata(R.drawable.kalimantan_timur, "Kalimantan Timur"))
        wisataList.add(Wisata(R.drawable.kalimantan_selatan, "Kalimantan Selatan"))
        wisataList.add(Wisata(R.drawable.jawa_tengah, "Jawa Tengah"))
        wisataList.add(Wisata(R.drawable.jawa_barat, "Jawa Barat"))

        wisataAdapter = WisataAdapter(wisataList)
        recyclerView.adapter = wisataAdapter

        wisataAdapter.onItemClick = {
            val intent = Intent(this, DaftarWisataActivity::class.java)
            intent.putExtra("wisata", it)
            startActivity(intent)
        }
    }
}