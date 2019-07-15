package com.example.activitykotlin.activities.mainActivity

import android.content.Context
import android.content.Intent
import android.util.Log
import com.example.activitykotlin.activities.secondActivity.SecondActivity

class MainPresenter(private val view: MainContract.View) : MainContract.Presenter {
    private val logTag = "MainActivity.class"

    override fun newActivityButtonPressed(context: Context) {
        val intent = Intent(context, SecondActivity::class.java)
        context.startActivity(intent)
        Log.d(logTag, "New activity button pressed, creates new activity")
    }


}