package com.example.activitykotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.example.activitykotlin.activities.mainActivity.MainContract
import com.example.activitykotlin.activities.mainActivity.MainPresenter

class MainActivity : AppCompatActivity(), MainContract.View {
    private val logTag = "MainActivity.class"

    /**
     * Presenter that contains all business logic
     */
    private lateinit var presenter: MainContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainPresenter(this)

        val newActivityButton: Button = findViewById(R.id.new_activity)
        newActivityButton.setOnClickListener { _ -> presenter.newActivityButtonPressed(this) }

    }

    override fun onStart() {
        super.onStart()
        Log.d(logTag, "on Start")
    }

    override fun onResume() {
        super.onResume()
        Log.d(logTag, "on Resume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(logTag, "on Pause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(logTag, "on Stop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(logTag, "on Destroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(logTag, "on Restart")
    }

}
