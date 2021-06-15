package com.viach.common.di

import com.github.terrakok.cicerone.Cicerone
import com.github.terrakok.cicerone.NavigatorHolder
import com.viach.common.navigation.CoreRouter
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

/**
 * @author ext.vbeliy
 */
@Module
@InstallIn(
    ActivityComponent::class,
)
class CoreNavigationModule {

    private val cicerone = Cicerone.create(CoreRouter())

    @Provides
    fun provideCoreRouter(): CoreRouter = cicerone.router

    @Provides
    fun provideNavigatorHolder(): NavigatorHolder = cicerone.getNavigatorHolder()


}
