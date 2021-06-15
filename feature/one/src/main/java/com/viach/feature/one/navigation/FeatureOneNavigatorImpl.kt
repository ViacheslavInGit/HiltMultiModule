package com.viach.feature.one.navigation

import com.viach.common.navigation.CoreRouter
import com.viach.common.navigation.Navigator
import javax.inject.Inject

/**
 * @author ext.vbeliy
 */
class FeatureOneNavigatorImpl @Inject constructor(
    private val router: CoreRouter,
) : Navigator.FeatureOneNavigator {

    override fun openOneScreen() {
        router.navigateTo(FeatureOneScreens.oneScreen())
    }
}
