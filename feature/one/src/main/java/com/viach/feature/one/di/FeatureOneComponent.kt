package com.viach.feature.one.di

import com.viach.feature.one.OneFragment
import com.viach.feature.one.di.dependencies.FeatureOneFragmentDependencies
//import com.viach.feature.one.di.dependencies.FeatureOneViewModelDependencies
import dagger.Component

/**
 * @author ext.vbeliy
 */
@Component(
    dependencies = [
        FeatureOneFragmentDependencies::class,
//        FeatureOneViewModelDependencies::class,
    ]
)
interface FeatureOneComponent {

    fun inject(fragment: OneFragment)

    @Component.Builder
    interface Builder {
//        fun viewModelDependencies(viewModelDependencies: FeatureOneViewModelDependencies): Builder
        fun fragmentDependencies(fragmentDependencies: FeatureOneFragmentDependencies): Builder
        fun build(): FeatureOneComponent
    }
}
