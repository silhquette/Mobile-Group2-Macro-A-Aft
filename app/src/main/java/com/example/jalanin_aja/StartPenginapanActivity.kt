package com.example.jalanin_aja

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.jalanin_aja.databinding.ActivityStarpenginapanBinding
import com.example.jalanin_aja.databinding.ActivityWellcomeBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class StartPenginapanActivity: AppCompatActivity(),
    BottomNavigationView.OnNavigationItemSelectedListener {
    private lateinit var binding: ActivityStarpenginapanBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityStarpenginapanBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.bottomNavigationView.setOnNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.home -> {
                val intent = Intent(this@StartPenginapanActivity, HomeActivity::class.java)
                startActivity(intent)
                OnNavigationItemSelectedListener@ true
            }
            R.id.foods -> {
                val intent = Intent(this@StartPenginapanActivity, DistrictsActivity::class.java)
                startActivity(intent)
                OnNavigationItemSelectedListener@ true
            }
            R.id.hotels -> {
                val intent = Intent(this@StartPenginapanActivity, StartPenginapanActivity::class.java)
                startActivity(intent)
                OnNavigationItemSelectedListener@ true
            }
            else -> {
                val intent = Intent(this@StartPenginapanActivity, FoodDetailActivity::class.java)
                startActivity(intent)
                OnNavigationItemSelectedListener@ true
            }
        }
    }


}