package com.maslan.navigationcomponent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.maslan.navigationcomponent.common.delegete.viewBinding
import com.maslan.navigationcomponent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by viewBinding(ActivityMainBinding::inflate)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


    }
}