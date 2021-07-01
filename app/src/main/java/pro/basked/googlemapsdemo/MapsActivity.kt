package pro.basked.googlemapsdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import pro.basked.googlemapsdemo.databinding.ActivityMapsBinding

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var map: GoogleMap
    private lateinit var binding: ActivityMapsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
                .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        map = googleMap

        // Add a marker in -=BAZA=- and move the camera
        val maxn21 = LatLng(52.07180453979972, 23.708294543817342)
        val baza = LatLng(52.590705, 24.482411)
        map.addMarker(MarkerOptions().position(maxn21).title("Махновича 21"))
        map.addMarker(MarkerOptions().position(baza).title("-=BAZA=-"))

        map.moveCamera(CameraUpdateFactory.newLatLngZoom(maxn21,17f))
        map.uiSettings.apply {
            isZoomControlsEnabled=true
//            isZoomGesturesEnabled =false
//            isScrollGesturesEnabled =false
            isMyLocationButtonEnabled=true
            isMapToolbarEnabled=true
            isCompassEnabled=true
        }
    }
}