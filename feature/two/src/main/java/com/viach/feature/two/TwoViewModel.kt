package com.viach.feature.two

import com.viach.common.CoreViewModel
import com.viach.common.navigation.Navigator
import javax.inject.Inject

/**
 * @author ext.vbeliy
 */
class TwoViewModel @Inject constructor(
    private val featureOneNavigator: Navigator.FeatureOneNavigator,
) : CoreViewModel() {

    fun onTextClick() {
        featureOneNavigator.openOneScreen()
    }
}
