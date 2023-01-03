package com.example.sockspemaz

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {

    private lateinit var mView : View
    private lateinit var shop : Button
    private lateinit var collabButton: ImageButton
    private lateinit var collab : TextView
    private lateinit var classicButton: ImageButton
    private lateinit var classic : TextView
    private lateinit var VeganButton: ImageButton
    private lateinit var vegan : TextView
    private lateinit var BestSellersButton: ImageButton
    private lateinit var bestSellers : TextView
    private lateinit var pannier: ImageButton






    @SuppressLint("ResourceType", "MissingInflatedId")
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )


        mView = findViewById(R.id.view)
        shop = findViewById(R.id.button)
        collabButton = findViewById(R.id.collab)
        collab = findViewById(R.id.textView2)
        classicButton = findViewById(R.id.classique)
        classic = findViewById(R.id.classiquetext)
        VeganButton = findViewById(R.id.Vegan)
        vegan = findViewById(R.id.VeganText)
        BestSellersButton = findViewById(R.id.Best_Sellers)
        bestSellers = findViewById(R.id.Best_sellers_text)
        pannier = findViewById(R.id.imageButton)


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            shop.setOnClickListener{
                val animationSlideUp = AnimationUtils.loadAnimation(this, R.xml.go_up)
                mView.startAnimation(animationSlideUp)
                mView.visibility=View.GONE
                shop.visibility=View.GONE
                shop.isClickable=false
            }

            val CollabIntent = Intent(this@MainActivity, Collab ::class.java)
            collabButton.setOnClickListener{
                val animationFadeout = AnimationUtils.loadAnimation(this, R.xml.fade_out)
                collab.startAnimation(animationFadeout)
                startActivity(CollabIntent)

            }
            val ClassicIntent = Intent(this@MainActivity, Classic ::class.java)

            classicButton.setOnClickListener{
                val animationFadeout = AnimationUtils.loadAnimation(this, R.xml.fade_out)
                classic.startAnimation(animationFadeout)
                startActivity(ClassicIntent)


            }
            val VeganIntent = Intent(this@MainActivity, Vegan ::class.java)

            VeganButton.setOnClickListener{
                val animationFadeout = AnimationUtils.loadAnimation(this, R.xml.fade_out)
                vegan.startAnimation(animationFadeout)
                startActivity(VeganIntent)


            }
            val BestSellersIntent = Intent(this@MainActivity, BestSellers ::class.java)

            BestSellersButton.setOnClickListener{
                val animationFadeout = AnimationUtils.loadAnimation(this, R.xml.fade_out)
                bestSellers.startAnimation(animationFadeout)
                startActivity(BestSellersIntent)

            }
            val PannierIntent = Intent(this@MainActivity, Pannier ::class.java)

            pannier.setOnClickListener{
                startActivity(PannierIntent)
            }
            }
        }


    }
