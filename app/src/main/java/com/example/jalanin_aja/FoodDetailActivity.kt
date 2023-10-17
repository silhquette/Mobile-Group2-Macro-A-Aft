package com.example.jalanin_aja

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.jalanin_aja.databinding.ActivityFoodDetailBinding

class FoodDetailActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityFoodDetailBinding
    private lateinit var menuArrayList: ArrayList<Foods>
    private lateinit var amenityArrayList: ArrayList<Amenities>
    private lateinit var amenity: Array<String>
    private lateinit var cardImage: Array<Int>
    private lateinit var cardName: Array<String>
    private lateinit var cardPrice: Array<Int>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFoodDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // menu recycler view
        cardImage = arrayOf(
            R.drawable.makanan1,
            R.drawable.makanan2,
            R.drawable.makanan3,
            R.drawable.makanan1,
            R.drawable.makanan2,
            R.drawable.makanan3,
        )

        cardName = arrayOf(
            "Mie Aceh Cabang Satu",
            "Ayam Tangkap Pak Asep Level 0",
            "Mie Aceh tidak bernama Level 0",
            "Mie Aceh Cabang Satu Level 1 + es teh manis",
            "Ayam Tangkap Pak Asep Level 1 + teh hangat",
            "Mie Aceh tidak bernama Level 1",
        )

        cardPrice = arrayOf(
            30000,
            34000,
            23000,
            42000,
            34000,
            23000,
        )

        binding.rvMenu.layoutManager = LinearLayoutManager(this)
        menuArrayList = arrayListOf<Foods>()
        getFoodData()

        // amenity recycler view
        amenity = arrayOf(
            "musholla",
            "wifi",
            "tempat parkir"
        )

        binding.rvAmenities.layoutManager = GridLayoutManager(this, 2)
        amenityArrayList = arrayListOf<Amenities>()
        getAmenitiesData()

        // button
        binding.btnBack.setOnClickListener(this)
    }

    private fun getAmenitiesData() {
        for (i in amenity.indices) {
            val amenity = Amenities(amenity[i])
            amenityArrayList.add(amenity)
        }
        binding.rvAmenities.adapter = AmenityAdapter(amenityArrayList)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_back -> {
                onBackPressed()
            }
        }
    }

    private fun getFoodData() {
        for (i in cardImage.indices) {
            val foods = Foods(cardImage[i], cardName[i], "", cardPrice[i])
            menuArrayList.add(foods)
        }
        binding.rvMenu.adapter = MenuAdapter(menuArrayList)
    }
}
