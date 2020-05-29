package com.example.orderfoodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.home_tab_layout.*

class MainActivity : AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initTab()
    }

    override fun onResume() {
        super.onResume()

    }

    private fun initTab(){
       home_layout.setOnClickListener {
           home_image.isEnabled = true
           home_text.isEnabled = true
       }
    }


}
