package com.example.sockspemaz

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlin.properties.Delegates

class Pannier : AppCompatActivity() {
    private lateinit var recyclerView : RecyclerView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pannier)

        supportActionBar?.hide()
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        recyclerView = findViewById(R.id.sample_recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = adapter(CreerMesLigne())
        recyclerView.adapter = adapter

    }
    fun CreerMesLigne() :ArrayList<Chaussette>
    {
        val chaussette = ArrayList<Chaussette>()

        return chaussette
    }
}