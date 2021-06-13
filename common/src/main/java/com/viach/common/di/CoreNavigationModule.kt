package com.viach.common.di

import com.github.terrakok.cicerone.Cicerone
import com.github.terrakok.cicerone.NavigatorHolder
import com.viach.common.navigation.CoreRouter
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.components.SingletonComponent

/**
 * @author ext.vbeliy
 */
@Module
@InstallIn(
    SingletonComponent::class,
    ActivityComponent::class,
)
class CoreNavigationModule {

    private val cicerone = Cicerone.create(CoreRouter())

    @Provides
    fun provideCoreRouter(): CoreRouter = cicerone.router

    @Provides
    fun provideNavigatorHolder(): NavigatorHolder = cicerone.getNavigatorHolder()


}
