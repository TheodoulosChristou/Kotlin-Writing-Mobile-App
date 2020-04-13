package com.example.androidproject

import android.content.Context


/**
 * This class stores all the values that we want to parse to other classes like
 * title,artist,available Points,answers of the user,mode of th game
 */
class SharedPreferences(context: Context) {

    val sharedPreferences = "SHARED"
    val title = "TITLE"
    val points = "POINTS"
    val gameMode = "MODE"
    val artist = "ARTIST"
    val pointsTitleClassic = " TITLE POINTS CLASSIC"
    val pointsTitleCurrent = " TITLE POINTS CURRENT"
    val pointsArtistClassic = " ARTIST POINTS CLASSIC"
    val pointsArtistCurrent = " ARTIST POINTS CURRENT"
    val titleUserAnswer = "TITLE ANSWER"
    val artistUserAnswer = "ARTIST ANSWER"
    val shared = context.getSharedPreferences(sharedPreferences, Context.MODE_PRIVATE)


    fun setSongTitle(t: String) {
        val editor = shared.edit()
        editor.putString(title, t)
        editor.apply()
    }

    fun getTitleL(): String? {
        return shared.getString(title, "")
    }

    fun setPoints(p: Int) {
        val editor = shared.edit()
        editor.putInt(points, p)
        editor.apply()
    }

    fun getPoints(): Int? {
        return shared.getInt(points, 0)
    }


    fun setGameMode(m: Int) {
        val editor = shared.edit()
        editor.putInt(gameMode, m)
        editor.apply()
    }

    fun getGameMode(): Int? {
        return shared.getInt(gameMode, 2)
    }

    fun setArtistSong(a: String) {
        val editor = shared.edit()
        editor.putString(artist, a)
        editor.apply()
    }

    fun getArtistSong(): String? {
        return shared.getString(artist, "")
    }


    fun setTitlePointsClassic(t: Int) {
        val editor = shared.edit()
        editor.putInt(pointsTitleClassic, t)
        editor.apply()
    }

    fun getTitlePointsClassic(): Int? {
        return shared.getInt(pointsTitleClassic, 0)
    }

    fun setArtistPointsClassic(t: Int) {
        val editor = shared.edit()
        editor.putInt(pointsArtistClassic, t)
        editor.apply()
    }

    fun getArtistPointsClassic(): Int? {
        return shared.getInt(pointsArtistClassic, 0)
    }


    fun setTitlePointsCurrent(t: Int) {
        val editor = shared.edit()
        editor.putInt(pointsTitleCurrent, t)
        editor.apply()
    }

    fun getTitlePointsCurrent(): Int? {
        return shared.getInt(pointsArtistCurrent, 0)
    }


    fun setArtistPointsCurrent(t: Int) {
        val editor = shared.edit()
        editor.putInt(pointsArtistCurrent, t)
        editor.apply()
    }

    fun getArtistPointsCurrent(): Int? {
        return shared.getInt(pointsArtistCurrent, 0)
    }


    fun setTitleUserAnswer(t: String) {
        val editor = shared.edit()
        editor.putString(titleUserAnswer, t)
        editor.apply()
    }

    fun getTitleAnswer(): String? {
        return shared.getString(titleUserAnswer, " ")
    }


    fun setArtistUserAnswer(t: String) {
        val editor = shared.edit()
        editor.putString(artistUserAnswer, t)
        editor.apply()
    }

     fun getArtistAnswer(): String? {
        return shared.getString(artistUserAnswer, " ")
    }
}