package com.example.projetbeta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projetbeta.Filter_chapeau.*
import com.example.projetbeta.filter_sabot.EnSabot
import com.example.projetbeta.filter_boule.EnBoule
import com.example.projetbeta.filter_coupe.EnCoupe
import com.example.projetbeta.filter_formeDiverse.FormeDiverse
import kotlinx.android.synthetic.main.activity_main.*
import android.util.Log
import android.view.Menu
import android.view.MenuItem

import android.widget.Toast
import android.widget.Toolbar
import androidx.appcompat.widget.SearchView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*
import kotlin.collections.ArrayList

import java.text.FieldPosition


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        onClickListner();

    }

    /*
    * cvChapeauEtPied
    * cvEnBoule
    * cvCoup
    * cvEnSabot
    * cvFormeDiverse
    * */
    fun onClickListner()
    {

        cvChapeauEtPied.setOnClickListener{
            startActivity(Intent(this, ChapeauEtPied::class.java).putExtra("name","chapeau").putExtra("image",R.drawable.chapeau));
        }

        cvEnSabot.setOnClickListener{
            startActivity(Intent(this, EnSabot::class.java).putExtra("name","chapeau").putExtra("image",R.drawable.sabot));
        }
        cvEnBoule.setOnClickListener{
            startActivity(Intent(this, MainActivity2::class.java).putExtra("fromBoule","listeBoule"));
        }

        cvCoup.setOnClickListener{
            startActivity(Intent(this, MainActivity2::class.java).putExtra("fromCoupe","listeCoupe"));
        }
        cvFormeDiverse.setOnClickListener{
            startActivity(Intent(this, FormeDiverse::class.java).putExtra("name","chapeau").putExtra("image",R.drawable.sabot));
        }

    }
}