package com.viach.feature.two

import android.view.LayoutInflater
import androidx.fragment.app.viewModels
import com.viach.common.CoreFragment
import com.viach.feature.two.databinding.FragmentTwoBinding
import dagger.hilt.android.AndroidEntryPoint

/**
 * @author ext.vbeliy
 */
@AndroidEntryPoint
class TwoFragment : CoreFragment<TwoViewModel, FragmentTwoBinding>() {

    override val viewModel: TwoViewModel by viewModels { viewModelFactory }

    override fun inflate(inflater: LayoutInflater) = FragmentTwoBinding.inflate(inflater)

    companion object {

        fun newInstance() = TwoFragment()
    }
}
