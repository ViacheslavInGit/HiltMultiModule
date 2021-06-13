package com.viach.feature.one

import com.viach.common.CoreViewModel
import com.viach.common.navigation.Navigator
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * @author ext.vbeliy
 */
@HiltViewModel
class OneViewModel @Inject constructor(
    private val featureTwoNavigator: Navigator.FeatureTwoNavigator,
) : CoreViewModel() {

    fun onTextClick() {
        featureTwoNavigator.openTwoScreen()
    }
}
