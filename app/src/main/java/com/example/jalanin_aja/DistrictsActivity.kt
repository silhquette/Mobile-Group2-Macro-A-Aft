package com.example.jalanin_aja

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.jalanin_aja.databinding.ActivityDistrictsBinding
import com.example.jalanin_aja.databinding.ActivityFoodListBinding

class DistrictsActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityDistrictsBinding
    private lateinit var districtArrayList: ArrayList<District>
    private lateinit var districtAdapter: DistrictAdapter
    private lateinit var recyclerView: RecyclerView
    lateinit var cardImage: Array<Int>
    lateinit var cardName: Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDistrictsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // button click
        binding.btnBack.setOnClickListener(this)

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
            "Kalimantan Utara",
            "Jawa Barat",
            "Jawa Timur",
            "Kalimantan TImur",
            "Bali",
            "Papua",
        )

        districtArrayList= arrayListOf<District>()
        recyclerView =findViewById(R.id.rv_district)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        getDistricsData()

        districtAdapter = DistrictAdapter(districtArrayList)
        recyclerView.adapter = districtAdapter

        districtAdapter.onItemClick = {
            val intent = Intent(this, FoodListActivity::class.java)
            startActivity(intent)
        }
    }

    private fun getDistricsData() {
        for (i in cardImage.indices) {
            val districts = District(cardImage[i], cardName[i])
            districtArrayList.add(districts)
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