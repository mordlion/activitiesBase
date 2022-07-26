package com.course.activitiesbasic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class leagueChooser : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league_choser)
        val menBtn = findViewById<Button>(R.id.menBtn)
        val womenBtn = findViewById<Button>(R.id.womenBtn)
        val ufoBtn = findViewById<Button>(R.id.ufoBtn)

        fun leagueNxtBtn(view: View){
            val skillActivity = Intent(this, Skill::class.java)
            startActivity(skillActivity)
        }
    }
}