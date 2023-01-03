package com.example.sockspemaz

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.WindowManager
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Collab : AppCompatActivity() {
    private lateinit var recyclerView : RecyclerView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_collab)

        supportActionBar?.hide()
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        CreerMesLigne().clear()

        recyclerView = findViewById(R.id.sample_recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = adapter(CreerMesLigne())
        recyclerView.adapter = adapter

    }
    fun CreerMesLigne() :ArrayList<Chaussette>
    {
        val chaussette = ArrayList<Chaussette>()
        chaussette.add(Chaussette(1,"Batman",11.99,R.drawable.bat1_11_99))
        chaussette.add(Chaussette(2,"Joker",11.99,R.drawable.joker1_11_99))
        chaussette.add(Chaussette(5,"Bart Simpson",19.99,R.drawable.simpson1_19_99))
        chaussette.add(Chaussette(6,"The Simpson",19.99,R.drawable.simpson2_19_99))

        return chaussette
    }
}