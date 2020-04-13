package com.example.androidproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_guess_song.*


/**
 * This class show to the user two edit texts which he/she can guess the tile and artist of the song
 * according to the game Mode that choose.Each time user has 3 attempts to guess the title and the
 * artist which stored in shared preference class,therefore,can also see how many
 * attempts left to guess and his/her current points.Also the user
 * can give up by pressing the give up button which will loose all the available points.
 */
class GuessSong : AppCompatActivity() {

    /**
     * Creation of all the songs with lyrics
     */
    var fileText1 = " "
    var fileText2 = " "
    var fileText3 = " "
    var fileText4 = " "
    var fileText5 = " "
    var fileText6 = " "
    var fileText7 = " "
    var fileText8 = " "
    var fileText9 = " "
    var fileText10 = " "
    var fileText11 = " "
    var fileText12 = " "
    var fileText13 = " "
    var fileText14 = " "
    var fileText15 = " "
    var fileText16 = " "
    var fileText17 = " "
    var fileText18 = " "
    var fileText19 = " "
    var fileText20 = " "
    var fileText21 = " "
    var fileText22 = " "
    var fileText23 = " "
    var fileText24 = " "
    var fileText25 = " "
    var fileText26 = " "
    var fileText27 = " "
    var fileText28 = " "
    var fileText29 = " "
    var fileText30 = " "
    var fileText31 = " "
    var fileText32 = " "
    var fileText33 = " "
    var fileText34 = " "
    var fileText35 = " "
    var fileText36 = " "
    var fileText37 = " "
    var fileText38 = " "


    /**
     * number of attempts that user has
     */
    var attempt = -1



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guess_song)


        /**
         * Initializes the classic songs from assets file
         */
        fileText4 =
            applicationContext.
                assets.open("bob_dylan(like_a_rolling_stone).txt").bufferedReader()
                .readLines().random()
        fileText9 =
            applicationContext.
                assets.open("elton_john(your_song).txt").bufferedReader().readLines()
                .random()
        fileText10 =
            applicationContext.
                assets.open("guns_n_roses(sweet_child_o_mine).txt").bufferedReader()
                .readLines().random()
        fileText13 =
            applicationContext.
                assets.open("john_lennon(imagine).txt").bufferedReader().readLines()
                .random()
        fileText15 =
            applicationContext.
                assets.open("judy_garland(over_the_rainbow).txt").bufferedReader()
                .readLines().random()
        fileText17 =
            applicationContext.
                assets.open("led_zeppelin(stairway_to_heaven).txt").bufferedReader()
                .readLines().random()
        fileText19 =
            applicationContext.
                assets.open("michael_jackson(billie_jean).txt").bufferedReader()
                .readLines().random()
        fileText20 =
            applicationContext.
                assets.open("nirvana(smells_like_teen_spirit).txt").bufferedReader()
                .readLines().random()
        fileText21 =
            applicationContext.
                assets.open("oasis(live_forever).txt").bufferedReader().readLines()
                .random()
        fileText24 =
            applicationContext.
                assets.open("queen(bohemian_rhapsody).txt").bufferedReader()
                .readLines().random()
        fileText26 =
            applicationContext.
                assets.open("rolling_stones(I_can't_get_no_satisfaction).txt")
                .bufferedReader().readLines().random()
        fileText29 =
            applicationContext.
                assets.open("sex_pistols(god_save_the_queen).txt").bufferedReader()
                .readLines().random()
        fileText31 =
            applicationContext.
                assets.open("the_beatles(hey_jude).txt").bufferedReader().readLines()
                .random()
        fileText32 =
            applicationContext.
                assets.open("the_clash(london_calling).txt").bufferedReader()
                .readLines().random()
        fileText33 =
            applicationContext.
                assets.open("the_eagles(hotel_california).txt").bufferedReader()
                .readLines().random()
        fileText34 =
            applicationContext.
                assets.open("the_kinks(waterloo_sunset).txt").bufferedReader()
                .readLines().random()
        fileText36 =
            applicationContext.
                assets.open("u2(one).txt").bufferedReader().readLines().random()
        fileText37 =
            applicationContext.
                assets.open("whitney_houston(i_will_always_love_you).txt")
                .bufferedReader().readLines().random()



        /**
         * Initializes the current songs from assets file
         */
        fileText1 =
            applicationContext.
                assets.open("a_j_tracey(ladbroke_grove).txt").bufferedReader()
                .readLines().random()
        fileText2 =
            applicationContext.
                assets.open("aitch(taste_make_it_shake).txt").bufferedReader()
                .readLines().random()
        fileText3 =
            applicationContext.
                assets.
                open("ariana_grande___miley_cyrus___lana_del_rey(don't_call_me_angle).txt")
                .bufferedReader().readLines().random()

        fileText5 =
            applicationContext.
                assets.open("dave(professor_x).txt").bufferedReader().readLines()
                .random()
        fileText6 =
            applicationContext.
                assets.open("dermot_kennedy(outnumbered).txt").bufferedReader()
                .readLines().random()
        fileText7 =
            applicationContext.
                assets.open("dominic_fike(3_nights).txt").bufferedReader()
                .readLines().random()
        fileText8 =
            applicationContext.
                assets.open("ed_sheeran_ft_stormzy(take_me_back_to_london).txt")
                .bufferedReader().readLines().random()
        fileText11 =
            applicationContext.
                assets.open("headie_one(both).txt").bufferedReader().readLines()
                .random()
        fileText12 =
            applicationContext.
                assets.open("joel_corry(sorry).txt").bufferedReader().readLines()
                .random()

        fileText14 =
            applicationContext.
                assets.open("jorja_smith_ft_burna_boy(be_honest).txt")
                .bufferedReader().readLines().random()

        fileText16 =
            applicationContext.
                assets.open("kygo_&_whitney_houston(higher_love).txt")
                .bufferedReader().readLines().random()

        fileText18 =
            applicationContext.
                assets.open("lil_tecca(ransom).txt").bufferedReader().readLines()
                .random()
        fileText22 =
            applicationContext.
                assets.open("post_malone(circles).txt").bufferedReader().readLines()
                .random()
        fileText23 =
            applicationContext.
                assets.open("post_malone_ft_young_thug(goodbyes).txt")
                .bufferedReader().readLines().random()

        fileText25 =
            applicationContext.
                assets.open("regard(ride_it).txt").bufferedReader().readLines()
                .random()

        fileText27 =
            applicationContext.
                assets.open("sam_feldt_ft_rani(post_malone).txt").bufferedReader()
                .readLines().random()
        fileText28 =
            applicationContext.
                assets.open("sam_smith(how_do_you_sleep).txt").bufferedReader()
                .readLines().random()

        fileText30 =
            applicationContext.
                assets.open("shawn_mendes___camila_cabello(senorita).txt")
                .bufferedReader().readLines().random()
        fileText35 =
            applicationContext.
                assets.open("tones_&_i(dance_monkey).txt").bufferedReader()
                .readLines().random()
        fileText38 =
            applicationContext.
                assets.open("young_t_&_bugsey_ft_aitch(strike_a_pose).txt")
                .bufferedReader().readLines().random()


        /**
         * When user press the giveUp Button can go the GiveUpScreen of the Mobile App and
         * see the correct answer of the artist and the title of the
         * song,can see the gainedPoints,the lost points,current points,
         * available points of the artist and title according to game mode that choose.
         */
        giveUpButton.setOnClickListener {
            val switch = Intent(this, GiveUpScreen::class.java)
            startActivity(switch)
        }


        /**
         * puts the guess Button from xml to this method where user can click to
         * guess the song title and artist.
         */
        clickGuessButton(guessButton)

        /**
         * param @points, share the user points from shared Preference class to GuessSong Class
         * and get the current points of the user.
         */
        var points = SharedPreferences(this)
        points.getPoints()


        /**
         * prints the current points of the user to a text in xml activity of this class.
         */
        yourPoints.text = points.getPoints().toString()
    }


    /**
     * With this method user can click to the guess button to guess the title and the artist of the
     * song. Each time according to the game Mode that choose it has 3 attempts to guess the song.If
     * he/she guess each of them,or one of them or none of them then can see the available points
     * the gained points,lost points and his/her current points.If his/her score is less than zero
     * then it puts it to zero and share it to this class and to other classes.
     */
    fun clickGuessButton(view: View) {

        /**
         * @param songText,puts the title of the song in the text of this class xml activity
         */
        val songText = findViewById<EditText>(R.id.songText) as TextView

        /**
         * @param titlePreference, share the title of the song from share Preference class to
         * this class
         */
        val titlePreference = SharedPreferences(this)

        /**
         * @param title, store the titlePreference to this class
         */
        val title = titlePreference.getTitleL()


        /**
         * @param artistPreference,share the artist of the song from share Preference class to
         * this class
         */
        val artistPreference = SharedPreferences(this)

        /**
         * @param artist, stores the artist of the song from share Preference class to
         * this class
         */
        val artist = artistPreference.getArtistSong()


        /**
         * @param modePreference, share the game mode from share preference class to
         * this class
         */
        val modePreference = SharedPreferences(this)

        /**
         * @param mode,store the game mode from sharePreference class to this class
         */
        val mode = modePreference.getGameMode()


        /**
         * @param userIndexTitle,store the user index of the title of the song to the xml activity
         * of this class
         */
        val userIndexTitle = songText.text.toString()

        /**
         * @param userIndexArtist, store the user index of the artist of the song to the xml activity
         * of this class.
         */
        val userIndexArtist = artistText.text.toString()


        /**
         * @param scorePreference,share the score of the user from share preference class to
         * this class.
         */
        var scorePreference = SharedPreferences(this)

        /**
         * @param score,store the score of the user from sharePreference class to this class
         */
        var score = scorePreference.getPoints()


        /**
         * @param pointsTitleClassicPreference,share the available points of the title in classic
         * mode from share Preference class to this class
         */
        val pointsTitleClassicPreference = SharedPreferences(this)

        /**
         * set the points of the title in classic.
         */
        pointsTitleClassicPreference.setTitlePointsClassic(1)

        /**
         * @param pointsTitleClassic, stores the available points of the title in classic mode
         * in this class.
         */
        val pointsTitleClassic = pointsTitleClassicPreference.getTitlePointsClassic()

        /**
         * @param pointsArtistClassicPreference,share the available points of the title in classic
         * mode from share Preference class to this class
         */
        val pointsArtistClassicPreference = SharedPreferences(this)

        /**
         * set the points of the artist in classic.
         */
        pointsArtistClassicPreference.setArtistPointsClassic(3)

        /**
         * @param pointsArtistClassic,stores the available points of the artist in classic mode
         * in this class.
         */
        val pointsArtistClassic = pointsArtistClassicPreference.getArtistPointsClassic()


        /**
         * @param pointsTitleCurrentPreference,share the available points of the title in current
         * mode from share Preference class to this class
        */
        val pointsTitleCurrentPreference = SharedPreferences(this)

        /**
         * sets the available points of the title in current mode in this class.
         */
        pointsTitleCurrentPreference.setTitlePointsCurrent(7)

        /**
         * @param pointsTitleCurrent,stores the available points of the title in current mode
         * in this class.
         */
        val pointsTitleCurrent = pointsTitleCurrentPreference.getTitlePointsCurrent()


        /**
         * @param pointsArtistCurrentPreference,share the available points of the artist in current
         * mode from share Preference class to this class
         */
        val pointsArtistCurrentPreference = SharedPreferences(this)

        /**
         * sets the available points of the title in current mode
         * in this class.
         */
        pointsArtistCurrentPreference.setArtistPointsCurrent(7)

        /**
         * @param pointsArtistsCurrent,stores the available points of the artist in current mode
         * in this class.
         */
        val pointsArtistCurrent = pointsArtistCurrentPreference.getArtistPointsCurrent()

        /**
         * @param titleAnswerPreference, shares the title of the song from shared Preference class
         * to this class
         */
        var titleAnswerPreference = SharedPreferences(this)

        /**
         * sets the user index for title to the shared preference value
         */
        titleAnswerPreference.setTitleUserAnswer(userIndexTitle)

        /**
         * @param titleAnswer, stores the title answer of the song
         */
        var titleAnswer = titleAnswerPreference.getTitleAnswer()


        /**
         * @param artistAnswerPreference, shares the artist of the song from share preference class
         * to this class.
         */
        var artistAnswerPreference = SharedPreferences(this)

        /**
         * sets the correct answer of the artist of the song.
         */
        artistAnswerPreference.setArtistUserAnswer(userIndexArtist)

        /**
         * @param artistAnswer, stores the artist answer of the artist
         */
        var artistAnswer = titleAnswerPreference.getArtistAnswer()


        /**
         * If the mode is 1 means the user is in classic mode.Each time user has 3 attempts
         * to guess the artist and the title.If he/she guess the title and the
         * artist correct then the score is increased,sets it and gets to the sharePreference Value,
         * else if guess one of them then get only the points of one of them.If the score of the
         * user is less than zero then it sets it again to zero and share to all the classes.
         */
        if (mode == 1) {
            if (title == titleAnswer && artist == artistAnswer) {
                score =
                    score!!.plus(pointsTitleClassic!!.toInt()).plus(pointsArtistClassic!!.toInt())
                scorePreference.setPoints(score)
                scorePreference.getPoints()
                val switch = Intent(this, SongSolution::class.java)
                startActivity(switch)
            } else {
                if (attempt < 3) {
                    attempt = attempt + 1
                    if(attempt == 1){
                        val snackbar = Snackbar.
                            make(view,"You have 2 attempt",Snackbar.LENGTH_LONG)
                        snackbar.show()
                        tryText.text = attempt.toString()
                    }
                    if(attempt == 2){
                        val snackbar = Snackbar.
                            make(view,"One Attempt",Snackbar.LENGTH_LONG)
                        snackbar.show()
                        tryText.text = attempt.toString()
                    }
                    if(attempt == 3){
                        val snackbar = Snackbar.
                            make(view,"Final Attempt",Snackbar.LENGTH_LONG)
                        snackbar.show()
                        tryText.text = attempt.toString()
                    }
                } else {
                    if (title == titleAnswer && artist != artistAnswer) {
                        score = score!!.plus(pointsTitleClassic!!.toInt())
                            .minus(pointsArtistClassic!!.toInt())
                        scorePreference.setPoints(score)
                        scorePreference.getPoints()
                        val switch = Intent(this, SongSolution::class.java)
                        startActivity(switch)
                        if (score <= 0) {
                            scorePreference.setPoints(0)
                            scorePreference.getPoints()
                            val switch = Intent(this, SongSolution::class.java)
                            startActivity(switch)
                        }
                    } else if (title != titleAnswer && artist == artistAnswer) {
                        score = score!!.plus(pointsArtistClassic!!.toInt())
                            .minus(pointsTitleClassic!!.toInt())
                        scorePreference.setPoints(score)
                        scorePreference.getPoints()
                        val switch = Intent(this, SongSolution::class.java)
                        startActivity(switch)
                        if (score <= 0) {
                            scorePreference.setPoints(0)
                            scorePreference.getPoints()
                            val switch = Intent(this, SongSolution::class.java)
                            startActivity(switch)
                        }
                    } else {
                        score = score!!.minus(pointsArtistClassic!!.toInt())
                            .minus(pointsTitleClassic!!.toInt())
                        scorePreference.setPoints(score)
                        scorePreference.getPoints()
                        val switch = Intent(this, SongSolution::class.java)
                        startActivity(switch)
                        if (score <= 0) {
                            scorePreference.setPoints(0)
                            scorePreference.getPoints()
                            val switch = Intent(this, SongSolution::class.java)
                            startActivity(switch)
                        }
                    }
                }
            }
        }

        /**
         * If the mode is 2 means the user is in current mode.Each time user has 3 attempts
         * to guess the artist and the title.If he/she guess the title and the
         * artist correct then the score is increased,sets it and gets to the sharePreference Value,
         * else if guess one of them then get only the points of one of them.If the score of the
         * user is less than zero then it sets it again to zero and share to all the classes.
         */
        if (mode == 2) {
            if (title == titleAnswer && artist == artistAnswer) {
                score =
                    score!!.plus(pointsTitleCurrent!!.toInt()).plus(pointsArtistCurrent!!.toInt())
                scorePreference.setPoints(score)
                scorePreference.getPoints()
                val switch = Intent(this, SongSolution::class.java)
                startActivity(switch)
            } else {
                if (attempt < 3) {
                    attempt = attempt + 1
                    if(attempt == 1){
                        val snackbar = Snackbar.
                            make(view,"You have 2 attempt",Snackbar.LENGTH_LONG)
                        snackbar.show()
                        tryText.text = attempt.toString()
                    }
                    if(attempt == 2){
                        val snackbar = Snackbar.
                            make(view,"One Attempt",Snackbar.LENGTH_LONG)
                        snackbar.show()
                        tryText.text = attempt.toString()
                    }
                    if(attempt == 3){
                        val snackbar = Snackbar.
                            make(view,"Final Attempt",Snackbar.LENGTH_LONG)
                        snackbar.show()
                        tryText.text = attempt.toString()
                    }
                } else {
                    if (title == titleAnswer && artist != artistAnswer) {
                        score = score!!.plus(pointsTitleCurrent!!.toInt())
                            .minus(pointsArtistCurrent!!.toInt())
                        scorePreference.setPoints(score)
                        scorePreference.getPoints()
                        val switch = Intent(this, SongSolution::class.java)
                        startActivity(switch)
                        if (score <= 0) {
                            scorePreference.setPoints(0)
                            scorePreference.getPoints()
                            val switch = Intent(this, SongSolution::class.java)
                            startActivity(switch)
                        }
                    } else if (title != titleAnswer && artist == artistAnswer) {
                        score = score!!.plus(pointsArtistCurrent!!.toInt())
                            .minus(pointsTitleCurrent!!.toInt())
                        scorePreference.setPoints(score)
                        scorePreference.getPoints()
                        val switch = Intent(this, SongSolution::class.java)
                        startActivity(switch)
                        if (score <= 0) {
                            scorePreference.setPoints(0)
                            scorePreference.getPoints()
                            val switch = Intent(this, SongSolution::class.java)
                            startActivity(switch)
                        }
                    } else {
                        score = score!!.minus(pointsArtistCurrent!!.toInt())
                            .minus(pointsTitleCurrent!!.toInt())
                        scorePreference.setPoints(score)
                        scorePreference.getPoints()
                        val switch = Intent(this, SongSolution::class.java)
                        startActivity(switch)
                        if (score <= 0) {
                            scorePreference.setPoints(0)
                            scorePreference.getPoints()
                            val switch = Intent(this, SongSolution::class.java)
                            startActivity(switch)
                        }
                    }
                }
            }
        }
    }
}