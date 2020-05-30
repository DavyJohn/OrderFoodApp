package com.example.orderfoodapp

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.orderfoodapp.ui.fragments.HomeFragment
import com.example.orderfoodapp.ui.fragments.MoreFragment
import com.example.orderfoodapp.ui.fragments.OrderFragment
import com.example.orderfoodapp.ui.fragments.PersonFragment
import kotlinx.android.synthetic.main.home_tab_layout.*

class MainActivity : AppCompatActivity()  {
    val  fragment : List<Fragment> = listOf<Fragment>(HomeFragment(),OrderFragment(),PersonFragment(),MoreFragment())
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

        supportFragmentManager.beginTransaction().replace(R.id.content,fragment.get(index)).commit()
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



