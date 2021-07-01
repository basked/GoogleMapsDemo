package misc

import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng

class Locations {
    companion object {
        val BAZA = LatLng(52.59076104575863, 24.482613224410304)
        val MAX_21 = LatLng(52.07182491406979, 23.70828332807074)
        val MAX_21_3D = CameraPosition.builder().target(MAX_21).zoom(17f).bearing(100f).tilt(45f).build()
    }
}