package com.viach.common

import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.github.terrakok.cicerone.NavigatorHolder
import com.viach.common.navigation.CoreNavigator
import dagger.hilt.android.AndroidEntryPoint

/**
 * @author ext.vbeliy
 */
abstract class CoreActivity : AppCompatActivity() {

    abstract val navigator: CoreNavigator
    abstract val navigatorHolder: NavigatorHolder

    override fun onResumeFragments() {
        super.onResumeFragments()
        navigatorHolder.setNavigator(navigator)
    }

    override fun onPause() {
        navigatorHolder.removeNavigator()
        super.onPause()
    }
}
