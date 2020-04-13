package com.example.androidproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_game_description.*


/**
 * This class show to the user the whole description of how to play the game and by clicking
 * next can see his/her current position in the google maps to find the lyrics with note music icons.
 */
class GameDescription : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_description)

        /**
         * When user click the buttonDesc he can go to the MapsActivity screen to
         * see his/her current position in googleMaps and find lyrics of each song.
         */
        buttonDesc.setOnClickListener {
            val switch = Intent(this, MapsActivity::class.java)
            startActivity(switch)
        }
    }

    /**
     * back to the main activity by press the back navigate
     */
    override fun onBackPressed() {
        val switch = Intent(this, MainActivity::class.java)
        startActivity(switch)
    }
}