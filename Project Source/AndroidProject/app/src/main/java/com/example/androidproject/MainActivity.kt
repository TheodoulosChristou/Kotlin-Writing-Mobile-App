package com.example.androidproject
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


/**
 * This class is the first screen of the Mobile Application where
 * the user can play the game by pressing the play button,can buy and see information
 * of artists of each songs by pressing the shop button and also by pressing the settings icon can
 * change the Mode of the game.The Mode of the game is Classic by default.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        /**
         * When the user press the play button he/she can play the game and
         * see the game description.
         */
        playButton.setOnClickListener {
            val switch = Intent(this,GameDescription::class.java)
            startActivity(switch)
            finish()
        }


        /**
         * When the user press the settingsIcon Button can change the game mode of the game
         * which is classic by default.
         */
        settingsButton.setOnClickListener{
            val switch = Intent(this,SettingsActivity::class.java)
            startActivity(switch)
        }

        /**
         * When the user press the shopButton can buy and see information of artists of
         * each songs.
         */
        shopButton.setOnClickListener{
            val switch = Intent(this,Shopping::class.java)
            startActivity(switch)
        }
    }

    /**
     * This method doesn't allow user to use the back button of navigation bar
     * to navigate to the previous activity.
     */
    override fun onBackPressed() {

    }
}