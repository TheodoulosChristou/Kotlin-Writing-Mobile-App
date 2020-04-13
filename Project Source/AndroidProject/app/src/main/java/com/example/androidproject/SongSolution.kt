package com.example.androidproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_song_solution.*


/**
 * This class show to the user the available points of each game mode for artists and
 * titles,the gained points of the user, the lost points of the user,the correct answers
 * and the current points of the user.After that user can press the next Song button to go
 * to the google maps to collect music noted for guess the songs.
 */
class SongSolution : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_song_solution)

        /**
         * @param gainedPoints, gained points that user has starts from 0
         */
        var gainedPoints = 0

        /**
         * @param lostPoints, lost points that user has starts from 0
         */
        var lostPoints = 0


        /**
         * @param pointsTitleClassicPreference, shares the points of the title in classic mode from
         * share preference class to this class
         */
        val pointsTitleClassicPreference = SharedPreferences(this)

        /**
         * @param pointsTitleClassic, stores the points of the title in classic mode to this class
         */
        val pointsTitleClassic = pointsTitleClassicPreference.getTitlePointsClassic()


        /**
         * @param pointsArtistClassicPreference, shares the points of the artist in classic mode
         * from share preference class to this class
         */
        val pointsArtistClassicPreference = SharedPreferences(this)

        /**
         * @param pointsArtistClassic, stores the points of the artist in classic mode to this
         * class.
         */
        val pointsArtistClassic = pointsArtistClassicPreference.getArtistPointsClassic()


        /**
         * @param pointsTitleCurrentPreference, shares the points of the title in current mode
         * from share preference class to this class.
         */
        val pointsTitleCurrentPreference = SharedPreferences(this)

        /**
         * @param pointsTitleCurrent, stores the points of the title in current mode to this class
         */
        val pointsTitleCurrent = pointsTitleCurrentPreference.getTitlePointsCurrent()

        /**
         * @param pointsArtistCurrentPreference, shares the points of the artist in current mode
         * from share preference class to this class.
         */
        val pointsArtistCurrentPreference = SharedPreferences(this)

        /**
         * @param pointsArtistCurrent, stores the points of the artist in the current mode
         * from share preference class to this class.
         */
        val pointsArtistCurrent = pointsArtistCurrentPreference.getArtistPointsCurrent()

        /**
         * @param titleAnswerPreference,shares the correct answer of the title from share preference
         * class to this class.
         */
        var titleAnswerPreference = SharedPreferences(this)

        /**
         * @param titleAnswer, stores the answer of the title.
         */
        var titleAnswer = titleAnswerPreference.getTitleAnswer()

        /**
         * @param artistAnswerPreference,shares the correct answer of the artist from
         * share preference class to this class.
         */
        var artistAnswerPreference = SharedPreferences(this)

        /**
         * @param artistAnswer, stores the answer of the artist.
         */
        var artistAnswer = artistAnswerPreference.getArtistAnswer()

        /**
         * @param modePreference, shares the game mode from share preference class to this class.
         */
        val modePreference = SharedPreferences(this)

        /**
         * @param mode, stores the mode of the game
         */
        val mode = modePreference.getGameMode()

        /**
         * @param scorePreference, shares the points of the user from share preference class to this class.
         */
        var scorePreference = SharedPreferences(this)

        /**
         * @param score, stores the points of the user
         */
        var score = scorePreference.getPoints()


        /**
         * @param songPreference, shares the title of the song from share preference class to this class.
         */
        val songPreference = SharedPreferences(this)

        /**
         * @param song, stores the song
         */
        val song = songPreference.getTitleL()

        /**
         * @param artistPreference, shares the artist of the song from share preference class to this class.
         */
        val artistPreference = SharedPreferences(this)

        /**
         * @param artist, stores the artist
         */
        val artist = artistPreference.getArtistSong()


        /**
         * if the mode of the game is classic then user can see the available points of each element
         * artist and title,can see the gained points,lost points,correct answers,his points.
         */
        if (mode == 1) {
            pointsForSong.text = "Points for Song: $pointsTitleClassic"
            pointsForArtist.text = "Points for Artist: $pointsArtistClassic"
            if (titleAnswer == song && artistAnswer == artist) {
                totalPointsSollution.text = score.toString()
                songTitleSolution.text = song.toString()
                gainedPoints = pointsTitleClassic!!.plus(pointsArtistClassic!!.toInt())
                lostPoints = 0
                gain.text = gainedPoints.toString()
                losePointsSolution.text = lostPoints.toString()
                artistAnswerText.text = artist.toString()
            } else if (titleAnswer != song && artistAnswer == artist) {
                totalPointsSollution.text = score.toString()
                songTitleSolution.text = song.toString()
                gainedPoints = pointsArtistClassic!!.toInt()
                lostPoints = pointsTitleClassic!!.toInt()
                gain.text = gainedPoints.toString()
                losePointsSolution.text = lostPoints.toString()
                artistAnswerText.text = artist.toString()
            } else if (titleAnswer == song && artistAnswer != artist) {
                totalPointsSollution.text = score.toString()
                songTitleSolution.text = song.toString()
                gainedPoints = pointsTitleClassic!!.toInt()
                lostPoints = pointsArtistClassic!!.toInt()
                gain.text = gainedPoints.toString()
                losePointsSolution.text = lostPoints.toString()
                artistAnswerText.text = artist.toString()
            } else {
                totalPointsSollution.text = score.toString()
                songTitleSolution.text = song.toString()
                gainedPoints = 0
                lostPoints = pointsArtistClassic!!.toInt()!!.plus(pointsTitleClassic!!.toInt())
                gain.text = gainedPoints.toString()
                losePointsSolution.text = lostPoints.toString()
                artistAnswerText.text = artist.toString()
            }
        }


        /**
         * if the mode of the game is current then user can see the available points of each element
         * artist and title,can see the gained points,lost points,correct answers,his points.
         */
        if (mode == 2) {
            pointsForSong.text = "Points for Song: $pointsTitleCurrent"
            pointsForArtist.text = "Points for Artist: $pointsArtistCurrent"
            if (titleAnswer == song && artistAnswer == artist) {
                totalPointsSollution.text = score.toString()
                songTitleSolution.text = song.toString()
                gainedPoints = pointsTitleCurrent!!.plus(pointsArtistCurrent!!.toInt())
                lostPoints = 0
                gain.text = gainedPoints.toString()
                losePointsSolution.text = lostPoints.toString()
                artistAnswerText.text = artist.toString()
            } else if (titleAnswer != song && artistAnswer == artist) {
                totalPointsSollution.text = score.toString()
                songTitleSolution.text = song.toString()
                gainedPoints = pointsArtistCurrent!!.toInt()
                lostPoints = pointsTitleCurrent!!.toInt()
                gain.text = gainedPoints.toString()
                losePointsSolution.text = lostPoints.toString()
                artistAnswerText.text = artist.toString()
            } else if (titleAnswer == song && artistAnswer != artist) {
                totalPointsSollution.text = score.toString()
                songTitleSolution.text = song.toString()
                gainedPoints = pointsTitleCurrent!!.toInt()
                lostPoints = pointsArtistCurrent!!.toInt()
                gain.text = gainedPoints.toString()
                losePointsSolution.text = lostPoints.toString()
                artistAnswerText.text = artist.toString()
            } else {
                totalPointsSollution.text = score.toString()
                songTitleSolution.text = song.toString()
                gainedPoints = 0
                lostPoints = pointsArtistCurrent!!.toInt()!!.plus(pointsTitleCurrent!!.toInt())
                gain.text = gainedPoints.toString()
                losePointsSolution.text = lostPoints.toString()
                artistAnswerText.text = artist.toString()
            }
        }


        /**
         * this button shows to the user the map to find other songs.
         */
        nextSong.setOnClickListener {
            val switch = Intent(this, MapsActivity::class.java)
            startActivity(switch)
        }
    }

    /**
     * user can't go back from the navigation bar.
     */
    override fun onBackPressed() {
        //
    }
}