package com.example.orderfoodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
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

        for (i in 0 until tab_layout.childCount){
            val child = tab_layout.getChildAt(i)
            child.setOnClickListener {
                view -> changetab(i)
            }

        }

       }

    private fun changetab(index : Int) {
        for (i in 0 until tab_layout.childCount){
            val child = tab_layout.getChildAt(i)
            if (i == index){
                changetabItem(child,false);
            }else{
                changetabItem(child,true);
            }
        }
    }

    private fun changetabItem(child : View, isEnable : Boolean) {
        child.isEnabled = isEnable
        if (child is ViewGroup){
            for (i in 0 until child.childCount){
                child.getChildAt(i).isEnabled = isEnable
            }

        }
    }
}



