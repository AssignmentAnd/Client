package com.biraj.playme.Fragments

import androidx.fragment.app.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.biraj.playme.R

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class AboutUsFragments : Fragment() {
       private val callback = OnMapReadyCallback { googleMap ->
       val ArtistChaiyoo = LatLng(27.7172335,85.3151957)
           googleMap.addMarker(MarkerOptions().position(ArtistChaiyoo).title("PlayME"))
           googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(ArtistChaiyoo, 15F),4000,null)
           googleMap.uiSettings.isZoomControlsEnabled=true


    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_about_us_fragments,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mapFragment=childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment?.getMapAsync(callback)
    }

}