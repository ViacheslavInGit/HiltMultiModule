package com.viach.common

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding
import javax.inject.Inject

/**
 * @author ext.vbeliy
 */
abstract class CoreFragment<VM : CoreViewModel, VB : ViewBinding> : Fragment() {

    @Inject
    protected lateinit var viewModelFactory: ViewModelProvider.Factory

    abstract val viewModel: VM

    protected val binding: VB by lazy { inflate(layoutInflater) }

    abstract fun inflate(inflater: LayoutInflater): VB

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = binding.root

}
