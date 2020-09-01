package com.example.gameqizz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //declare the animation
        val ttb = AnimationUtils.loadAnimation(this, R.anim.ttb);
        val stb = AnimationUtils.loadAnimation(this, R.anim.stb);
        val btt = AnimationUtils.loadAnimation(this, R.anim.btt);
        val btt2 = AnimationUtils.loadAnimation(this, R.anim.btt2);
        val btt3 = AnimationUtils.loadAnimation(this, R.anim.btt3);
        val btt4 = AnimationUtils.loadAnimation(this, R.anim.btn_next);


        val headertitle = findViewById(R.id.headerTitle) as TextView
        val subtitle = findViewById(R.id.subtitle) as TextView

        val ic_cards = findViewById(R.id.ic_cards) as ImageView
        val resultOne = findViewById(R.id.resultOne) as LinearLayout
        val resulTwo = findViewById(R.id.resultTwo) as LinearLayout
        val resultThree = findViewById(R.id.resultThree) as LinearLayout
        val btnnext = findViewById(R.id.btn_next_yours) as Button


        //set animation
        headertitle.startAnimation(ttb)
        subtitle.startAnimation(ttb)
        ic_cards.startAnimation(stb)
        resultOne.startAnimation(btt)
        resulTwo.startAnimation(btt2)
        resultThree.startAnimation(btt3)
        btnnext.startAnimation(btt4)
    }
}