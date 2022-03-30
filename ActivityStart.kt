package com.example.projetbeta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projetbeta.Filter_chapeau.ChapeauEtPied
import com.example.projetbeta.filter_boule.EnBoule
import com.example.projetbeta.filter_coupe.EnCoupe
import com.example.projetbeta.filter_formeDiverse.FormeDiverse
import com.example.projetbeta.filter_sabot.EnSabot
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_start.*

class ActivityStart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        onClickListner();
    }

    fun onClickListner()
    {

        cv1Identifier.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java).putExtra("name","chapeau").putExtra("image",R.drawable.chapeau));
        }

        cv2Conseils.setOnClickListener{
            startActivity(Intent(this, Conseil::class.java).putExtra("name","chapeau").putExtra("image",R.drawable.sabot));
        }
        cv3PlusVue.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java).putExtra("name","chapeau").putExtra("image",R.drawable.sabot));
        }

        cvVariety.setOnClickListener{
            startActivity(Intent(this, Variety::class.java).putExtra("name","chapeau").putExtra("image",R.drawable.sabot));
        }

        cv5Dangers.setOnClickListener{
            startActivity(Intent(this, MainActivity2::class.java).putExtra("fromDanger","listeDanger"));
        }
        cv6All.setOnClickListener{
            startActivity(Intent(this, MainActivity2::class.java).putExtra("fromStartActivity","tous"));
        }




    }
}
