package com.course.activitiesbasic

import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.course.activitiesbasic.databinding.ActivityBaseBinding

open class BaseActivity : AppCompatActivity() {
val Tag ="lifeCycle"

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(Tag, "${javaClass.simpleName} Oncreate")
        super.onCreate(savedInstanceState)

    }

    override fun onStart() {
        super.onStart()
        Log.d(Tag, "${javaClass.simpleName} onStart")


    }

    override fun onResume() {

        super.onResume()
        Log.d(Tag, "${javaClass.simpleName} onResume")

    }

    override fun onPause() {
        Log.d(Tag, "${javaClass.simpleName} onPause")

        super.onPause()
    }

    override fun onStop() {
        Log.d(Tag, "${javaClass.simpleName} onStop")

        super.onStop()
    }

    override fun onDestroy() {
        Log.d(Tag, "${javaClass.simpleName} onDestroy")

        super.onDestroy()
    }
}