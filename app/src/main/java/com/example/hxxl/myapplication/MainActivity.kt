package com.example.hxxl.myapplication

import android.app.ActivityOptions
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Pair
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        card.setOnClickListener {
            if (text_hide.visibility == View.GONE) {
                text_hide.visibility = View.VISIBLE
            }else{text_hide.visibility = View.GONE}
        }

        yes.setOnClickListener{
            val i = Intent(this,Main2Activity::class.java)
            val pair = Pair<View, String>(text1,"text")
            val opt = ActivityOptions.makeSceneTransitionAnimation(this,pair)
            startActivity(i,opt.toBundle())
        }



    }
}
