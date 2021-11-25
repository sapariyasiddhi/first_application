package com.example.first_application

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class b4Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b4)


        var ad= AnimationDrawable()

        var frame1=resources.getDrawable(R.drawable.nageshwarjyotirlinga,null)
        var frame2=resources.getDrawable(R.drawable.hutheesingjaintemple,null)
        var frame3=resources.getDrawable(R.drawable.navlakhatemple,null)
        var frame4=resources.getDrawable(R.drawable.suntemple,null)
        var frame5=resources.getDrawable(R.drawable.bileshwarshivatemple,null)
        var frame6=resources.getDrawable(R.drawable.mallinathtemple,null)
        var frame7=resources.getDrawable(R.drawable.bhadreshwarjaintemple,null)


        ad.addFrame(frame1,900)
        ad.addFrame(frame2,900)
        ad.addFrame(frame3,900)
        ad.addFrame(frame4,900)
        ad.addFrame(frame5,900)
        ad.addFrame(frame6,900)
        ad.addFrame(frame7,900)



        var iv=findViewById<ImageView>(R.id.imageView)
        iv.background=ad

        ad.start()
    }
}