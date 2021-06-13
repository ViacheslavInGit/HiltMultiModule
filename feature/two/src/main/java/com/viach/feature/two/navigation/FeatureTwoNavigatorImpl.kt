package com.viach.feature.two.navigation

import com.viach.common.navigation.CoreRouter
import com.viach.common.navigation.Navigator
import javax.inject.Inject

/**
 * @author ext.vbeliy
 */
class FeatureTwoNavigatorImpl @Inject constructor(
    private val router: CoreRouter,
) : Navigator.FeatureTwoNavigator {

    override fun openTwoScreen() {
        router.navigateTo(FeatureTwoScreens.twoScreen())
    }
}
