package com.example.activitykotlin.activities.mainActivity

import android.content.Context

interface MainContract {

    interface View {

    }

    interface Presenter {
        fun newActivityButtonPressed(context: Context)
    }
}