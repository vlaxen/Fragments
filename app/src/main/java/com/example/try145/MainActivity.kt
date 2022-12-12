package com.example.try145

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    lateinit var fragmentFirst: FragmentFirst
    lateinit var fragmentSecond: FragmentSecond

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fragmentFirst = FragmentFirst.newInstance()
        fragmentSecond = FragmentSecond.newInstance()
    }

    fun switchToFragmentFirst(){
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, fragmentFirst)
            .commit()
    }

    fun switchToFragmentSecond(){
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, fragmentSecond)
            .commit()
    }
}