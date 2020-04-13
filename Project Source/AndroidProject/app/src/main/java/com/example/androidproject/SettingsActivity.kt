package com.example.androidproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import kotlinx.android.synthetic.main.activity_settings.*


/**
 * This class shows the Settings Screen of the Mobile App.In this screen user can change the
 * Game Mode which is Current by default.
 */
class SettingsActivity : AppCompatActivity(),View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        current.setOnClickListener(this)


        /**
         * @param newpref, takes the game mode which user choose to play from SharedPreferencesCLass
         * @param mode, initializes the newpref to get the mode of the user
         */
        var newpref = SharedPreferences(this)
        var mode = newpref.getGameMode()


        /**
         * If the game mode is in 1 which means is in classic mode then
         * enables the classic mode checkbox else enables the current mode game.
         */
        if(mode == 1){
            classic.isChecked = true
        } else {
            current.isChecked=true
        }

        /**
         * makes the game mode classic by default
         */
        classic.setOnClickListener(this)


        /**
         * By pressing the save button user can save the game mode that will choose
         * to play and it will restrict him/her to MainActivity Screen to play the game.
         */
        saveButton.setOnClickListener {
            val switch = Intent(this,MainActivity::class.java)
            startActivity(switch)
            finish()
         }
    }


    /**
     * @param v, checkBox of choosing the game mode
     * @param chooseMode,available modes of choosing the game mode
     *
     * With this method user can choose the game mode that he/she wants to play
     * by clicking the two options that are in the checkbox.Also each of the game Mode
     * is stored in SharedPrefernces Class so every screen can see the game mode
     * that user choose. If chooses classic then classic box
     * is enabled and current is unabled else if chooses the current then current box is enabled and
     * clessic is unabled.
     */
    override fun onClick(v: View?) {
        v as CheckBox
        var chooseMode = v.isChecked
        when(v.id){
            R.id.current -> if(chooseMode){
                classic.isChecked = false
                val gameMode = SharedPreferences(this)
                gameMode.setGameMode(2)
            }
            R.id.classic -> if(chooseMode){
                val gameMode = SharedPreferences(this)
                gameMode.setGameMode(1)
                current.isChecked = false
            }
        }
    }

    /**
     * This method doesn't allow user to use the back button of navigation bar
     * to navigate to the previous activity.
     */
    override fun onBackPressed() {

    }
}