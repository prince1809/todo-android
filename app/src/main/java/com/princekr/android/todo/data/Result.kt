package com.princekr.android.todo.data

sealed class Result<out R> {
    data class Success<out T>(val data: T) : Result<T>()
}