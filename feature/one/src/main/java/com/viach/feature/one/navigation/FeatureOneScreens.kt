package com.viach.feature.one.navigation

import com.github.terrakok.cicerone.androidx.FragmentScreen
import com.viach.feature.one.OneFragment

/**
 * @author ext.vbeliy
 */
object FeatureOneScreens {

    fun oneScreen() = FragmentScreen {
        OneFragment.newInstance()
    }
}
