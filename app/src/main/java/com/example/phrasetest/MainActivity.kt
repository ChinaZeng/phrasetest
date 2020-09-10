package com.example.phrasetest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.module1.ModuleAActivity
import com.example.module2.ModuleBActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun app(view: View) {
        startActivity(Intent(this, AppActivity::class.java))
    }

    fun modulea(view: View) {
        startActivity(Intent(this, ModuleAActivity::class.java))
    }

    fun moduleb(view: View) {
        startActivity(Intent(this, ModuleBActivity::class.java))
    }
}