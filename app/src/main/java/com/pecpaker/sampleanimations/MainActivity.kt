package com.pecpaker.sampleanimations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Comment out any of the view animation in the anim folder to make use of it

        val button = findViewById<Button>(R.id.anim)
        val translate = AnimationUtils.loadAnimation(this, R.anim.translate)
        button.startAnimation(translate)

        val imageanim = findViewById<ImageView>(R.id.imgscale)
        imageanim.startAnimation(translate)

    }
}