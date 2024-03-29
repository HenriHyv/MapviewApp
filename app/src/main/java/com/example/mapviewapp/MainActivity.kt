package com.example.mapviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment

class MainActivity : AppCompatActivity(), OnMapReadyCallback {
    //Muuttuja Google maps kartan säilyttämiseen
    private var googleMap: GoogleMap? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //etsii SupportMapFragmentin ja asettaa sen osaksi aktiviteettia
        val mapFragment = supportFragmentManager.findFragmentById(R.id.mapFragManager) as SupportMapFragment
        mapFragment.getMapAsync(this) // Kutsuu onMapReady-metodia, kun kartta on valmis
    }

    // Metodi, joka kutsutaan, kun kartta on valmis
    override fun onMapReady(googleMap: GoogleMap) {
        this.googleMap = googleMap // Tallentaa kartan muuttujaan
    }
}