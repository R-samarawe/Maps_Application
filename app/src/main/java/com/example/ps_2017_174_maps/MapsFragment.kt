package com.example.ps_2017_174_maps

import androidx.fragment.app.Fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ps_2017_174_maps.Models.Places
import com.example.ps_2017_174_maps.Objects.ClassMaker

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsFragment : Fragment() {





    private val callback = OnMapReadyCallback { googleMap ->
        /**
         * Manipulates the map once available.
         * This callback is triggered when the map is ready to be used.
         * This is where we can add markers or lines, add listeners or move the camera.
         * In this case, we just add a marker near Sydney, Australia.
         * If Google Play services is not installed on the device, the user will be prompted to
         * install it inside the SupportMapFragment. This method will only be triggered once the
         * user has installed Google Play services and returned to the app.
         */
        //get the argument value passed by recycler view
        val argumentname  = arguments?.getInt("id")
        val idplace : Int? = argumentname
        val indexplace = idplace?.minus(1)

        //here 'id' is the passed argument value
        //get the relevennt data
        val places = ClassMaker()
        val fulllist=places.listsdata()

        val a = fulllist[indexplace!!].latitude
        val b = fulllist[indexplace].longitude
        val c = fulllist[indexplace].name

        //Log.i("*************", fulllist.toString())
        //Log.i("*************", a.toString())
        val place = LatLng(a , b)
        googleMap.setMinZoomPreference(17.0f)
        googleMap.addMarker(MarkerOptions().position(place).title(c))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(place))
    }



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_maps, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment?.getMapAsync(callback)




    }
}