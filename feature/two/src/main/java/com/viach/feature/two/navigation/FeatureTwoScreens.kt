package com.viach.feature.two.navigation

import com.github.terrakok.cicerone.androidx.FragmentScreen
import com.viach.feature.two.TwoFragment

/**
 * @author ext.vbeliy
 */
internal object FeatureTwoScreens {

    fun twoScreen() = FragmentScreen {
        TwoFragment.newInstance()
    }
}
