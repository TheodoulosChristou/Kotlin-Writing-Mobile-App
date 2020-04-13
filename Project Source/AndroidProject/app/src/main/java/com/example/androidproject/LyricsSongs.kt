package com.example.androidproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_lyrics_songs.*
import kotlin.random.Random

/**
 * This class shows to the user a screen of lyric of the song that pressed in the maps activity
 * according to the Game mode that choose and when he/she press the button next then can guess
 * the title of the song and the artist of the song.
 */
class LyricsSongs : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lyrics_songs)


        /**
         * Initializes the classic songs from the assets files as strings.
         */
        val fileText4: String =
            applicationContext.assets.open("bob_dylan(like_a_rolling_stone).txt")
                .bufferedReader()
                .readLines().random()
        val fileText9: String =
            applicationContext.assets.open("elton_john(your_song).txt")
                .bufferedReader().readLines()
                .random()
        val fileText10: String =
            applicationContext.assets.open("guns_n_roses(sweet_child_o_mine).txt")
                .bufferedReader()
                .readLines().random()
        val fileText13: String =
            applicationContext.assets.open("john_lennon(imagine).txt").
                bufferedReader().readLines()
                .random()
        val fileText15: String =
            applicationContext.assets.open("judy_garland(over_the_rainbow).txt").
                bufferedReader()
                .readLines().random()
        val fileText17: String =
            applicationContext.assets.open("led_zeppelin(stairway_to_heaven).txt").
                bufferedReader()
                .readLines().random()
        val fileText19: String =
            applicationContext.assets.open("michael_jackson(billie_jean).txt").
                bufferedReader()
                .readLines().random()
        val fileText20: String =
            applicationContext.assets.open("nirvana(smells_like_teen_spirit).txt").
                bufferedReader()
                .readLines().random()
        val fileText21: String =
            applicationContext.assets.open("oasis(live_forever).txt").
                bufferedReader().readLines()
                .random()
        val fileText24: String =
            applicationContext.assets.open("queen(bohemian_rhapsody).txt").
                bufferedReader()
                .readLines().random()
        val fileText26: String =
            applicationContext.assets.
                open("rolling_stones(I_can't_get_no_satisfaction).txt")
                .bufferedReader().readLines().random()
        val fileText29: String =
            applicationContext.assets.open("sex_pistols(god_save_the_queen).txt").
                bufferedReader()
                .readLines().random()
        val fileText31: String =
            applicationContext.assets.open("the_beatles(hey_jude).txt").
                bufferedReader().readLines()
                .random()
        val fileText32: String =
            applicationContext.assets.open("the_clash(london_calling).txt").
                bufferedReader()
                .readLines().random()
        val fileText33: String =
            applicationContext.assets.open("the_eagles(hotel_california).txt").
                bufferedReader()
                .readLines().random()
        val fileText34: String =
            applicationContext.assets.open("the_kinks(waterloo_sunset).txt").
                bufferedReader()
                .readLines().random()
        val fileText36: String =
            applicationContext.assets.open("u2(one).txt").bufferedReader().
                readLines().random()

        val fileText37: String =
            applicationContext.assets.open("whitney_houston(i_will_always_love_you).txt")
                .bufferedReader().readLines().random()


        /**
         * Initializes the current songs from the assets files as strings.
         */
        val fileText1: String =
            applicationContext.assets.open("a_j_tracey(ladbroke_grove).txt").
                bufferedReader()
                .readLines().random()
        val fileText2: String =
            applicationContext.assets.
                open("aitch(taste_make_it_shake).txt").bufferedReader()
                .readLines().random()
        val fileText3: String =
            applicationContext.assets.
                open("ariana_grande___miley_cyrus___lana_del_rey(don't_call_me_angle).txt")
                .bufferedReader().readLines().random()
        val fileText5: String =
            applicationContext.assets.open("dave(professor_x).txt").
                bufferedReader().readLines()
                .random()
        val fileText6: String =
            applicationContext.assets.open("dermot_kennedy(outnumbered).txt").
                bufferedReader()
                .readLines().random()
        val fileText7: String =
            applicationContext.assets.open("dominic_fike(3_nights).txt").bufferedReader()
                .readLines().random()
        val fileText8: String =
            applicationContext.assets.
                open("ed_sheeran_ft_stormzy(take_me_back_to_london).txt")
                .bufferedReader().readLines().random()
        val fileText11: String =
            applicationContext.assets.open("headie_one(both).txt").
                bufferedReader().readLines()
                .random()
        val fileText12: String =
            applicationContext.assets.open("joel_corry(sorry).txt").
                bufferedReader().readLines()
                .random()
        val fileText14: String =
            applicationContext.assets.open("jorja_smith_ft_burna_boy(be_honest).txt")
                .bufferedReader().readLines().random()
        val fileText16: String =
            applicationContext.assets.open("kygo_&_whitney_houston(higher_love).txt")
                .bufferedReader().readLines().random()
        val fileText18: String =
            applicationContext.assets.open("lil_tecca(ransom).txt").
                bufferedReader().readLines()
                .random()
        val fileText22: String =
            applicationContext.assets.open("post_malone(circles).txt").
                bufferedReader().readLines()
                .random()
        val fileText23: String =
            applicationContext.assets.open("post_malone_ft_young_thug(goodbyes).txt")
                .bufferedReader().readLines().random()
        val fileText25: String =
            applicationContext.assets.open("regard(ride_it).txt").
                bufferedReader().readLines()
                .random()
        val fileText27: String =
            applicationContext.assets.open("sam_feldt_ft_rani(post_malone).txt").
                bufferedReader()
                .readLines().random()
        val fileText28: String =
            applicationContext.assets.open("sam_smith(how_do_you_sleep).txt").
                bufferedReader()
                .readLines().random()

        val fileText30: String =
            applicationContext.assets.open("shawn_mendes___camila_cabello(senorita).txt")
                .bufferedReader().readLines().random()
        val fileText35: String =
            applicationContext.assets.open("tones_&_i(dance_monkey).txt").
                bufferedReader()
                .readLines().random()
        val fileText38: String =
            applicationContext.assets.open("young_t_&_bugsey_ft_aitch(strike_a_pose).txt")
                .bufferedReader().readLines().random()

        /**
         * @param randomClassicNumber, generates 18 random numbers(18 classic songs)
         * when the user choose the classic
         * mode to play the game
         */
        var randomClassicNumber = Random.nextInt(17)

        /**
         * @param randomCurrentNumber, generates 20 random numbers(20 current songs)
         * when the user choose the current
         * mode to play the game
         */
        var randomCurrentNumber = Random.nextInt(19)

        /**
         * @param songTitle,takes the title of the song and share it to this screen
         */
        val songTitle = SharedPreferences(this)

        /**
         * @param artist,takes the artist of the song and share it to this screen
         */
        val artist = SharedPreferences(this)

        /**
         * @param mode,takes the game mode of the song and share it to this screen
         */
        val mode = SharedPreferences(this)

        /**
         * @param classic,takes the classic mode of the game and share it to this screen
         */
        val classic = mode.getGameMode()

        /**
         * @param current,takes the current mode of the game and share it to this screen
         */
        val current = mode.getGameMode()


        /**
         * If the user choose the classic mode then the app will generate 18 random lyrics
         * according to classic songs and it will show him/her one of them in the screen to guess
         * the song and the artist of it.
         */
        if (classic == 1) {
            when (randomClassicNumber) {
                0 -> {
                    lyricsSong.text = fileText4
                    songTitle.setSongTitle("like a rolling stone")
                    artist.setArtistSong("bob dylan")
                    songTitle.getTitleL()
                    artist.getArtistSong()
                }
                1 -> {
                    lyricsSong.text = fileText9
                    songTitle.setSongTitle("your song")
                    artist.setArtistSong("elton john")
                    songTitle.getTitleL()
                    artist.getArtistSong()
                }
                2 -> {
                    lyricsSong.text = fileText10
                    songTitle.setSongTitle("sweet child o mine")
                    artist.setArtistSong("guns n roses")
                    songTitle.getTitleL()
                }
                3 -> {
                    lyricsSong.text = fileText13
                    songTitle.setSongTitle("imagine")
                    artist.setArtistSong("john lennon")
                    songTitle.getTitleL()
                    artist.getArtistSong()
                }
                4 -> {
                    lyricsSong.text = fileText15
                    songTitle.setSongTitle("over the rainbow")
                    artist.setArtistSong("judy garland")
                    songTitle.getTitleL()
                    artist.getArtistSong()
                }
                5 -> {
                    lyricsSong.text = fileText17
                    songTitle.setSongTitle("stairway to heaven")
                    artist.setArtistSong("led zeppelin")
                    songTitle.getTitleL()
                    artist.getArtistSong()
                }
                6 -> {
                    lyricsSong.text = fileText19
                    songTitle.setSongTitle("billie jean")
                    artist.setArtistSong("michael jackson")
                    songTitle.getTitleL()
                    artist.getArtistSong()
                }
                7 -> {
                    lyricsSong.text = fileText20
                    songTitle.setSongTitle("smells like a teen spirit")
                    artist.setArtistSong("nirvana")
                    songTitle.getTitleL()
                    artist.getArtistSong()
                }
                8 -> {
                    lyricsSong.text = fileText21
                    songTitle.setSongTitle("live forever")
                    artist.setArtistSong("oasis")
                    songTitle.getTitleL()
                    artist.getArtistSong()
                }
                9 -> {
                    lyricsSong.text = fileText24
                    songTitle.setSongTitle("bohemian rhapsody")
                    artist.setArtistSong("queen")
                    songTitle.getTitleL()
                    artist.getArtistSong()
                }
                10 -> {
                    lyricsSong.text = fileText26
                    songTitle.setSongTitle("i can't get no satisfaction")
                    artist.setArtistSong("rolling stones")
                    songTitle.getTitleL()
                    artist.getArtistSong()
                }
                11 -> {
                    lyricsSong.text = fileText29
                    songTitle.setSongTitle("god save the queen")
                    artist.setArtistSong("sex pistols")
                    songTitle.getTitleL()
                    artist.getArtistSong()
                }
                12 -> {
                    lyricsSong.text = fileText31
                    songTitle.setSongTitle("hey jude")
                    artist.setArtistSong("the beatles")
                    songTitle.getTitleL()
                    artist.getArtistSong()
                }
                13 -> {
                    lyricsSong.text = fileText32
                    songTitle.setSongTitle("london calling")
                    artist.setArtistSong("the clash")
                    songTitle.getTitleL()
                    artist.getArtistSong()
                }
                14 -> {
                    lyricsSong.text = fileText33
                    songTitle.setSongTitle("hotel california")
                    artist.setArtistSong("the eagles")
                    songTitle.getTitleL()
                    artist.getArtistSong()
                }
                15 -> {
                    lyricsSong.text = fileText34
                    songTitle.setSongTitle("waterloo sunset")
                    artist.setArtistSong("the kinks")
                    songTitle.getTitleL()
                    artist.getArtistSong()
                }
                16 -> {
                    lyricsSong.text = fileText36
                    songTitle.setSongTitle("one")
                    artist.setArtistSong("u2")
                    songTitle.getTitleL()
                    artist.getArtistSong()
                }
                17 -> {
                    lyricsSong.text = fileText37
                    songTitle.setSongTitle("i will always love you")
                    artist.setArtistSong("whitney houston")
                    songTitle.getTitleL()
                    artist.getArtistSong()
                }
            }
        }


        /**
         * If the user choose the current mode then the app will generate 20 random lyrics
         * according to current songs and it will show him/her one of them in the screen to guess
         * the song and the artist of it.
         */
        if (current == 2) {
            when (randomCurrentNumber) {
                0 -> {
                    lyricsSong.text = fileText1
                    songTitle.setSongTitle("ladbroke grove")
                    artist.setArtistSong("aj tracey")
                    songTitle.getTitleL()
                    artist.getArtistSong()
                }
                1 -> {
                    lyricsSong.text = fileText2
                    songTitle.setSongTitle("taste make it shake")
                    artist.setArtistSong("aitch")
                    songTitle.getTitleL()
                    artist.getArtistSong()
                }
                2 -> {
                    lyricsSong.text = fileText3
                    songTitle.setSongTitle("don't call me angel")
                    artist.setArtistSong("ariana grande ft miley cyrus ft lana del rey")
                    songTitle.getTitleL()
                    artist.getArtistSong()
                }

                3 -> {
                    lyricsSong.text = fileText5
                    songTitle.setSongTitle("professor x")
                    artist.setArtistSong("dave")
                    songTitle.getTitleL()
                    artist.getArtistSong()
                }
                4 -> {
                    lyricsSong.text = fileText6
                    songTitle.setSongTitle("outnumbered")
                    artist.setArtistSong("dermot kennedy")
                    songTitle.getTitleL()
                    artist.getArtistSong()
                }
                5 -> {
                    lyricsSong.text = fileText7
                    songTitle.setSongTitle("3 nights")
                    artist.setArtistSong("dominic fike")
                    songTitle.getTitleL()
                    artist.getArtistSong()
                }
                6 -> {
                    lyricsSong.text = fileText8
                    songTitle.setSongTitle("take me back to london")
                    artist.setArtistSong("ed sheeran ft stromzy")
                    songTitle.getTitleL()
                    artist.getArtistSong()
                }

                7 -> {
                    lyricsSong.text = fileText11
                    songTitle.setSongTitle("both")
                    artist.setArtistSong("headie one")
                    songTitle.getTitleL()
                    artist.getArtistSong()
                }
                8 -> {
                    lyricsSong.text = fileText12
                    songTitle.setArtistSong("sorry")
                    artist.setArtistSong("joel corry")
                    artist.getArtistSong()
                    songTitle.getTitleL()
                }

                9 -> {
                    lyricsSong.text = fileText14
                    songTitle.setSongTitle("be honest")
                    artist.setArtistSong("jorja smith ft burna boy")
                    songTitle.getTitleL()
                    artist.getArtistSong()
                }

                10 -> {
                    lyricsSong.text = fileText16
                    songTitle.setSongTitle("higher love")
                    artist.setArtistSong("kygo ft whitney houston")
                    songTitle.getTitleL()
                    artist.getArtistSong()
                }

                11 -> {
                    lyricsSong.text = fileText18
                    songTitle.setSongTitle("ransom")
                    artist.setArtistSong("lil tecca")
                    songTitle.getTitleL()
                    artist.getArtistSong()
                }

                12 -> {
                    lyricsSong.text = fileText22
                    songTitle.setSongTitle("circles")
                    artist.setArtistSong("post malone")
                    songTitle.getTitleL()
                    artist.getArtistSong()
                }
                13 -> {
                    lyricsSong.text = fileText23
                    songTitle.setSongTitle("goodbyes")
                    artist.setArtistSong("post malone ft young thug")
                    songTitle.getTitleL()
                    artist.getArtistSong()
                }

                14 -> {
                    lyricsSong.text = fileText25
                    songTitle.setSongTitle("ride it")
                    artist.setArtistSong("regard")
                    songTitle.getTitleL()
                    artist.getArtistSong()
                }

                15 -> {
                    lyricsSong.text = fileText27
                    songTitle.setSongTitle("post malone")
                    artist.setArtistSong("sam feldt ft rani")
                    songTitle.getTitleL()
                    artist.getArtistSong()
                }
                16 -> {
                    lyricsSong.text = fileText28
                    songTitle.setSongTitle("how do you sleep")
                    artist.setArtistSong("sam smith")
                    songTitle.getTitleL()
                    artist.getArtistSong()
                }

                17 -> {
                    lyricsSong.text = fileText30
                    songTitle.setSongTitle("senorita")
                    artist.setArtistSong("shawn mendes ft camila cabello")
                    songTitle.getTitleL()
                    artist.getArtistSong()
                }

                18 -> {
                    lyricsSong.text = fileText35
                    songTitle.setSongTitle("dance monkey")
                    artist.setArtistSong("tones & i")
                    songTitle.getTitleL()
                    artist.getArtistSong()
                }

                19 -> {
                    lyricsSong.text = fileText38
                    songTitle.setSongTitle("strike a pose")
                    artist.setArtistSong("young t ft bugsey ft aitch")
                    songTitle.getTitleL()
                    artist.getArtistSong()
                }
            }
        }


        /**
         * When user click this button can go to the GuessSong Screen of the app
         * to guess the title of the song and the artist of the song.
         */
        nextB.setOnClickListener {
            val switch = Intent(this, GuessSong::class.java)
            startActivity(switch)
        }

    }
}