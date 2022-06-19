package com.example.ps_2017_174_maps.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.ps_2017_174_maps.FirstFragmentDirections
import com.example.ps_2017_174_maps.Models.Places
import com.example.ps_2017_174_maps.R

class PlacesListAdapter (private val dataSet: List<Places>) :
        RecyclerView.Adapter<PlacesListAdapter.ViewHolder>(){


        class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            val name_text: TextView = view.findViewById(R.id.textview_places)

        }


        override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {

            val view = LayoutInflater.from(viewGroup.context)
                .inflate(R.layout.row_item, viewGroup, false)

            return ViewHolder(view)
        }


        override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

            viewHolder.name_text.text = dataSet[position].name

            viewHolder.itemView.setOnClickListener{
                it.findNavController().navigate(
                    FirstFragmentDirections.actionFirstFragmentToMapsFragment(
                        id=dataSet[position].id
                    )
                )
            }

        }


        override fun getItemCount() = dataSet.size

 }


