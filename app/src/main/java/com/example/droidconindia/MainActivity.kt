package com.example.droidconindia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.droidconindia.basketballdemo.BasketBallDemoActivity
import com.example.droidconindia.graph.GraphDemoActivity
import com.example.droidconindia.youtubedemo.YouTubeDemoActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        youtube_demo.setOnClickListener(this)
        sin_graph_demo.setOnClickListener(this)
        basket_ball_demo.setOnClickListener(this)

    }

    override fun onClick(view: View?) {
        view?.let {it ->
            when(it.id) {
                R.id.youtube_demo -> startActivity(Intent(this, YouTubeDemoActivity::class.java))
                R.id.basket_ball_demo -> startActivity(Intent(this, BasketBallDemoActivity::class.java))
                R.id.sin_graph_demo -> startActivity(Intent(this, GraphDemoActivity::class.java))
            }
        }

    }
}
