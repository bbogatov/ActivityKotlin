package com.example.activitykotlin.activities.secondActivity

import android.util.Log

class SecondPresenter(private val view: SecondContract.View) : SecondContract.Presenter {
    private val logTag = "SecondPresenter.class"


    override fun backButtonPressed() {
        view.finishActivity()
        Log.d(logTag, "Back button in SecondActivity.class pressed")
    }

}