package com.viach.hiltmultimodule.navigation

import com.viach.common.navigation.CoreNavigator
import com.viach.hiltmultimodule.ui.MainActivity
import com.viach.hiltmultimodule.R

/**
 * @author ext.vbeliy
 */
class MainActivityNavigator(
    activity: MainActivity,
) : CoreNavigator(
    activity = activity,
    containerLayoutId = R.id.fragmentContainerView,
)
