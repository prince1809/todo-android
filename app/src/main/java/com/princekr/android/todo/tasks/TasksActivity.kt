package com.princekr.android.todo.tasks

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.princekr.android.todo.R

/**
 * Main activity for the todoapp. Holds the Navigation Host Fragment and the Drawer, Toolbar, etc.
 */
class TasksActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tasks_act)
    }

}