package com.example.first_application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout

class ReadWriteActivity : AppCompatActivity() {
    lateinit var toggle:ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_read_write)

        var drawer=findViewById<DrawerLayout>(R.id.drawer)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        toggle= ActionBarDrawerToggle(this,drawer,R.string.open,R.string.close)

        var lv=findViewById<ListView>(R.id.listview2)
        var place= arrayOf("Ttoranmal","Ssaputara","DonHillStation","wilsonhill","Mmatheran","lonavlamaharashtra","Mmahabaleshwar")
        var adapter=ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,place)
        lv.adapter=adapter

        lv.setOnItemClickListener { adapterView, view, i, l ->
            drawer.closeDrawers()
            when(i){
                0->supportFragmentManager.beginTransaction().replace(R.id.frame,Ttoranmal()).commit()
                1->supportFragmentManager.beginTransaction().replace(R.id.frame,Ssaputara()).commit()
                2->supportFragmentManager.beginTransaction().replace(R.id.frame,DonHillStation()).commit()
                3->supportFragmentManager.beginTransaction().replace(R.id.frame,wilsonhill()).commit()
                4->supportFragmentManager.beginTransaction().replace(R.id.frame,Mmatheran()).commit()
                5->supportFragmentManager.beginTransaction().replace(R.id.frame,lonavlamaharashtra()).commit()
                6->supportFragmentManager.beginTransaction().replace(R.id.frame,Mmahabaleshwar()).commit()


            }
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item))
            return true
        return super.onOptionsItemSelected(item)
    }
}