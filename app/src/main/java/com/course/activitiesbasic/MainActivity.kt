package com.course.activitiesbasic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.view.ViewCompat

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nxtBtn= findViewById<Button>(R.id.nxtBtn)

        nxtBtn.setOnClickListener {
val leagueIntent = Intent( this,leagueChooser::class.java)
        startActivity(leagueIntent)}

    }
}