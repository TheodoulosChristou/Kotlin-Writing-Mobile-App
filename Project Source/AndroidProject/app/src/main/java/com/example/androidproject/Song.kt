package com.example.androidproject

import android.location.Location

/**
 * Creates a class for the song for the creation of the random markers
 * to the google maps according to users location.
 */
class Song{
    var location: Location?= null
    var titleSong = ""
    var artistSong:String = ""
    var lyricsSong:String = ""
    var latitudeLocation = ""
    var longtitudeLocation = ""

    constructor(title:String, artist:String,  lyrics: String, latitudeLocation:Double,
                longtitudeLocation:Double) {
        this.location = Location("")
        this.location!!.latitude = latitudeLocation
        this.location!!.longitude = longtitudeLocation
        this.titleSong=title
        this.artistSong=artist
        this.lyricsSong=lyrics
    }
}