package com.example.projetbeta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projetbeta.Filter_chapeau.ChapeauEtPied
import kotlinx.android.synthetic.main.activity_conseil.*
import kotlinx.android.synthetic.main.activity_main.*

class Conseil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conseil)
        onClickListner()
    }

    fun onClickListner() {

        buttonH.setOnClickListener {
            startActivity(
                Intent(this, ActivityStart::class.java).putExtra("name", "chapeau")
                    .putExtra("image", R.drawable.chapeau)
            );
        }
    }
}