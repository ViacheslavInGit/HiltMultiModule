package com.viach.hiltmultimodule.ui

import android.os.Bundle
import com.github.terrakok.cicerone.NavigatorHolder
import com.viach.common.CoreActivity
import com.viach.common.navigation.CoreRouter
import com.viach.feature.one.navigation.FeatureOneScreens
import com.viach.hiltmultimodule.R
import com.viach.hiltmultimodule.navigation.MainActivityNavigator
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : CoreActivity() {

    @Inject
    lateinit var mainNavigatorHolder: NavigatorHolder

    @Inject
    lateinit var router: CoreRouter

    override val navigator = MainActivityNavigator(this)
    override val navigatorHolder get() = mainNavigatorHolder

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        router.newRootScreen(FeatureOneScreens.oneScreen())
    }
}
