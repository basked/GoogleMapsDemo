package misc

import android.content.Context
import android.util.Log
import android.view.MenuItem
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.MapStyleOptions
import pro.basked.googlemapsdemo.R
import java.lang.Exception

class TypeAndStyle {
    fun setMapStyle(context: Context, googleMap: GoogleMap) {
        try {
            val success =
                googleMap.setMapStyle(MapStyleOptions.loadRawResourceStyle(context, R.raw.style))
            if (!success) {
                Log.d("Maps", "Failed to add style")
            }
        } catch (e: Exception) {
            Log.d("Maps", e.toString())
        }
    }
    fun setMapType(item: MenuItem, map: GoogleMap){
        when (item.itemId) {
            R.id.normal_map -> {
                map.mapType = GoogleMap.MAP_TYPE_NORMAL
            }
            R.id.hybrid_map -> {
                map.mapType = GoogleMap.MAP_TYPE_HYBRID
            }
            R.id.satellite_map -> {
                map.mapType = GoogleMap.MAP_TYPE_SATELLITE
            }
            R.id.terrain_map -> {
                map.mapType = GoogleMap.MAP_TYPE_TERRAIN
            }
            R.id.none_map -> {
                map.mapType = GoogleMap.MAP_TYPE_NONE
            }
            R.id.move_to_baza -> {
                map.moveCamera(CameraUpdateFactory.newCameraPosition(Locations.MAX_21_3D ))
            }
        }
    }
}