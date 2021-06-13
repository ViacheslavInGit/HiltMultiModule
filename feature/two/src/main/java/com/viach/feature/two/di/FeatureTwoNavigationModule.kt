package com.viach.feature.two.di

import com.viach.common.navigation.Navigator
import com.viach.feature.two.navigation.FeatureTwoNavigatorImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ViewModelScoped
import dagger.hilt.components.SingletonComponent

/**
 * @author ext.vbeliy
 */
@Module
@InstallIn(
//    SingletonComponent::class,
    ActivityComponent::class,
)
interface FeatureTwoNavigationModule {

    @Binds
//    @ViewModelScoped
    fun bindFeatureTwoNavigator(impl: FeatureTwoNavigatorImpl): Navigator.FeatureTwoNavigator
}
