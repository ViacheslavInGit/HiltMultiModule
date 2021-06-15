package com.viach.feature.one

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.fragment.app.viewModels
import com.viach.common.CoreFragment
import com.viach.feature.one.databinding.FragmentOneBinding
import com.viach.feature.one.di.DaggerFeatureOneComponent
import com.viach.feature.one.di.dependencies.FeatureOneActivityDependencies
//import com.viach.feature.one.di.dependencies.FeatureOneViewModelDependencies
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.EntryPointAccessors

/**
 * @author ext.vbeliy
 */
// not need here cause i inject from own component
//@AndroidEntryPoint
class OneFragment : CoreFragment<OneViewModel, FragmentOneBinding>() {

    //inject from factory, so cant use this
    //override val viewModel: OneViewModel by activityViewModels()

    //use own factory
    override val viewModel: OneViewModel by viewModels { viewModelFactory }

    override fun inflate(inflater: LayoutInflater) = FragmentOneBinding.inflate(inflater)

    override fun onCreate(savedInstanceState: Bundle?) {
        DaggerFeatureOneComponent
            .builder()
            .activityDependencies(
                EntryPointAccessors.fromActivity(
                    requireActivity(),
                    FeatureOneActivityDependencies::class.java,
                )
            )
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
