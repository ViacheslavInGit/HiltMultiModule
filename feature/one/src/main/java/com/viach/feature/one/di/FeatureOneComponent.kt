package com.viach.feature.one.di

import com.viach.feature.one.OneFragment
import com.viach.feature.one.di.dependencies.FeatureOneActivityDependencies
//import com.viach.feature.one.di.dependencies.FeatureOneViewModelDependencies
import dagger.Component

/**
 * @author ext.vbeliy
 */
@Component(
    dependencies = [
        FeatureOneActivityDependencies::class,
    ]
)
interface FeatureOneComponent {

    fun inject(fragment: OneFragment)

    @Component.Builder
    interface Builder {
        fun activityDependencies(activityDependencies: FeatureOneActivityDependencies): Builder
        fun build(): FeatureOneComponent
    }
}
