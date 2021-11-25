package com.example.first_application

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HillStationFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HillStationFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        // Inflate the layout for this fragment
        var v= inflater.inflate(R.layout.fragment_hill_station, container, false)
        Toast.makeText(v.context,"this is toast message",Toast.LENGTH_SHORT).show()

        var hill= arrayOf("Ttoranmal","Ssaputara","DonHillStation","wilsonhill","Mmatheran","lonavlamaharashtra","Mmahabaleshwar")

        var lv=v.findViewById<ListView>(R.id.listview1)

        var adapter=ArrayAdapter(v.context,android.R.layout.simple_expandable_list_item_1,hill)
        lv.adapter=adapter

        lv.setOnItemClickListener { adapterView, view, i, l ->
            var intent=Intent(v.context,HillDetailsActivity::class.java)
            intent.putExtra("HillStation",hill[i])
            startActivity(intent)}

        return v
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HillStationFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HillStationFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}