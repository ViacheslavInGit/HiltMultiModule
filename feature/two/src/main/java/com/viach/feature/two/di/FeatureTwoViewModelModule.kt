package com.viach.feature.two.di

import androidx.lifecycle.ViewModel
import com.viach.common.di.ViewModelKey
import com.viach.feature.two.TwoViewModel
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.FragmentComponent
import dagger.multibindings.IntoMap

/**
 * @author ext.vbeliy
 */
@Module
@InstallIn(
    ActivityComponent::class,
    FragmentComponent::class,
)
interface FeatureTwoViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(TwoViewModel::class)
    fun bindsMainViewModel(viewModel: TwoViewModel): ViewModel
}
