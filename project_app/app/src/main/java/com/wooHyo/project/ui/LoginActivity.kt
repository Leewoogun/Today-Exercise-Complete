package com.wooHyo.project.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wooHyo.project.R
import com.wooHyo.project.databinding.ActivityLoginBinding
import com.wooHyo.project.ui.login.LoginFragment

class LoginActivity : AppCompatActivity() {

    private lateinit var binding : ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        openLoginFragment()
    }

    private fun openLoginFragment(){
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container_login, LoginFragment())
            .commit()
    }
}