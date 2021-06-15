package com.viach.feature.one.di.module

import com.viach.common.navigation.Navigator
import com.viach.feature.one.navigation.FeatureOneNavigatorImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

/**
 * @author ext.vbeliy
 */
@Module
@InstallIn(
    ActivityComponent::class,
)
interface FeatureOneNavigationModule {

    @Binds
    fun bindFeatureTwoNavigator(impl: FeatureOneNavigatorImpl): Navigator.FeatureOneNavigator
}
