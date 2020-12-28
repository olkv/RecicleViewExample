package com.example.recicleviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var rclViewMain:RecyclerView? = null
        rclViewMain = findViewById(R.id.rclViewMain)

        val arrayList = ArrayList<CCatalog>()

        arrayList.add(CCatalog("Title","Content",10.toFloat()))
        arrayList.add(CCatalog("Title2","Content2",12.toFloat()))
        arrayList.add(CCatalog("Title3","Content3",15.toFloat()))
        arrayList.add(CCatalog("Title4","Content4",17.toFloat()))
        arrayList.add(CCatalog("Title5","Content5",19.toFloat()))

        rclViewMain.hasFixedSize()
        rclViewMain.layoutManager = LinearLayoutManager(this)
        rclViewMain.adapter =CCatalogAdapter(arrayList,this)

    }
}