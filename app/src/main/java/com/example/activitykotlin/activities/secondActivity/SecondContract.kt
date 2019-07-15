package com.example.activitykotlin.activities.secondActivity

interface SecondContract {

    interface View {
        fun finishActivity()

    }

    interface Presenter {
        fun backButtonPressed()
    }

}