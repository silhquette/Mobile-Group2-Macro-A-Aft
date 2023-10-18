package com.example.jalanin_aja

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.jalanin_aja.databinding.ActivityFoodListBinding

class FoodListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFoodListBinding
    private lateinit var foodArrayList: ArrayList<Foods>
    lateinit var cardImage: Array<Int>
    lateinit var cardName: Array<String>
    lateinit var cardAddress: Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFoodListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        cardImage = arrayOf(
            R.drawable.makanan1,
            R.drawable.makanan2,
            R.drawable.makanan3,
        )

        cardName = arrayOf(
            "Mie Aceh Cabang Satu",
            "Ayam Tangkap Pak Asep",
            "Mie Aceh tidak bernama",
        )

        cardAddress = arrayOf(
            "Jl. T. Panglima Polem No.81, Peunayong, Kusalam, Kota Banda Aceh",
            "Jl. T. Panglima Polem No.82, Peunayong, Kusalam, Kota Banda Aceh",
            "Jl. T. Panglima Polem No.83, Peunayong, Kusalam, Kota Banda Aceh",
        )

        binding.rvFood.layoutManager = GridLayoutManager(this, 2)
        foodArrayList = arrayListOf<Foods>()
        getFoodsData()
    }

    private fun getFoodsData() {
        for (i in cardImage.indices) {
            val foods = Foods(cardImage[i], cardName[i], cardAddress[i])
            foodArrayList.add(foods)
        }
        binding.rvFood.adapter = FoodAdapter(foodArrayList)
    }
}