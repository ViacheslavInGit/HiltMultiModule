package com.viach.feature.one.di.dependencies

import androidx.lifecycle.ViewModelProvider
import com.viach.common.navigation.Navigator
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

/**
 * @author ext.vbeliy
 */
@EntryPoint
@InstallIn(
    ActivityComponent::class,
)
interface FeatureOneActivityDependencies {

    //dependency provided by common module, cause it can provided by @AndroidEntryPoint
    //but here injecting by own component, so we have to enumerate all deps :(
    fun viewModelFactory(): ViewModelProvider.Factory

    fun featureTwoNavigator(): Navigator.FeatureTwoNavigator
}
