package com.princekr.android.todo.util

import androidx.fragment.app.Fragment
import com.princekr.android.todo.ViewModelFactory

fun Fragment.getViewModelFactory(): ViewModelFactory {
    return ViewModelFactory()
}