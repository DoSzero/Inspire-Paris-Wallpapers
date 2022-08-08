package com.inspfra.inspirepariswallpapers.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.inspfra.inspirepariswallpapers.R
import com.inspfra.inspirepariswallpapers.adapter.WallPaperAdapter
import com.inspfra.inspirepariswallpapers.model.WallPaperData


class WallPaperActivity : AppCompatActivity() {

    private lateinit var wallPaperAdapter: WallPaperAdapter
    private lateinit var wallImgList: ArrayList<WallPaperData>
    private lateinit var wallPaperRec: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wall_paper)

        wallPaperRec = findViewById(R.id.wallRec)
        wallImgList = ArrayList()
        wallPaperAdapter = WallPaperAdapter(this, wallImgList)

        val layoutM = GridLayoutManager(applicationContext, 2)
        layoutM.orientation = LinearLayoutManager.VERTICAL
        wallPaperRec.layoutManager = layoutM
        wallPaperRec.adapter = wallPaperAdapter
        wallPaperList()
    }

    private fun wallPaperList() {
        wallImgList.add(WallPaperData(R.drawable.screen1))
        wallImgList.add(WallPaperData(R.drawable.screen2))
        wallImgList.add(WallPaperData(R.drawable.screen3))
        wallImgList.add(WallPaperData(R.drawable.screen4))
        wallImgList.add(WallPaperData(R.drawable.screen5))
        wallImgList.add(WallPaperData(R.drawable.screen6))
        wallImgList.add(WallPaperData(R.drawable.screen7))
        wallImgList.add(WallPaperData(R.drawable.screen8))
        wallImgList.add(WallPaperData(R.drawable.screen9))
        wallImgList.add(WallPaperData(R.drawable.screen10))
        wallImgList.add(WallPaperData(R.drawable.screen11))
        wallImgList.add(WallPaperData(R.drawable.screen12))
        wallImgList.add(WallPaperData(R.drawable.screen13))
        wallImgList.add(WallPaperData(R.drawable.screen14))
        wallImgList.add(WallPaperData(R.drawable.screen15))
        wallImgList.add(WallPaperData(R.drawable.screen16))
        wallImgList.add(WallPaperData(R.drawable.screen17))
        wallImgList.add(WallPaperData(R.drawable.screen18))
        wallImgList.add(WallPaperData(R.drawable.screen19))

    }
}