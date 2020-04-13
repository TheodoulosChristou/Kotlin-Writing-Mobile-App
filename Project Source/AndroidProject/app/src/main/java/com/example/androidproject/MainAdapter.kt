package com.example.androidproject

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.song_row.view.*

/**
 * This adapter stores all the points of each song for buy in shop and the songs.
 */
class MainAdapter : RecyclerView.Adapter<CustomViewHolder>() {


    val songs = listOf<String>(
        "Ladbroke Grove",
        "Make It Shake",
        "Don't Call Me Angel",
        "Like A Rolling Stone",
        "Professor X",
        "Outnumbered",
        "3 Nights",
        "Take Me Back To London",
        "Your Song",
        "Sweet Child O Mine",
        "Both",
        "Sorry",
        "Imagine",
        "Be Honest",
        "Over The Rainbow",
        "Higher Love",
        "Stairway Of Heaven",
        "Ransom",
        "Billie Jean",
        "Smells Like Teen Spirit"
        ,
        "Live Forever",
        "Circles",
        "GoodByes",
        "Bohemian Rhapsody",
        "Regard",
        "Satisfaction",
        "Post Malone"
        ,
        "How Do You Sleep",
        "God Save The Queen",
        "Senorita",
        "Hey Jude",
        "London Calling",
        "Hotel California"
        ,
        "Waterloo Sunset",
        "Dance Monkey",
        "One",
        "I Will Always Love You",
        "Strike A Pose"
    )


    //number of items
    override fun getItemCount(): Int {
        return songs.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        //create a view
        val layoutInfLater = LayoutInflater.from(parent?.context)
        val cellForRow = layoutInfLater.inflate(R.layout.song_row, parent, false)
        return CustomViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val songTitle = songs.get(position)
        holder.view.songBuy.text = "Song: $songTitle"
        holder.itemView.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                var pointsPreference = SharedPreferences(v.context)
                var points = pointsPreference.getPoints()

                val buyInfoPoints = 40

                if (points!! >= buyInfoPoints) {
                    points = points - buyInfoPoints
                    pointsPreference.setPoints(points)
                    pointsPreference.getPoints()
                    val switch = Intent(v.context, SongsInformation::class.java)
                    switch.putExtra("key", songTitle)
                    v.context.startActivity(switch)
                } else {
                    val snackbar = Snackbar.make(
                        v,
                        "Don't have enough points to see information of this song",
                        Snackbar.LENGTH_LONG
                    )
                    snackbar.show()
                }
            }
        })
    }
}

class CustomViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

}