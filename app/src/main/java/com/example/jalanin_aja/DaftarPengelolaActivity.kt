package com.example.jalanin_aja

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.jalanin_aja.databinding.ActivityDaftarpengelolaBinding

class DaftarPengelolaActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDaftarpengelolaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDaftarpengelolaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnDaftar.setOnClickListener {
            val intent = Intent(this@DaftarPengelolaActivity, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}