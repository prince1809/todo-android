package com.princekr.android.todo.data.source

import com.princekr.android.todo.data.Result
import com.princekr.android.todo.data.Task


/**
 * Interface to the data layer.
 */
interface TasksRepository {

    suspend fun getTasks(forUpddate: Boolean = false): Result<List<Task>>
}