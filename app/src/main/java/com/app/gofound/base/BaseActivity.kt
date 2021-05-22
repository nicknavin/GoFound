package com.app.gofound.base

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity

class BaseActivity : AppCompatActivity()
{
    lateinit var context: Context
    lateinit var activity: Activity
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        context=this
        activity=this
    }





}