package com.viach.common.navigation

import androidx.annotation.IdRes
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentFactory
import androidx.fragment.app.FragmentManager
import com.github.terrakok.cicerone.androidx.AppNavigator

/**
 * @author ext.vbeliy
 */
abstract class CoreNavigator(
    activity: FragmentActivity,
    @IdRes val containerLayoutId: Int,
    fragmentManager: FragmentManager = activity.supportFragmentManager,
    fragmentFactory: FragmentFactory = fragmentManager.fragmentFactory
) : AppNavigator(activity, containerLayoutId, fragmentManager, fragmentFactory) {

    protected val topFragment get() = fragmentManager.findFragmentById(containerLayoutId)
}
