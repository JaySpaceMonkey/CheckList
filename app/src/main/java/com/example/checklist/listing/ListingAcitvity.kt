package com.example.checklist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.checklist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var checkListAdapter: CheckListAdapter
    private lateinit var checkList:CheckList

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
         val adapter=CheckListAdapter(listOf(checkList))

        val layoutManager:RecyclerView.LayoutManager=LinearLayoutManager(this@MainActivity)

        binding.recyclerView.adapter=adapter
        binding.recyclerView.layoutManager=layoutManager
         binding.floatButton.setOnClickListener{
             //val intent=Intent(this,layoutInflater.inflate(R.layout.taskcard,parent,false))
               val intentAdd=Intent(this,AddActivity::class.java)
             startActivity(intentAdd)


         }
        /*val btnFill=findViewById<Button>(R.id.buttonfill)
        btnFill.setOnClickListener {
            val intentFormActivity= Intent(this,FormActivity::class.java)
            startActivity(intentFormActivity)

        }*/



    }
}