package com.example.checklist


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView

class FormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)
        val answers=resources.getStringArray(R.array.radio_list)
        val arrayAdapter=ArrayAdapter(this,R.layout.drawablequestion1,answers)
        val some=findViewById<AutoCompleteTextView>(R.id.autoCompleteTextView)
        some.setAdapter(arrayAdapter)


    }
}