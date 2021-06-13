package com.viach.hiltmultimodule.di

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

/**
 * @author ext.vbeliy
 */
@Module
@InstallIn(ActivityComponent::class)
class AppNavigationModule {

}
