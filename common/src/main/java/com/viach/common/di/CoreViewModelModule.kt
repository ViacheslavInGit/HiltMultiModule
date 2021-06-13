package com.viach.common.di

import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.components.SingletonComponent

/**
 * @author ext.vbeliy
 */
@Module
@InstallIn(
//    SingletonComponent::class,
    ActivityComponent::class,
//    FragmentComponent::class,
)
interface CoreViewModelModule {

    @Binds
    fun bindViewModelFactory(impl: ViewModelFactory): ViewModelProvider.Factory
}
