package com.example.ps_2017_174_maps

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ps_2017_174_maps.Adapters.PlacesListAdapter
import com.example.ps_2017_174_maps.Objects.ClassMaker
import com.example.ps_2017_174_maps.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null


    private val binding get() = _binding!!

    val classmaker=ClassMaker()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        /*
        binding.buttonFirst.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_mapsFragment)
        }
         */
        binding.recyclerviewPlaces.layoutManager= LinearLayoutManager(view.context)
        val place =classmaker.listsdata();

        //Log.i("***************", place.toString())
        //place[0].id
        //place[0].latitude
        binding.recyclerviewPlaces.adapter= PlacesListAdapter(place)


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}