package com.example.sockspemaz

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.nio.file.Files.size

class adapter(val ChaussetteAfficher : ArrayList<Chaussette>)
    : RecyclerView.Adapter<adapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ViewHolder {
        val ma_ligne = LayoutInflater.from(parent.context).inflate(R.layout.fragment_gabarit,parent, false)

        return ViewHolder(ma_ligne)
    }

    override fun getItemCount(): Int = ChaussetteAfficher.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val ItemsViewModel = ChaussetteAfficher[position]

        holder.imageView.setImageResource(ItemsViewModel.Image)
        holder.prix.text = ItemsViewModel.prix.toString()
        holder.titre.text = ItemsViewModel.Titre
        holder.Size_S.setOnClickListener{


        }
        holder.Size_M.setOnClickListener{


        }
        holder.Size_L.setOnClickListener{


        }

            }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView)
    {

            val imageView: ImageView = itemView.findViewById(R.id.Image_chaussette)
            val titre: TextView = itemView.findViewById(R.id.title)
            val prix: TextView = itemView.findViewById(R.id.prix)
            val Size_S : Button = itemView.findViewById(R.id.Size_S)
            val Size_M : Button = itemView.findViewById(R.id.size_M)
            val Size_L : Button = itemView.findViewById(R.id.size_L)


    }


}