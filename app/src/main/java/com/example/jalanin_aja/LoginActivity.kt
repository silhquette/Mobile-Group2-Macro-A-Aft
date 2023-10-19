package com.example.jalanin_aja

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.jalanin_aja.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnMasuk.setOnClickListener(this)
        binding.daftarWisatawan.setOnClickListener(this)
        binding.daftarPengelola.setOnClickListener(this)

    }


    /** Called when the user taps the Send button */
    fun sendMessage(view: View) {
        // Do something in response to button
    }

    override fun onClick(v: View) {

        when (v.id) {
            R.id.btn_masuk -> {
                val intent = Intent(this@LoginActivity, HomeActivity::class.java)
                startActivity(intent)
            }
            R.id.daftar_wisatawan -> {
                val intent = Intent(this@LoginActivity, DaftarActivity::class.java)
                startActivity(intent)
            }
            R.id.daftar_pengelola -> {
                val intent = Intent(this@LoginActivity, DaftarPengelolaActivity::class.java)
                startActivity(intent)
            }
        }
    }

}
