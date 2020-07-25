package com.ydkim2110.goodspost.ui.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentTransaction

import com.ydkim2110.goodspost.R
import com.ydkim2110.goodspost.databinding.FragmentLoginBinding
import com.ydkim2110.goodspost.utils.replaceFragment
import timber.log.Timber

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentLoginBinding>(inflater, R.layout.fragment_login, container, false)
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
                R.id.textSignUp -> {
                   val fm = requireActivity().supportFragmentManager
                    fm.beginTransaction()
                        .setCustomAnimations(R.anim.enter_b, R.anim.exit_a, R.anim.enter_a, R.anim.exit_b)
                        .replace(R.id.layoutContainer, SignUpFragment())
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }
                R.id.buttonSignIn -> {
                    Timber.d("buttonSignIn clicked!")
                }
            }
        }
    }

}
