package com.princekr.android.todo.statistics

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

/**
 * Main UI for the statistics screen.
 */
class StatisticsFragment : Fragment() {

    private lateinit var viewDataBinding: StatisticsFragment

    //private val viewModel by viewModels<Statist> {  }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }
}