package com.example.sockspemaz

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Classic : AppCompatActivity() {
    private lateinit var recyclerView : RecyclerView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_classic)

        supportActionBar?.hide()
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        CreerMesLigne().clear()
        recyclerView = findViewById(R.id.sample_recyclerView1)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = adapter(CreerMesLigne())
        recyclerView.adapter = adapter

    }
    fun CreerMesLigne() :ArrayList<Chaussette>
    {
        val chaussette = ArrayList<Chaussette>()

        chaussette.add(Chaussette(3,"Noir Haute",11.99,R.drawable.black1_11_99))
        chaussette.add(Chaussette(4,"Noir Basse",10.49,R.drawable.black2_10_49))
        chaussette.add(Chaussette(10,"Blanc Haute",11.99,R.drawable.white1_11_99))
        chaussette.add(Chaussette(11,"Blanc Basse",10.49,R.drawable.white2_10_49))

        return chaussette
    }
}