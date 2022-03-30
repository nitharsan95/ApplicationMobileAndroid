package com.example.projetbeta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.media.Image
import android.widget.ImageView
import android.widget.TextView
import com.example.projetbeta.Filter_chapeau.ChapeauEtPied
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_news_activity.*
import org.w3c.dom.Text

class NewsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_activity)

        val headingNews : TextView = findViewById(R.id.heading)
        val mainNews : TextView = findViewById(R.id.news)
        val imageNews : ImageView = findViewById(R.id.image_heading)

        val bundle : Bundle?= intent.extras
        val heading = bundle!!.getString("heading")
        val imageId = bundle.getInt("imageId")
        val news = bundle.getString("news")

        headingNews.text = heading
        mainNews.text = news
        imageNews.setImageResource(imageId)

        onClickListner()
    }


    fun onClickListner() {

        goToHomeBtn.setOnClickListener {
            startActivity(
                Intent(this, ActivityStart::class.java).putExtra("name", "chapeau")
                    .putExtra("image", R.drawable.chapeau)
            );
        }
    }
}