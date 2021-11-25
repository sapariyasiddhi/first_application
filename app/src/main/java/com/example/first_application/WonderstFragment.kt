package com.example.first_application

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.GridView
import android.widget.ImageView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [WonderstFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class WonderstFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    var wonder= intArrayOf(R.drawable.chichenitza,R.drawable.christtheredeemer,R.drawable.colosseum,R.drawable.greatwallofchina,R.drawable.machupicchu,R.drawable.petra,R.drawable.tajmahal)
    //var temple = intArrayOf(R.drawable.akshardhamtemple,R.drawable.nageshwarjyotirlinga,R.drawable.hutheesingjaintemple,R.drawable.navlakhatemple,R.drawable.suntemple,R.drawable.bileshwarshivatemple,R.drawable.mallinathtemple,R.drawable.bhadreshwarjaintemple)
    var itemBackgroung=0

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
        var style=activity?.obtainStyledAttributes(R.styleable.MyStyle)

        itemBackgroung=style!!.getResourceId(R.styleable.MyStyle_android_galleryItemBackground,0)
        var v= inflater.inflate(R.layout.fragment_wonderst, container, false)

        var iv=v.findViewById<ImageView>(R.id.imageView2)
        iv.setImageResource(wonder[0])
        iv.setBackgroundResource(itemBackgroung)

        var gv=v.findViewById<GridView>(R.id.gridview)
        var b1=v.findViewById<Button>(R.id.button)

        gv.numColumns=wonder.size
        gv.adapter=ImageAdapter(v.context)

        gv.setOnItemClickListener { adapterView, view, i, l ->

            iv.setImageResource(wonder[i])
        }
        b1.setOnClickListener {
            var intent= Intent(v.context,MainActivity2::class.java)
            intent.putExtra("wonder",wonder)
            startActivity(intent)
        }

        return v
    }

    inner class ImageAdapter(context: Context) : BaseAdapter(){
        override fun getCount(): Int {
            return wonder.size
        }

        override fun getItem(p0: Int): Any {
            return p0
        }

        override fun getItemId(p0: Int): Long {
            return p0.toLong()
        }

        override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
            var iv= ImageView(context)
            iv.setImageResource(wonder[p0])
            iv.layoutParams=ViewGroup.LayoutParams(200,200)
            iv.setBackgroundResource(itemBackgroung)
            return iv
        }

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment WonderstFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            WonderstFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}