package com.example.jalanin_aja

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.jalanin_aja.databinding.ActivityDistrictsBinding
import com.example.jalanin_aja.databinding.ActivityFoodListBinding

class DistrictsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDistrictsBinding
    private lateinit var districtArrayList: ArrayList<District>
    lateinit var cardImage: Array<Int>
    lateinit var cardName: Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDistrictsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        cardImage = arrayOf(
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
        )

        cardName = arrayOf(
            "Kalimantan Selatan",
            "Daerah Istimewa Yogyakarta",
            "DKI Jakarta",
            "Kalimantan Selatan",
            "Daerah Istimewa Yogyakarta",
            "DKI Jakarta",
            "Kalimantan Selatan",
            "Daerah Istimewa Yogyakarta",
            "DKI Jakarta",
        )

        binding.rvDistrict.layoutManager = LinearLayoutManager(this)
        districtArrayList = arrayListOf<District>()
        getDistricsData()
    }

    private fun getDistricsData() {
        for (i in cardImage.indices) {
            val districts = District(cardImage[i], cardName[i])
            districtArrayList.add(districts)
        }
        binding.rvDistrict.adapter = DistrictAdapter(districtArrayList)
    }

}