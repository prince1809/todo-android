package com.princekr.android.todo

import android.app.Application

/**
 * An application that lazily provides a repository.
 */
class TodoApplication : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}