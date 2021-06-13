package com.viach.feature.one.di.dependencies

import androidx.lifecycle.ViewModelProvider
import com.viach.common.navigation.Navigator
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent

/**
 * @author ext.vbeliy
 */
@EntryPoint
@InstallIn(FragmentComponent::class)
interface FeatureOneFragmentDependencies {

    fun viewModelFactory(): ViewModelProvider.Factory

    fun featureTwoNavigator(): Navigator.FeatureTwoNavigator
}
