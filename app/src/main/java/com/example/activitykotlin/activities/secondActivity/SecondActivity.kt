package com.example.activitykotlin.activities.secondActivity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.example.activitykotlin.R

class SecondActivity : AppCompatActivity(), SecondContract.View {

    private val logTag = "SecondActivity.class"
    private lateinit var presenter: SecondContract.Presenter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        presenter = SecondPresenter(this)

        val backButton: Button = findViewById(R.id.back_button)

        backButton.setOnClickListener { _ -> presenter.backButtonPressed()}
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

    override fun finishActivity() {
        finish()
        Log.d(logTag, "Finish second activity")
    }
}
