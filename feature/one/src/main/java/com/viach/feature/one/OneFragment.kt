package com.viach.feature.one

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.fragment.app.activityViewModels
import com.viach.common.CoreFragment
import com.viach.feature.one.databinding.FragmentOneBinding
import com.viach.feature.one.di.DaggerFeatureOneComponent
import com.viach.feature.one.di.dependencies.FeatureOneFragmentDependencies
//import com.viach.feature.one.di.dependencies.FeatureOneViewModelDependencies
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.EntryPointAccessors

/**
 * @author ext.vbeliy
 */
@AndroidEntryPoint
class OneFragment : CoreFragment<OneViewModel, FragmentOneBinding>() {

    override val viewModel: OneViewModel by activityViewModels()

    override fun inflate(inflater: LayoutInflater) = FragmentOneBinding.inflate(inflater)

    override fun onCreate(savedInstanceState: Bundle?) {
        DaggerFeatureOneComponent
            .builder()
            .fragmentDependencies(
                EntryPointAccessors.fromFragment(
                    this,
                    FeatureOneFragmentDependencies::class.java,
                )
            )
//            .viewModelDependencies(
//                EntryPointAccessors.fromView(
//                    view,
//                    FeatureOneViewModelDependencies::class.java,
//                )
//            )
            .build()
            .inject(this)

        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.oneTextView.setOnClickListener {
            viewModel.onTextClick()
        }
    }

    companion object {

        fun newInstance() = OneFragment()
    }
}
