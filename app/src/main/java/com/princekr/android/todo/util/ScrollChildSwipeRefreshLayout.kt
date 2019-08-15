package com.princekr.android.todo.util

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout


/**
 * Extends [SwipeRefreshLayout] to support non-direct descendant scrolling views.
 *
 * [SwipeRefreshLayout] works as expected when a scroll view
 */
class ScrollChildSwipeRefreshLayout @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null
) : SwipeRefreshLayout(context, attrs) {

    var scrollUpChild: View? = null

    override fun canChildScrollUp() = scrollUpChild?.canScrollVertically(-1) ?: super.canChildScrollUp()
}