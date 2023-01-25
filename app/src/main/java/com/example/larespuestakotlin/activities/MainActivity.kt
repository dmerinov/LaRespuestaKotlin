package com.example.larespuestakotlin.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.larespuestakotlin.R
import com.example.larespuestakotlin.databinding.ActivityMainBinding
import com.example.larespuestakotlin.presenters.MainActivityView
import com.example.larespuestakotlin.presenters.MainPresenter

class MainActivity : AppCompatActivity(), MainActivityView {

    private lateinit var binding: ActivityMainBinding
    private val presener = MainPresenter(this@MainActivity)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initializeUI()
        presener.findAnswer()

    }

    private fun initializeUI() {
        //here goes everything that has to do with setting up the interface
    }

    override fun printMessage(message: String) {
        binding.respuestaView.text = message
    }
}