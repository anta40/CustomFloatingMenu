package com.anta40.app.customfloatingmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.oguzdev.circularfloatingactionmenu.library.FloatingActionMenu

class MainActivity : AppCompatActivity() {

    lateinit var bottomNav: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNav = findViewById(R.id.bottom_navigation) as BottomNavigationView
        bottomNav.setOnItemSelectedListener { menu ->

            when (menu.itemId) {

                R.id.mnuA -> {
                    true
                }

                R.id.mnuB -> {
                    true
                }

                R.id.mnuC -> {

                    val imgA = ImageView(applicationContext)
                    imgA.setBackgroundResource(R.drawable.datacenter32)
                    val imgB = ImageView(applicationContext)
                    imgB.setBackgroundResource(R.drawable.processor64)

                    val imgParams = FrameLayout.LayoutParams(
                        FrameLayout.LayoutParams.WRAP_CONTENT,
                        FrameLayout.LayoutParams.WRAP_CONTENT
                    )

                    imgA.layoutParams = imgParams
                    imgB.layoutParams = imgParams

                    val menuC_View = findViewById(R.id.mnuC) as View

                    val circleMenu = FloatingActionMenu.Builder(this@MainActivity)
                    circleMenu
                        .setStartAngle(-45)
                        .setEndAngle(-135)
                        .setRadius(resources.getDimensionPixelOffset(R.dimen.radius_large))
                        .addSubActionView(imgA)
                        .addSubActionView(imgB)
                        .attachTo(menuC_View)
                        .build()

                    true
                }

                R.id.mnuD -> {
                    true
                }

                R.id.mnuE -> {
                    true
                }

                else -> true
            }
        }
    }
}