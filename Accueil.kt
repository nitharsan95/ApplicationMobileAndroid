package com.example.projetbeta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_accueil.*
import kotlinx.android.synthetic.main.activity_start.*

class Accueil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_accueil)
        onClickListner()
    }

    fun onClickListner() {

        btnStart.setOnClickListener {
            startActivity(
                Intent(this, ActivityStart::class.java).putExtra("name", "chapeau")
                    .putExtra("image", R.drawable.chapeau)
            );
        }
    }
}