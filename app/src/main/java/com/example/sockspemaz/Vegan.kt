package com.example.sockspemaz

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Vegan : AppCompatActivity() {
    private lateinit var recyclerView : RecyclerView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vegan)

        supportActionBar?.hide()
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        CreerMesLigne().clear()
        recyclerView = findViewById(R.id.sample_recyclerView3)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = adapter(CreerMesLigne())
        recyclerView.adapter = adapter

    }
    fun CreerMesLigne() :ArrayList<Chaussette>
    {
        val chaussette = ArrayList<Chaussette>()

        chaussette.add(Chaussette(7,"Vegan Blanc",12.99,R.drawable.vegan1_12_99))
        chaussette.add(Chaussette(8,"Vegan Orage",12.99,R.drawable.vegan2_12_99))
        chaussette.add(Chaussette(9,"Vegan gris",12.99,R.drawable.vegan3_12_99))


        return chaussette
    }
}