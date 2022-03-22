package com.example.checklist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputBinding
import com.example.checklist.databinding.ActivityInputBinding

class InputActivity : AppCompatActivity() {
    private lateinit var binding:ActivityInputBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityInputBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}