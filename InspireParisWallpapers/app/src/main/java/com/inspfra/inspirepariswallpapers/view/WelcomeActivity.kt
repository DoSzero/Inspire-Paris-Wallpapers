package com.inspfra.inspirepariswallpapers.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.inspfra.inspirepariswallpapers.R


class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        Handler(Looper.getMainLooper()).postDelayed({
           val intent = Intent(this, WallPaperActivity::class.java)
            startActivity(intent)
            finish()
        }, 1750)

    }
}