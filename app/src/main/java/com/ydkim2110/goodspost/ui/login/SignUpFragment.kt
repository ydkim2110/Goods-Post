package com.ydkim2110.goodspost.ui.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil

import com.ydkim2110.goodspost.R
import com.ydkim2110.goodspost.databinding.FragmentSignUpBinding
import com.ydkim2110.goodspost.utils.replaceFragment

class SignUpFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentSignUpBinding>(inflater, R.layout.fragment_sign_up, container, false)
        binding.lifecycleOwner = this
        binding.callback = loginActionCallback
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViews()
    }

    private fun initViews() {

    }

    private val loginActionCallback = object : LoginActionCallback {
        override fun onActionViewClicked(view: View) {
            when (view.id) {
                R.id.textSignIn, R.id.imageBack -> {
                    (requireActivity() as AppCompatActivity).replaceFragment(LoginFragment(), R.id.layoutContainer)
                }
            }
        }
    }
}
