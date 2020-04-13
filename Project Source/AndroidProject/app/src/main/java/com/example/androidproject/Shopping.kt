package com.example.androidproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_shopping.*


/**
 * This class creates a recycler view that stores all the songs and the points of the user which
 * can buy songs to see artist information.
 */
class Shopping : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping)
        recycleView.layoutManager = LinearLayoutManager(this)
        recycleView.adapter = MainAdapter()
        val actionBar = supportActionBar
        var pointsPreference = SharedPreferences(this)
        var points = pointsPreference.getPoints()
        actionBar!!.title = "Music Game Store   Points: $points"
        actionBar.setDisplayHomeAsUpEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.main, menu)
        return true
    }
}