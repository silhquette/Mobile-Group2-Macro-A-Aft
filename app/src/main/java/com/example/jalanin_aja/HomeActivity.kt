package com.example.jalanin_aja

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.jalanin_aja.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    private lateinit var nearbyArrayList: ArrayList<NearbySpots>
    private lateinit var nearbyCardImage: Array<Int>
    lateinit var nearbyCardTitle: Array<String>
    lateinit var nearbyCardBody: Array<String>
    lateinit var nearbyCardDistance: Array<String>
    private lateinit var popularArrayList: ArrayList<PopularSpots>
    private lateinit var popularCardImage: Array<Int>
    lateinit var popularCardTitle: Array<String>
    lateinit var popularCardLocation: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Vertical Scrollview
        nearbyCardImage = arrayOf(
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
        )

        nearbyCardTitle = arrayOf(
            "Judul Wisata 1",
            "Judul Wisata 2",
            "Judul Wisata 3",
            "Judul Wisata 4",
            "Judul Wisata 1",
            "Judul Wisata 2",
            "Judul Wisata 3",
            "Judul Wisata 4",
        )

        nearbyCardBody = arrayOf(
            "Donec commodo scelerisque consectetur. Donec vitae purus.",
            "Donec commodo scelerisque consectetur. Donec vitae purus.",
            "Donec commodo scelerisque consectetur. Donec vitae purus.",
            "Donec commodo scelerisque consectetur. Donec vitae purus.",
            "Donec commodo scelerisque consectetur. Donec vitae purus.",
            "Donec commodo scelerisque consectetur. Donec vitae purus.",
            "Donec commodo scelerisque consectetur. Donec vitae purus.",
            "Donec commodo scelerisque consectetur. Donec vitae purus.",
        )

        nearbyCardDistance = arrayOf(
            "Distance - 400KM",
            "Distance - 400KM",
            "Distance - 400KM",
            "Distance - 400KM",
            "Distance - 400KM",
            "Distance - 400KM",
            "Distance - 400KM",
            "Distance - 400KM",
        )

        binding.rvNearby.layoutManager = LinearLayoutManager(this)

        nearbyArrayList = arrayListOf<NearbySpots>()
        getNearbyData()

        // horizontal Scrollview
        popularCardImage = arrayOf(
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.a,
            R.drawable.b,
        )

        popularCardTitle = arrayOf(
            "Judul Wisata 1",
            "Judul Wisata 2",
            "Judul Wisata 3",
            "Judul Wisata 4",
            "Judul Wisata 1",
            "Judul Wisata 2",
        )

        popularCardLocation = arrayOf(
            "Yogyakarta",
            "Yogyakarta",
            "Yogyakarta",
            "Yogyakarta",
            "Yogyakarta",
            "Yogyakarta",
        )

        binding.rvPopular.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        popularArrayList = arrayListOf<PopularSpots>()
        getPopularData()
    }

    private fun getPopularData() {
        for (i in popularCardImage.indices) {
            val spots = PopularSpots(popularCardImage[i], popularCardTitle[i], popularCardLocation[i])
            popularArrayList.add(spots)
        }
        binding.rvPopular.adapter = PopularSpotAdapter(popularArrayList)
    }

    private fun getNearbyData() {
        for (i in nearbyCardImage.indices) {
            val spots = NearbySpots(nearbyCardImage[i], nearbyCardTitle[i], nearbyCardBody[i], nearbyCardDistance[i])
            nearbyArrayList.add(spots)
        }
        binding.rvNearby.adapter = NearbySpotAdapter(nearbyArrayList)

    }
}
