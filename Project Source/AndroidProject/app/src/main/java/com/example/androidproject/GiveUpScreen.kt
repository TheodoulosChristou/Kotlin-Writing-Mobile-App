package com.example.androidproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_give_up_screen.*

class GiveUpScreen : AppCompatActivity() {


    /**
     * This class shows to the user a screen of the correct answers of the song,the lost points
     * according to each mode and his/her current points of the song.After that will go back to maps
     * and try to find other songs.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_give_up_screen)

        /**
         * @param gainPoints, sets the gainedPoints to 0.
         */
        val gainPoints = 0

        /**
         * @param lostPoints, sets the lostPoints to 0.
         */
        var lostPoints = 0


        /**
         * @param scorePreference, shares the score from the share Preferences class to this class
         */
        var scorePreference = SharedPreferences(this)

        /**
         * @param score, stores the score.
         */
        var score = scorePreference.getPoints()

        /**
         * @param songPreference, shares the title from the share Preferences class to this class
         */
        val songPreference = SharedPreferences(this)

        /**
         * @param song, stores the song.
         */
        val song = songPreference.getTitleL()

        /**
         * @param artistPreference, shares the artist from the share Preferences class to this class
         */
        val artistPreference = SharedPreferences(this)

        /**
         * @param artist, stores the artist.
         */
        val artist = artistPreference.getArtistSong()


        /**
         * @param modePreference, shares the game mode from the share Preferences class to this
         * class
         */
        val modePreference = SharedPreferences(this)

        /**
         * @param mode, stores the game mode.
         */
        val mode = modePreference.getGameMode()


        /**
         * @param pointsTitleClassicPreference, shares the title points in classic game mode
         * from the share Preferences class to this class
         */
        val pointsTitleClassicPreference = SharedPreferences(this)

        /**
         * @param pointsTitleClassic,stores the title points in classic mode.
         */
        val pointsTitleClassic = pointsTitleClassicPreference.getTitlePointsClassic()


        /**
         * @param pointsArtistClassicPreference, shares the title points in classic game mode
         * from the share Preferences class to this class
         */
        val pointsArtistClassicPreference = SharedPreferences(this)

        /**
         * @param pointsArtistClassic,stores the artist points in classic mode.
         */
        val pointsArtistClassic = pointsArtistClassicPreference.getArtistPointsClassic()


        /**
         * @param pointsTitleCurrentPreference, shares the title points in current game mode
         * from the share Preferences class to this class
         */
        val pointsTitleCurrentPreference = SharedPreferences(this)

        /**
         * @param pointsTitleCurrent,stores the title points in current mode.
         */
        val pointsTitleCurrent = pointsTitleCurrentPreference.getTitlePointsCurrent()


        /**
         * @param pointsArtistCurrentPreference, shares the artist points in current game mode
         * from the share Preferences class to this class
         */
        val pointsArtistCurrentPreference = SharedPreferences(this)


        /**
         * @param pointsArtistCurrent,stores the artist points in current mode.
         */
        val pointsArtistCurrent = pointsArtistCurrentPreference.getArtistPointsCurrent()


        /**
         * if the mode is one then the user is in classic mode and can see all the available points
         * for artist and title,gained points,lost points,current points.Also, if the score of the
         * user is less than zero then the sets the user score to 0.
         */
        if (mode == 1) {
            score =
                score!!.minus(pointsTitleClassic!!.toInt())!!.minus(pointsArtistClassic!!.toInt())
            scorePreference.setPoints(score)
            scorePreference.getPoints()
            if (score > 0) {
                scorePreference.setPoints(score)
                scorePreference.getPoints()
                songTtileGiveUp.text = song.toString()
                artistGiveItUp.text = artist.toString()
                gainPointsGiveUp.text = gainPoints.toString()
                lostPoints = pointsTitleClassic!!.plus(pointsArtistClassic!!.toInt())
                lostPointsGiveUp.text = lostPoints.toString()
                pointsTotal.text = score.toString()
                backToMaps.setOnClickListener {
                    val switch = Intent(this, MapsActivity::class.java)
                    startActivity(switch)
                }
            }

            if (score <= 0) {
                score = 0
                scorePreference.setPoints(score)
                scorePreference.getPoints()
                songTtileGiveUp.text = song.toString()
                artistGiveItUp.text = artist.toString()
                gainPointsGiveUp.text = gainPoints.toString()
                lostPoints = pointsTitleClassic!!.plus(pointsArtistClassic!!.toInt())
                lostPointsGiveUp.text = lostPoints.toString()
                pointsTotal.text = score.toString()
                backToMaps.setOnClickListener {
                    val switch = Intent(this, MapsActivity::class.java)
                    startActivity(switch)
                }

            }
        }


        /**
         * if the mode is two then the user is in current mode and can see all the available points
         * for artist and title,gained points,lost points,current points.Also, if the score of the
         * user is less than zero then the sets the user score to 0.
         */
        if (mode == 2) {
            score = score!!.minus(pointsTitleCurrent!!.toInt())!!
                .minus(pointsArtistCurrent!!.toInt())
            scorePreference.setPoints(score)
            scorePreference.getPoints()

            if (score > 0) {
                scorePreference.setPoints(score)
                scorePreference.getPoints()
                songTtileGiveUp.text = song.toString()
                artistGiveItUp.text = artist.toString()
                gainPointsGiveUp.text = gainPoints.toString()
                lostPoints = pointsTitleCurrent!!.plus(pointsArtistCurrent!!.toInt())
                lostPointsGiveUp.text = lostPoints.toString()
                pointsTotal.text = score.toString()
                backToMaps.setOnClickListener {
                    val switch = Intent(this, MapsActivity::class.java)
                    startActivity(switch)
                }
            }

            if (score <= 0) {
                score = 0
                scorePreference.setPoints(score)
                scorePreference.getPoints()
                songTtileGiveUp.text = song.toString()
                artistGiveItUp.text = artist.toString()
                gainPointsGiveUp.text = gainPoints.toString()
                lostPoints = pointsTitleCurrent!!.plus(pointsArtistCurrent!!.toInt())
                lostPointsGiveUp.text = lostPoints.toString()
                pointsTotal.text = score.toString()
                backToMaps.setOnClickListener {
                    val switch = Intent(this, MapsActivity::class.java)
                    startActivity(switch)
                }

            }
        }
    }

    /**
     * this method doesn't allow the use to go back with the navigation bar.
     */
    override fun onBackPressed() {
        //
    }
}