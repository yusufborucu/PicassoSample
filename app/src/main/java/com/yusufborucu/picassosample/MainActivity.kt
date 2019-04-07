package com.yusufborucu.picassosample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // temel kullanım
        Picasso.get()
               .load("http://yazilim.xyz/resimler/manzara.jpg")
               .into(imageView)

        // resize
        /*Picasso.get()
               .load("http://yazilim.xyz/resimler/manzara.jpg")
               .resize(500, 500)
               .into(imageView)*/

        // rotate
        /*Picasso.get()
               .load("http://yazilim.xyz/resimler/manzara.jpg")
               .rotate(90F)
               .into(imageView)*/
    }
}
