package com.viach.feature.one.di.module

import androidx.lifecycle.ViewModel
import com.viach.common.di.ViewModelKey
import com.viach.feature.one.OneViewModel
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoMap

/**
 * @author ext.vbeliy
 */
@Module
@InstallIn(
//    SingletonComponent::class,
    ActivityComponent::class,
//    FragmentComponent::class,
//    ViewModelComponent::class,
)
interface FeatureOneViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(OneViewModel::class)
    fun bindsMainViewModel(viewModel: OneViewModel): ViewModel
}
