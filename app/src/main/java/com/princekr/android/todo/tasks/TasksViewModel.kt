package com.princekr.android.todo.tasks

import androidx.lifecycle.ViewModel
import com.princekr.android.todo.data.source.TasksRepository

/**
 * ViewModel for the task list screen.
 */
class TasksViewModel(
    private val tasksRepository: TasksRepository
) : ViewModel() {

}