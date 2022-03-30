package com.example.projetbeta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_start.*
import kotlinx.android.synthetic.main.activity_start.cv6All
import kotlinx.android.synthetic.main.activity_variety.*

class Variety : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_variety)
        onClickListner()
    }

    fun onClickListner()
    {

        cvCepe.setOnClickListener{
            startActivity(Intent(this, cepe::class.java).putExtra("name","chapeau").putExtra("image",R.drawable.chapeau));
        }

        cv2Morille.setOnClickListener{
            startActivity(Intent(this, Morille::class.java).putExtra("name","chapeau").putExtra("image",R.drawable.sabot));
        }
        cv3BonCom.setOnClickListener{
            startActivity(Intent(this, MainActivity2::class.java).putExtra("fromComestible","listeCom"));
        }

        cvMedio.setOnClickListener{
            startActivity(Intent(this, MainActivity2::class.java).putExtra("fromMedio","listeMedio"));
        }

        cv5Toxique.setOnClickListener{
            startActivity(Intent(this, MainActivity2::class.java).putExtra("from_Toxique","liste_Toxique"));
        }
        cvMortel.setOnClickListener{
            startActivity(Intent(this, MainActivity2::class.java).putExtra("from_Mortel","liste_Mortal"));
        }




    }
}
