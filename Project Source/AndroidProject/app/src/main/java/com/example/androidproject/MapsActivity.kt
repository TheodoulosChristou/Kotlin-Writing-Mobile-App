package com.example.androidproject
import android.content.Intent
import android.content.pm.PackageManager
import android.location.Location
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Looper
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.google.android.gms.location.*
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.*
import kotlin.random.Random

/**
 * This class sets the google Maps API
 * I used resource from Google API and online video to do the coding part.
 * Resource:Kotlin Android Tutorial - Nearby Places part 1 : Setup Google Maps(youtube video)
 * @author EDMT Dev
 * @author GOOGLE API,Android Developer
 * @modified by Theodoulos Christou 966851
 */
class MapsActivity : AppCompatActivity(), OnMapReadyCallback {


    /**
     * creates random music notes markers around bay campus location so user
    * when press on them can see the lyric and guess the song
     */
    var maxLocationCoordinatesLatitude = 51.6195766 + 60 / 111111f
    var minLocationCoordinatesLatitude = 51.6195766 - 60 / 111111f
    var maxLocationCoordinatesLogitude = -3.8798831 + 60 / 111111f
    var minLocationCoordinatesLogitude = -3.8798831 - 60 / 111111f

    /**
     * creates an array which stores the random markers around bay campus
     */
    val listMarkers = arrayListOf<Song>()
    var i = 0

    /**
     * this is the map
     */
    lateinit var googMap: GoogleMap


    /**
     *latitude for users location which starts from 0 but changes everytime when use change
    * location
     */
    private var lat: Double = 0.toDouble()


    /**
     * longtitude for users location which starts from 0 but changes everytime when use change
     * location
     */
    private var long: Double = 0.toDouble()

    /**
     * this the last location that user had
     */
    private lateinit var mLastLocation: Location


    /**
     * these are all the markers that our map activity has
     */
    private var mapMarkers: Marker? = null


    /**
        creation of three variables
        when the map provide the location information for users location
        when user request a location
        when user get the permission from the map then he/she gets back his location
    */
    lateinit var fusedLocationProviderClient: FusedLocationProviderClient
    lateinit var requestPermitLocation: LocationRequest
    lateinit var mapGiveBackUserLocationAfterPermission: LocationCallback


    /**
     * Permission code for the user to request his/her location from Google Maps
     */
    companion object {
        private const val MY_PERMISSION_CODE: Int = 4000
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        val mapFragment = supportFragmentManager.findFragmentById(R.id.map)
                as SupportMapFragment
        mapFragment.getMapAsync(this)


        /**
         * checks if the user has permission
         * if it has then google maps give him/her back his/her
         * current location else the user tries again to request and get the location back.
         */
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (checkLocationPermission()) {
                requestLocation()
                returnLocationBackToUser()
                fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this)
                fusedLocationProviderClient.requestLocationUpdates(
                    requestPermitLocation,
                    mapGiveBackUserLocationAfterPermission,
                    Looper.myLooper()
                )
            }
        } else {
            requestLocation()
            returnLocationBackToUser()

            fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this)
            fusedLocationProviderClient.requestLocationUpdates(
                requestPermitLocation,
                mapGiveBackUserLocationAfterPermission,
                Looper.myLooper()
            )
        }


        /**
         * set the randomMarkers for the Lyrics
         */
        setUpRandomMarkersInMaps()
    }


    /**
     * user request permission for google Maps
     * values from Google API
     */
    private fun requestLocation() {
        requestPermitLocation = LocationRequest()
        requestPermitLocation.priority = LocationRequest.PRIORITY_HIGH_ACCURACY
        requestPermitLocation.interval = 5000
        requestPermitLocation.fastestInterval = 3000
        requestPermitLocation.smallestDisplacement = 10f
    }


    /**
     * checks if the user has permission for his/her location
     */

    private fun checkLocationPermission(): Boolean {
        if (ContextCompat.checkSelfPermission(
                this,
                android.Manifest.permission.ACCESS_FINE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(
                    this,
                    android.Manifest.permission.ACCESS_FINE_LOCATION
                )
            )
                ActivityCompat.requestPermissions(
                    this, arrayOf(
                        android.Manifest.permission.ACCESS_FINE_LOCATION
                    ), MY_PERMISSION_CODE
                )
            else
                ActivityCompat.requestPermissions(
                    this, arrayOf(
                        android.Manifest.permission.ACCESS_FINE_LOCATION
                    ), MY_PERMISSION_CODE
                )
            return false
        } else
            return true
    }


    /**
     * user request permission for current location to Maps
     */
    override fun onRequestPermissionsResult(
        code: Int,
        p: Array<out String>,
        permissionArray: IntArray
    ) {
        if (code == MY_PERMISSION_CODE) {
            if (permissionArray.size > 0 && permissionArray[0] == PackageManager.
                    PERMISSION_GRANTED) {
                if (ContextCompat.checkSelfPermission(
                        this,
                        android.Manifest.permission.ACCESS_FINE_LOCATION
                    ) == PackageManager.PERMISSION_GRANTED
                )
                    if (checkLocationPermission()) {
                        requestLocation()
                        returnLocationBackToUser()

                        fusedLocationProviderClient =
                            LocationServices.getFusedLocationProviderClient(this)
                        fusedLocationProviderClient.requestLocationUpdates(
                            requestPermitLocation,
                            mapGiveBackUserLocationAfterPermission,
                            Looper.myLooper()
                        )
                        googMap!!.isMyLocationEnabled = true
                    }

            } else {
                Toast.makeText(this, "You Don't have Permission", Toast.
                    LENGTH_SHORT).show()
            }
        }
    }


    /**
     * return the location back to the user after the user has permission for request.
     */
    private fun returnLocationBackToUser() {

        mapGiveBackUserLocationAfterPermission = object : LocationCallback() {

            override fun onLocationResult(p0: LocationResult?) {
                mLastLocation = p0!!.locations.get(p0!!.locations.size - 1)//get last location

                if (mapMarkers != null) {
                    mapMarkers!!.remove()
                }

                lat = mLastLocation.latitude
                long = mLastLocation.longitude

                val latLng = LatLng(lat, long)
                val markerOptions = MarkerOptions()
                    .position(latLng)
                    .title("Current Position")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))

                mapMarkers = googMap!!.addMarker(markerOptions)

                googMap!!.moveCamera(CameraUpdateFactory.newLatLng(latLng))
                googMap!!.animateCamera(CameraUpdateFactory.zoomTo(13f))


                for (i in 0..listMarkers.size - 1) {
                    var newList = listMarkers[i]
                    val location = LatLng(newList.location!!.latitude, newList.location!!.longitude)
                    val markerOptions = MarkerOptions()
                        .position(location)
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.n2))

                    mapMarkers = googMap!!.addMarker(markerOptions)

                    if (newList.location!!.distanceTo(mLastLocation) < 50) {
                        mapMarkers!!.tag = "note marker"
                    }
                }
            }
        }
    }


    /**
     * method that sets 20 random markers around the location of user.
     */
    fun setUpRandomMarkersInMaps() {
        while (i < 20) {
            var latRMarker =
                Random.nextDouble(minLocationCoordinatesLatitude, maxLocationCoordinatesLatitude)
            var lngRMarker =
                Random.nextDouble(minLocationCoordinatesLogitude, maxLocationCoordinatesLogitude)
            listMarkers.add(Song("", " ", "", latRMarker, lngRMarker))
            i++
        }
    }


    /**
     * stop the map when user exits
     */
    override fun onStop() {
        fusedLocationProviderClient.removeLocationUpdates(mapGiveBackUserLocationAfterPermission)
        super.onStop()
    }


    /**
     * User can use the map after gets request for location and
     * gets permission
     */

    override fun onMapReady(googleMap: GoogleMap) {
        googMap = googleMap
        // Google Play Services
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (ContextCompat.checkSelfPermission(
                    this,
                    android.Manifest.permission.ACCESS_FINE_LOCATION
                ) == PackageManager.PERMISSION_GRANTED
            ) {
                googMap!!.isMyLocationEnabled = true
            }
        } else
            googMap!!.isMyLocationEnabled = true

        //zoom control
        googMap.uiSettings.isZoomControlsEnabled = true

        //user can click to music note to get the lyric and guess it.
        googMap.setOnMarkerClickListener { marker ->
            if (marker.tag == "note marker") {
                println("john")
                val switch = Intent(this, LyricsSongs::class.java)
                startActivity(switch)
            }
            true
        }
    }


    /**
     * this method allows user to go back to the settings to change the game mode
     */
    override fun onBackPressed() {
        val switch = Intent(this, SettingsActivity::class.java)
        startActivity(switch)
    }
}