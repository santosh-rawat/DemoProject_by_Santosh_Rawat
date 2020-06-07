package com.example.demoproject_by_santosh_rawat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class WelcomePage : AppCompatActivity() {

    private val fragmentManager = supportFragmentManager
    private val firstFragment = AppFragment()
    private val secondFragment = AppFragment1()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_page)

        /* Display First Fragment initially */
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.myFragment, firstFragment)
        fragmentTransaction.commit()

    }
    fun btnOne(v:View){
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.myFragment, firstFragment)
        fragmentTransaction.commit()
    }

    fun btnTwo(v:View){
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.myFragment, secondFragment)
        fragmentTransaction.commit()
    }
}
