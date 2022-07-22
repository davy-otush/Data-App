package com.otundo.dataapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this)[MainActivityViewModel::class.java]
        val textView = findViewById<TextView>(R.id.tvCount)
        val buttonCount = findViewById<Button>(R.id.btnCount)

        viewModel.count.observe(this) {
            textView.text = it.toString()
        }

        buttonCount.setOnClickListener {

            viewModel.updateCount()
        }
    }
}