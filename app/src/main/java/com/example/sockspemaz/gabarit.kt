package com.example.sockspemaz

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.SpinnerAdapter


class gabarit : Fragment() {
    lateinit var SizeS : Button
    lateinit var SizeM : Button
    lateinit var SizeL : Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreate(savedInstanceState)
        val result = inflater.inflate(R.layout.fragment_gabarit, container, false)
            SizeS = result.findViewById(R.id.Size_S)
            SizeM = result.findViewById(R.id.size_M)
            SizeL = result.findViewById(R.id.size_L)



        SizeS.setOnClickListener{
            Log.d("Size" , "ca Marche")
        }

        return result

    }


}




