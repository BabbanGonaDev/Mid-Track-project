package com.example.noteapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.noteapp.R
import com.example.noteapp.databinding.FragmentSignInBinding


class SignInFragment : Fragment() {
    companion object{
        private const val SIGN_UP_FRAGMENT = "sign_up_fragment"
    }

    private lateinit var binding: FragmentSignInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSignInBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initializeViews()
    }

    private fun initializeViews() {
        initSignUpTextView()
        initLoginButton()
    }

    private fun initLoginButton() {
        binding.btnLogIn.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.flFragment, TodoListFragment())
                .commit()
        }
    }

    private fun initSignUpTextView() {
        binding.tvSignUp.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.flFragment, SignUpFragment(), SIGN_UP_FRAGMENT)
                .addToBackStack(SIGN_UP_FRAGMENT)
                .commit()
        }
    }

}