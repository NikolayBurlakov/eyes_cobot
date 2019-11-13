package com.raywenderlich.rocketlauncher

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import com.raywenderlich.rocketlauncher.animationactivities.*
import java.util.*

class MainListActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main_layout)

    val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
    recyclerView.layoutManager = android.support.v7.widget.LinearLayoutManager(this)

    val items = ArrayList<AnimationItem>()

    items.add(AnimationItem(getString(R.string.EyesClass),
      Intent(this, EyesClass::class.java)))

    recyclerView.adapter = Adapter(this, items)
  }
}
