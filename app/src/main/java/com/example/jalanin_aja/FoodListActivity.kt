package com.example.jalanin_aja

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import com.example.jalanin_aja.databinding.ActivityFoodListBinding

class FoodListActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityFoodListBinding
    private lateinit var foodAdapter: FoodAdapter
    private lateinit var foodArrayList: ArrayList<Foods>
    private lateinit var cardImage: Array<Int>
    private lateinit var cardName: Array<String>
    private lateinit var cardAddress: Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFoodListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        cardImage = arrayOf(
            R.drawable.makanan1,
            R.drawable.makanan2,
            R.drawable.makanan3,
            R.drawable.makanan1,
            R.drawable.makanan2,
            R.drawable.makanan3,
            R.drawable.makanan1,
            R.drawable.makanan2,
            R.drawable.makanan3,
            R.drawable.makanan1,
            R.drawable.makanan2,
            R.drawable.makanan3,
        )

        cardName = arrayOf(
            "Mie Aceh Cabang Satu",
            "Ayam Tangkap Pak Asep",
            "Mie Aceh tidak bernama",
            "Mie Aceh Cabang Satu",
            "Ayam Tangkap Pak Asep",
            "Mie Aceh tidak bernama",
            "Mie Aceh Cabang Satu",
            "Ayam Tangkap Pak Asep",
            "Mie Aceh tidak bernama",
            "Mie Aceh Cabang Satu",
            "Ayam Tangkap Pak Asep",
            "Mie Aceh tidak bernama",
        )

        cardAddress = arrayOf(
            "Jl. T. Panglima Polem No.81, Peunayong, Kusalam, Kota Banda Aceh",
            "Jl. T. Panglima Polem No.82, Peunayong, Kusalam, Kota Banda Aceh",
            "Jl. T. Panglima Polem No.83, Peunayong, Kusalam, Kota Banda Aceh",
            "Jl. T. Panglima Polem No.81, Peunayong, Kusalam, Kota Banda Aceh",
            "Jl. T. Panglima Polem No.82, Peunayong, Kusalam, Kota Banda Aceh",
            "Jl. T. Panglima Polem No.83, Peunayong, Kusalam, Kota Banda Aceh",
            "Jl. T. Panglima Polem No.81, Peunayong, Kusalam, Kota Banda Aceh",
            "Jl. T. Panglima Polem No.82, Peunayong, Kusalam, Kota Banda Aceh",
            "Jl. T. Panglima Polem No.83, Peunayong, Kusalam, Kota Banda Aceh",
            "Jl. T. Panglima Polem No.81, Peunayong, Kusalam, Kota Banda Aceh",
            "Jl. T. Panglima Polem No.82, Peunayong, Kusalam, Kota Banda Aceh",
            "Jl. T. Panglima Polem No.83, Peunayong, Kusalam, Kota Banda Aceh",
        )

        binding.rvFood.layoutManager = GridLayoutManager(this, 2)
        binding.rvFood.setHasFixedSize(true)
        foodArrayList = arrayListOf<Foods>()
        getFoodsData()
        foodAdapter = FoodAdapter(foodArrayList)
        binding.rvFood.adapter = foodAdapter
        foodAdapter.onItemClick = {
            val intent = Intent(this, FoodDetailActivity::class.java)
            startActivity(intent)
        }

        // button click
        binding.btnBack.setOnClickListener(this)

    }

    private fun getFoodsData() {
        for (i in cardImage.indices) {
            val foods = Foods(cardImage[i], cardName[i], cardAddress[i], 0)
            foodArrayList.add(foods)
        }
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_back -> {
                onBackPressed()
            }
        }
    }
}

