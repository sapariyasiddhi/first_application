package com.example.first_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ListView

class HillDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hill_details)

        var b3=findViewById<Button>(R.id.button3)

        var Hill=intent.getStringExtra("HillStation")!!.lowercase()

        var iid=resources.getIdentifier(Hill,"drawable",packageName)
        var iv=findViewById<ImageView>(R.id.imageView1)

        iv.setImageResource(iid)

        b3.setOnClickListener {
            var intent= Intent(applicationContext,ReadWriteActivity::class.java)
            intent.putExtra("HillStation",Hill)
            startActivity(intent)
        }

    }
}