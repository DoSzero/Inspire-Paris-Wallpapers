package com.inspfra.inspirepariswallpapers

import android.app.WallpaperManager
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.inspfra.inspirepariswallpapers.view.WallPaperActivity
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    private var bSetWallPaper: Button? = null
    private lateinit var wallImg: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        wallImg = findViewById(R.id.wallpaper_image)
        val wallInt = intent.extras
        val newWallImg = wallInt?.getInt("wallImg")
        if (newWallImg != null) {
            wallImg.setImageResource(newWallImg)
        }

        val wallPaperManager = WallpaperManager.getInstance(applicationContext)
        bSetWallPaper = findViewById(R.id.set_wallpaper_button)

        bSetWallPaper!!.setOnClickListener {
            Toast.makeText(this, "Вы, поменяли обои!", Toast.LENGTH_SHORT).show()
            try {
                if (newWallImg != null) {
                    wallPaperManager.setResource(newWallImg)
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

        val btnBack = findViewById<Button>(R.id.btnBack)
        btnBack.setOnClickListener {
            val intent = Intent(this, WallPaperActivity::class.java)
            startActivity(intent)
        }

    }
}