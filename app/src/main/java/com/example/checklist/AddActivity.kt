package com.example.checklist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.checklist.databinding.ActivityAddBinding

class AddActivity : AppCompatActivity() {
    private lateinit var binding:ActivityAddBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAddBinding.inflate(layoutInflater)
        setContentView(binding.root)
       var list= mutableListOf<CheckList>()
        binding.buttonSave.setOnClickListener {

        }
    }
}