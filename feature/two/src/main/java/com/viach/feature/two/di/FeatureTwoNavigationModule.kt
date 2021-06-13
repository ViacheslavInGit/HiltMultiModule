package com.viach.feature.two.di

import com.viach.common.navigation.Navigator
import com.viach.feature.two.navigation.FeatureTwoNavigatorImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

/**
 * @author ext.vbeliy
 */
@Module
//cant use in multi module cause for provide dependencies we do not have accessor for viewModel :(
@InstallIn(ViewModelComponent::class)
//@InstallIn(FragmentComponent::class)
interface FeatureTwoNavigationModule {

    @Binds
    @ViewModelScoped
    fun bindFeatureTwoNavigator(impl: FeatureTwoNavigatorImpl): Navigator.FeatureTwoNavigator
}
