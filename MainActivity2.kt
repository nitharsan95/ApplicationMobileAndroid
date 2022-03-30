package com.example.projetbeta

import android.content.ComponentName
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
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

class MainActivity2 : AppCompatActivity() {
    private lateinit var newRecylerview : RecyclerView
    private lateinit var newArrayList : ArrayList<News>
    private lateinit var tempArrayList : ArrayList<News>

    lateinit var imageId : Array<Int>
    lateinit var imageId_chap_adn_gris : Array<Int>
    lateinit var imageId_chap_adn_violet : Array<Int>
    lateinit var imageId_chap_adn_orangeR : Array<Int>
    lateinit var imageId_chap_adn_orangeV : Array<Int>
    lateinit var imageId_chap_adn_rose : Array<Int>
    lateinit var imageId_chap_adn_vert : Array<Int>
    lateinit var imageId_chap_adn_beige : Array<Int>
    lateinit var imageId_chap_adn_jaune : Array<Int>

    lateinit var imageId_lam_adn_lib_blan : Array<Int>
    lateinit var imageId_lam_adn_lib_jaune : Array<Int>
    lateinit var imageId_lam_adn_lib_roseC : Array<Int>
    lateinit var imageId_lam_adn_lib_gris : Array<Int>
    lateinit var  imageId_lam_adn_lib_rose : Array<Int>

    lateinit var  imageId_tous : Array<Int>


    lateinit var heading : Array<String>
    lateinit var heading_chap_lam_adn_gris : Array<String>
    lateinit var heading_chap_lam_adn_orangeV : Array<String>
    lateinit var heading_chap_lam_adn_orangeR : Array<String>
    lateinit var heading_chap_lam_adn_rose : Array<String>
    lateinit var heading_chap_lam_adn_vert : Array<String>
    lateinit var heading_chap_lam_adn_beige : Array<String>
    lateinit var heading_chap_lam_adn_violet : Array<String>
    lateinit var heading_chap_lam_adn_jaune : Array<String>

    lateinit var heading_lam_adn_lib_blan : Array<String>
    lateinit var heading_lam_adn_lib_jaune : Array<String>
    lateinit var heading_lam_adn_lib_roseC : Array<String>
    lateinit var heading_lam_adn_lib_rose : Array<String>
    lateinit var  heading_lam_adn_lib_gris : Array<String>

    lateinit var  heading_tous : Array<String>


/*****************************************************************/
    lateinit var newsArticle : Array<String>
    lateinit var news_chap_lam_adn_beige : Array<String>
    lateinit var  news_chap_lam_adn_gris : Array<String>
    lateinit var  news_chap_lam_adn_orangeR : Array<String>
    lateinit var news_chap_lam_adn_orangeV : Array<String>
    lateinit var news_chap_lam_adn_violet : Array<String>
    lateinit var news_chap_lam_adn_jaune : Array<String>
    lateinit var news_chap_lam_adn_vert : Array<String>
    lateinit var news_chap_lam_adn_rose : Array<String>

    lateinit var news_lam_adn_lib_blan : Array<String>
    lateinit var  news_lam_adn_lib_jaune : Array<String>
    lateinit var news_lam_adn_lib_roseC : Array<String>
    lateinit var news_lam_adn_lib_rose : Array<String>
    lateinit var news_lam_adn_lib_gris : Array<String>


    lateinit var news_tous : Array<String>

    /**********************************************/

    lateinit var imageId_Comestible : Array<Int>;
    lateinit var heading_Comestible : Array<String>
    lateinit var news_Comestible : Array<String>

    lateinit var imageId_mediocre : Array<Int>
    lateinit var heading_mediocre : Array<String>
    lateinit var news_mediocre  : Array<String>

    lateinit var imageId_mortel : Array<Int>
    lateinit var heading_mortel : Array<String>
    lateinit var news_mortel :Array<String>


    lateinit var imageId_enBoule : Array<Int>
    lateinit var heading_enBoule : Array<String>
    lateinit var news_enBoule : Array<String>

    lateinit var imageId_enCoupe : Array<Int>
    lateinit var heading_enCoupe : Array<String>
    lateinit var news_enCoupe : Array<String>




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //tab de chapeau -> lames -> adnées -> blanche (a-j) (0-9)
        //       Chapeau -> lames -> adnées -> jaunes.   (K->v) (10-21)
        //       Chapeau -> lames -> adnées -> orange vif.   (w) (22)
        //       Chapeau -> lames -> adnées -> orange rouille.   (x-AC) (23-28)
        //       Chapeau -> lames -> adnées -> bleus (Ad->Ag) (29->32)
        //       Chapeau -> lames -> adnées -> gris(Ah->Ak)  (33-36)
        //       Chapeau->lames->adnées->rose orangé (al->an) (37-39)
        //       Chapeau -> lames -> adnées ->verdâtre. (Ao) (40)
        //       Chapeau -> lames -> adnées ->beige-brun (Ap-as) (41-43)

        /******************************** chap -> lam -> adn *********************/
        /***************************************************************************/
        //Chapeau -> lames -> adnées -> blanc.   (a-j) (0-9)
        imageId = arrayOf(
            R.drawable.a, //0
            R.drawable.b, //1
            R.drawable.c, //2
            R.drawable.d, //3
            R.drawable.e, //4
            R.drawable.f, //5
            R.drawable.g, //6
            R.drawable.h, //7
            R.drawable.i, //8
            R.drawable.j, //9
        )

        imageId_chap_adn_gris = arrayOf(
            //Chapeau -> lames -> adnées -> gris(Ah->Ak) (33-36)
            R.drawable.ah, //33
            R.drawable.ai, //34
            R.drawable.aj, //35
            R.drawable.ak, //36

        )
        imageId_chap_adn_violet = arrayOf(
            //          Chapeau -> lames -> adnées -> bleus (Ad->Ag) (29->32)
            R.drawable.ad, //29
            R.drawable.ae, //30
            R.drawable.af, //31
            R.drawable.ag, //32

        )
        imageId_chap_adn_orangeR = arrayOf(
            //       Chapeau -> lames -> adnées -> orange rouille.   (x-AC) (23-28)
            R.drawable.x, //23
            R.drawable.y, //24
            R.drawable.z, //25
            R.drawable.aa, //26
            R.drawable.ab, //27
            R.drawable.ac, //28

        )
        imageId_chap_adn_orangeV = arrayOf(
            //Chapeau -> lames -> adnées -> orange vif.   (w) (22)
        R.drawable.w, //22

        )
        imageId_chap_adn_rose = arrayOf(
            //       Chapeau->lames->adnées->rose orangé (al->an) (37-39)
            R.drawable.al, //37
            R.drawable.am, //38
            R.drawable.an, //39

        )
        imageId_chap_adn_vert = arrayOf(
            //Chapeau -> lames -> adnées ->verdâtre. (Ao) (40)
            R.drawable.ao, //40

        )
        imageId_chap_adn_beige = arrayOf(
            // Chapeau -> lames -> adnées ->beige-brun (Ap-as) (41-43)
            R.drawable.ap, //41
            R.drawable.aq, //42
            R.drawable.ar, //43

        )
        imageId_chap_adn_jaune = arrayOf(
            //       Chapeau -> lames -> adnées -> jaunes.   (K->v) (10-21)
            R.drawable.k, //10
            R.drawable.l, //11
            R.drawable.m, //12
            R.drawable.n, //13
            R.drawable.o, //14
            R.drawable.p, //15
            R.drawable.q, //16
            R.drawable.r, //17
            R.drawable.s, //18
            R.drawable.t, //19
            R.drawable.u, //20
            R.drawable.v, //21

        )


        /************************************************************************/
        //tab de chapeau et un pied -> lames -> adnées -> blanche
        heading = arrayOf(
            "RUSSULE PERFIDE",  //0
            "ENTOLOME BOUCLIER",  //1
            "TRICHOLOME TERREUX",  //2
            "TRICHOLOME TIGRE",  //3
            "TRICHOLOME PRETENTIEUX",  //4
            "TRICHOLOME GRIS PERFIDE",  //5
            "TRICHOLOME JUNISSANT",  //6
            "TRICHOLOME EN TOUFFE",  //7
            "TRICHOLOME BLANC",  //8
            "STROPHAIRE BLEU",  //9
        )
        //tab de chapeau et un pied -> lames -> adnées -> gris
        heading_chap_lam_adn_gris = arrayOf(
            "richoloma terreum",  //33
            "Tricholoma sciodes",  //34
            "Stropharia cyanea",  //35
            "Candolleomyces candolleana"  //36
        )
        //tab de chapeau et un pied -> lames -> adnées -> orangeV
        heading_chap_lam_adn_orangeV = arrayOf(
            "CORTINAIRE SANGUIN"  //22
        )
        //tab de chapeau et un pied -> lames -> adnées -> orange Rouillr
        heading_chap_lam_adn_orangeR = arrayOf(
            "GYMNOPILE REMARQUABLE",  //23
            "CORTINAIRE CANNELLE",  //24
            "CORTINAIRE COULEUR DE ROCOU", //25
            "CORTINAIRE TRÈS JOLI",  //26
            "PHOLIOTE DORÉE",  //27
            "GYMNOPILE PÉNÉTRANT"  //28
        )
        //tab de chapeau et un pied -> lames -> adnées -> rose
        heading_chap_lam_adn_rose = arrayOf(
            "Entoloma clypeatum",  //37
            "Mycena rosea",  //38
            "Laccaria laccata",  //39
        )
        //tab de chapeau et un pied -> lames -> adnées -> vert
        heading_chap_lam_adn_vert = arrayOf(
            "Hypholoma fasciculare"  //40
        )
        //tab de chapeau et un pied -> lames -> adnées -> beige
        heading_chap_lam_adn_beige = arrayOf(
            "COLLYBIE GUÊTRÉE",  //41
            "PSATHYRELLE HYDROPHILE",  //42
            " PIED-VIOLET"  //43
        )
        //tab de chapeau et un pied -> lames -> adnées -> violet
        heading_chap_lam_adn_violet = arrayOf(
            "PIED-BLEU",  //29
            "Lepista sordida",   //30
            "Cortinarius alboviolaceus",  //31
            "Cortinarius camphoratus",  //32
        )
        //tab de chapeau et un pied -> lames -> adnées -> jaune
        heading_chap_lam_adn_jaune = arrayOf(
            "RUSSULE PERFIDE",  //10
            "COLLYBIE GUÊTRÉE",  //11
            "TRICHOLOME SOUFRÉ",  //12
            "TRICHOLOME RUTILANT",  //13
            "TRICHOLOME ÉQUESTRE",  //14
            "RUSSULE MAMELONNÉE",  //15
            "RUSSULE SARDOINE",  //16
            "RUSSULE CAMÉLÉON",  //17
            "GYMNOPILE REMARQUABLE",  //18
            "HYPHOLOME EN TOUFFE",  //19
            "GYMNOPILE PÉNÉTRANT",  //20
            "ENTOLOME LIVIDE"  //21
        )



        /************************************************************************/
        //tab de news article

        newsArticle = arrayOf(
            getString(R.string.champignion0),//0
            getString(R.string.champignion1),
            getString(R.string.champignion2),
            getString(R.string.champignion3),
            getString(R.string.champignion4),
            getString(R.string.champignion5),
            getString(R.string.champignion6),
            getString(R.string.champignion7),
            getString(R.string.champignion8),
            getString(R.string.champignion9),//9
        )

        news_chap_lam_adn_beige = arrayOf(
            //41_43//
            getString(R.string.champignion41),
            getString(R.string.champignion42),
            getString(R.string.champignion43), //43
        )
        news_chap_lam_adn_gris = arrayOf(
            //33_36
            getString(R.string.champignion33),
            getString(R.string.champignion34),
            getString(R.string.champignion35),
            getString(R.string.champignion36)//36
        )
        news_chap_lam_adn_orangeR = arrayOf(
            //23_28//
            getString(R.string.champignion23),
            getString(R.string.champignion24),
            getString(R.string.champignion25),
            getString(R.string.champignion26),
            getString(R.string.champignion27),
            getString(R.string.champignion28),//28
        )
        news_chap_lam_adn_orangeV = arrayOf(
            //22
            getString(R.string.champignion22),
        )
        news_chap_lam_adn_violet = arrayOf(
            //29_32
            getString(R.string.champignion29),
            getString(R.string.champignion30),
            getString(R.string.champignion31),
            getString(R.string.champignion32),//32
        )
        news_chap_lam_adn_jaune = arrayOf(
            //10_21//
            getString(R.string.champignion10),
            getString(R.string.champignion11),
            getString(R.string.champignion12),
            getString(R.string.champignion13),
            getString(R.string.champignion14),
            getString(R.string.champignion15),
            getString(R.string.champignion16),
            getString(R.string.champignion17),
            getString(R.string.champignion18),
            getString(R.string.champignion19),
            getString(R.string.champignion20),
            getString(R.string.champignion21),//21
        )
        news_chap_lam_adn_vert = arrayOf(
            getString(R.string.champignion40),//40
        )
        news_chap_lam_adn_rose = arrayOf(
            //37_39
            getString(R.string.champignion37),
            getString(R.string.champignion38),
            getString(R.string.champignion39),//39
        )

        /******************************** comestible champ liste *********************/


        /***************************************************************************/
        imageId_lam_adn_lib_blan = arrayOf(
            R.drawable.at, //44

        )
        imageId_lam_adn_lib_jaune = arrayOf(
            R.drawable.au, //45

        )
        imageId_lam_adn_lib_roseC = arrayOf(
            R.drawable.av, //46

        )
        imageId_lam_adn_lib_gris = arrayOf(
            R.drawable.aw, //47

        )
        imageId_lam_adn_lib_rose = arrayOf(
            R.drawable.ax, //48

        )

        heading_lam_adn_lib_blan = arrayOf(
            "LÉPIOTE PUDIQUE" //44

        )
        heading_lam_adn_lib_jaune = arrayOf(
            "AMANITE DES CÉSARS" //45
        )
        heading_lam_adn_lib_roseC = arrayOf(
           "AGARIC DES JACHÈRES" //46
        )
        heading_lam_adn_lib_rose  = arrayOf(
            "VOLVAIRE VISQUEUSE" //48
        )
        heading_lam_adn_lib_gris = arrayOf(
            "COPRIN NOIR D’ENCRE" //47
        )

        news_lam_adn_lib_blan = arrayOf(
            //44//
            getString(R.string.champignion44)

        )
        news_lam_adn_lib_jaune = arrayOf(
            //45//
            getString(R.string.champignion45)

        )
        news_lam_adn_lib_roseC = arrayOf(
            //10_21//
            getString(R.string.champignion46)

        )
        news_lam_adn_lib_rose = arrayOf(
            //10_21//
            getString(R.string.champignion48)

        )
        news_lam_adn_lib_gris= arrayOf(
            //47//
            getString(R.string.champignion47)

        )

/******************************/

        imageId_tous = arrayOf(
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.g,
            R.drawable.h,
            R.drawable.i,
            R.drawable.j,
            R.drawable.k,
            R.drawable.l,
            R.drawable.m,
            R.drawable.n

        )
        heading_tous = arrayOf(
            "RUSSULE PERFIDE",  //0
            "ENTOLOME BOUCLIER",  //1
            "TRICHOLOME TERREUX",  //2
            "TRICHOLOME TIGRE",  //3
            "TRICHOLOME PRETENTIEUX",  //4
            "TRICHOLOME GRIS PERFIDE",  //5
            "TRICHOLOME JUNISSANT",  //6
            "TRICHOLOME EN TOUFFE",  //7
            "TRICHOLOME BLANC",  //8
            "STROPHAIRE BLEU",  //9
            "RUSSULE PERFIDE",  //10
            "COLLYBIE GUÊTRÉE",  //11
            "TRICHOLOME SOUFRÉ",  //12
            "TRICHOLOME RUTILANT",  //13

        )

        news_tous = arrayOf(
            getString(R.string.champignion0),//0
            getString(R.string.champignion1),
            getString(R.string.champignion2),
            getString(R.string.champignion3),
            getString(R.string.champignion4),
            getString(R.string.champignion5),
            getString(R.string.champignion6),
            getString(R.string.champignion7),
            getString(R.string.champignion8),
            getString(R.string.champignion9),//9
            getString(R.string.champignion10),
            getString(R.string.champignion11),
            getString(R.string.champignion12),
            getString(R.string.champignion13)

        )


/*************************************************************************/
        imageId_Comestible = arrayOf(
            R.drawable.ba,
            R.drawable.bb,
            R.drawable.bc,
            R.drawable.bd

        )

        heading_Comestible = arrayOf(
            "CÈPE BRONZÉ",
            "CÈPE D'ÉTÉ",
            "CÈPE DE BORDEAUX",
            "CÈPE DES PINS")

                news_Comestible = arrayOf(
            getString(R.string.champignion49) ,
            getString(R.string.champignion50),
            getString(R.string.champignion51),
            getString(R.string.champignion52),

        )
        /************************************************************************/
        imageId_mediocre = arrayOf(
            R.drawable.be,
            R.drawable.bf,
            R.drawable.bg,
            R.drawable.bh,

        )
        heading_mediocre = arrayOf(
            "AMANITE ÉPAISSE",
            "AMANITE VAGINÉE",
            "AMANITE FAUVE",
            "CALVATIE EN COUPE"
        )
        news_mediocre = arrayOf(
            getString(R.string.champignion53),
            getString(R.string.champignion54),
            getString(R.string.champignion55),
            getString(R.string.champignion56)
        )

        /***************************************************************************/
        /************************************************************************/
        imageId_mortel = arrayOf(
            R.drawable.bi,
            R.drawable.bj,
            R.drawable.bk,
            R.drawable.bl,

            )
        heading_mortel = arrayOf(
            "GALÈRE MARGINÉE",
            "CORTINAIRE",
            "AMANITE VIREUSE",
            "PAXILLE ENROULE"
        )
        news_mortel = arrayOf(
            getString(R.string.champignion57),
            getString(R.string.champignion58),
            getString(R.string.champignion59),
            getString(R.string.champignion60)
        )

        /***************************************************************************/
        imageId_enBoule = arrayOf(
            R.drawable.bn,
            R.drawable.bo,
            R.drawable.bp,
            R.drawable.bq,

            )
        heading_enBoule = arrayOf(
            "VESSE-DE-LOUP GÉANTE",
            "VESSE-DE-LOUP",
            "CALVATIE EN COUPE",
            "GÉASTRE SESSILE"
        )
        news_enBoule = arrayOf(
            getString(R.string.champignion61),
            getString(R.string.champignion62),
            getString(R.string.champignion63),
            getString(R.string.champignion64)
        )

        /***************************************************************************/
        /***************************************************************************/
        imageId_enCoupe = arrayOf(
            R.drawable.br,
            R.drawable.bs,
            R.drawable.bt,
            R.drawable.bu,

            )
        heading_enCoupe = arrayOf(
            "OREILLE-DE-LIÈVREb",
            "OREILLE-DE-JUDAS",
            "PÉZIZE ORANGÉE",
            "PÉZIZE ÉCARLATE"
        )
        news_enCoupe = arrayOf(
            getString(R.string.champignion65),
            getString(R.string.champignion66),
            getString(R.string.champignion67),
            getString(R.string.champignion68)
        )

        /***************************************************************************/

        newRecylerview =findViewById(R.id.recyclerView)
        newRecylerview.layoutManager = LinearLayoutManager(this)
        newRecylerview.setHasFixedSize(true)


        newArrayList = arrayListOf<News>()
        tempArrayList = arrayListOf<News>()
        /*************************************************************************/


        if(getIntent().getStringExtra("from3").equals("chapeau_blanc")){
        //groupe chapeau->lames->adnees->blanc
            getUserdata(imageId,heading,newsArticle)

        }
        if(getIntent().getStringExtra("from1").equals("chapeau_grise")){
            //groupe chapeau->lames->adnees->blanc
            getUserdata(imageId_chap_adn_gris ,heading_chap_lam_adn_gris,news_chap_lam_adn_gris)

        }
        if(getIntent().getStringExtra("from2").equals("chapeau_orangV")){
            //groupe chapeau->lames->adnees->blanc
            getUserdata(imageId_chap_adn_orangeV,heading_chap_lam_adn_orangeV,news_chap_lam_adn_orangeV)

        }
        if(getIntent().getStringExtra("from8").equals("chapeau_rose")){
            //groupe chapeau->lames->adnees->blanc
                //passe pas
            getUserdata( imageId_chap_adn_rose,heading_chap_lam_adn_rose,news_chap_lam_adn_rose)

        }
        if(getIntent().getStringExtra("from4").equals("chapeau_jaune")){
            //groupe chapeau->lames->adnees->blanc
            getUserdata(imageId_chap_adn_jaune,heading_chap_lam_adn_jaune,news_chap_lam_adn_jaune)

        }

        if(getIntent().getStringExtra("from6").equals("chapeau_violet")){
            //groupe chapeau->lames->adnees->blanc
            getUserdata(imageId_chap_adn_violet,heading_chap_lam_adn_violet ,news_chap_lam_adn_violet)

        }
        if(getIntent().getStringExtra("from7").equals("chapeau_beige")){
            //groupe chapeau->lames->adnees->blanc
            getUserdata(imageId_chap_adn_beige, heading_chap_lam_adn_beige,news_chap_lam_adn_beige)

        }
        if(getIntent().getStringExtra("from5").equals("chapeau_orangR")){
            //groupe chapeau->lames->adnees->blanc
                //passe pas
            getUserdata( imageId_chap_adn_orangeR,heading_chap_lam_adn_orangeR,news_chap_lam_adn_orangeR)

        }
        if(getIntent().getStringExtra("from9").equals("chapeau_vert")){
            //groupe chapeau->lames->adnees->blanc
            getUserdata( imageId_lam_adn_lib_blan ,heading_lam_adn_lib_blan,news_lam_adn_lib_blan)

        }


        if(getIntent().getStringExtra("fromL1").equals("L1chapeau_grise")){

            getUserdata(imageId_lam_adn_lib_gris  ,heading_lam_adn_lib_gris,news_lam_adn_lib_gris)

        }
        if(getIntent().getStringExtra("fromL2").equals("L1chapeau_blanche")){
            //groupe chapeau->lames->adnees->blanc
            getUserdata(imageId_lam_adn_lib_blan ,heading_lam_adn_lib_blan,news_lam_adn_lib_blan)

        }
        if(getIntent().getStringExtra("fromL3").equals("L1chapeau_jaune")){
            //groupe chapeau->lames->adnees->blanc
            getUserdata(imageId_lam_adn_lib_jaune ,heading_lam_adn_lib_jaune,news_lam_adn_lib_jaune)

        }
        if(getIntent().getStringExtra("fromL4").equals("L1chapeau_rose")){
            //groupe chapeau->lames->adnees->blanc
            getUserdata( imageId_lam_adn_lib_rose ,heading_lam_adn_lib_rose, news_lam_adn_lib_rose )

        }
        if(getIntent().getStringExtra("fromL5").equals("L1chapeau_roseC")){
            //groupe chapeau->lames->adnees->blanc
            getUserdata(imageId_lam_adn_lib_roseC ,heading_lam_adn_lib_roseC,news_chap_lam_adn_vert)

        }
        if(getIntent().getStringExtra("fromStartActivity").equals("tous")){
            //groupe chapeau->lames->adnees->blanc
            getUserdata(imageId_tous ,heading_tous,news_tous)

        }
        if(getIntent().getStringExtra("fromComestible").equals("listeCom")){

            getUserdata(imageId_Comestible  ,heading_Comestible,news_Comestible)

        }
        if(getIntent().getStringExtra("fromMedio").equals("listeMedio")){

            getUserdata(imageId_mediocre  ,heading_mediocre,news_mediocre)

        }


        if(getIntent().getStringExtra("from_Mortel").equals("liste_Mortal")){

            getUserdata(imageId_mortel  ,heading_mortel,news_mortel)

        }
        if(getIntent().getStringExtra("from_Toxique").equals("liste_Toxique")){

            getUserdata(imageId_mortel  ,heading_mortel,news_mortel)

        }
        if(getIntent().getStringExtra("fromBoule").equals("listeBoule")){

            getUserdata(imageId_enBoule  ,heading_enBoule,news_enBoule)

        }
        if(getIntent().getStringExtra("fromCoupe").equals("listeCoupe")){

            getUserdata(imageId_enCoupe  ,heading_enCoupe,news_enCoupe)

        }
        if(getIntent().getStringExtra("fromDanger").equals("listeDanger")){

            getUserdata(imageId_mediocre  ,heading_mediocre,news_mediocre)

        }
        else {
        // doing nothing

        }



    }
    /***************************************************************************/

    /***************************************************************************/
    private fun getUserData()
    {
        //on prend une image et un titre et on crée un News,et on ajoute dans liste newArrayList
        for (i in imageId.indices)
        {

            val news= News(imageId[i],heading[i])
            newArrayList.add(news)
        }
        newRecylerview.adapter = MyAdapter(newArrayList)
    }
    /***************************************************************************/
    /***************************************************************************/
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.menu_item,menu)
        val item = menu?.findItem(R.id.search_action)
        val searchView = item?.actionView as SearchView
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                TODO("Not yet implemented")
            }

            override fun onQueryTextChange(newText: String?): Boolean {

                tempArrayList.clear()
                val searchText = newText!!.toLowerCase(Locale.getDefault())
                if (searchText.isNotEmpty()){

                    newArrayList.forEach {

                        if (it.heading.toLowerCase(Locale.getDefault()).contains(searchText)){


                            tempArrayList.add(it)

                        }

                    }

                    newRecylerview.adapter!!.notifyDataSetChanged()

                }else{

                    tempArrayList.clear()
                    tempArrayList.addAll(newArrayList)
                    newRecylerview.adapter!!.notifyDataSetChanged()

                }


                return false

            }


        })

        return super.onCreateOptionsMenu(menu)
    }
/***************************************************************************/

private fun getUserdata(imageId1:Array<Int>,heading1 :Array<String>,news1 :Array<String> ) {
    val imageId=imageId1
    val heading = heading1
    val news=news1

    for(i in imageId.indices){

        val news = News(imageId[i],heading[i])
        newArrayList.add(news)

    }

    tempArrayList.addAll(newArrayList)


    val adapter = MyAdapter(tempArrayList)

    newRecylerview.adapter = adapter
    adapter.setOnItemClickListener(object : MyAdapter.onItemClickListener{
        override fun onItemClick(position: Int) {

            //  Toast.makeText(this@MainActivity,"You Clicked on item no. $position",Toast.LENGTH_SHORT).show()

            val intent = Intent(this@MainActivity2,NewsActivity::class.java)
            intent.putExtra("heading",newArrayList[position].heading)
            intent.putExtra("imageId",newArrayList[position].titleImage)
            intent.putExtra("news",news[position])
            startActivity(intent)

        }


    })

}
/*
    private fun chap_lam_adn_blanche() {

        for(i in 0..9){

            val news = News(imageId[i],heading[i])
            newArrayList.add(news)

        }

        tempArrayList.addAll(newArrayList)


        val adapter = MyAdapter(tempArrayList)

        newRecylerview.adapter = adapter
        adapter.setOnItemClickListener(object : MyAdapter.onItemClickListener{
            override fun onItemClick(position: Int) {

                //  Toast.makeText(this@MainActivity,"You Clicked on item no. $position",Toast.LENGTH_SHORT).show()

                val intent = Intent(this@MainActivity2,NewsActivity::class.java)
                intent.putExtra("heading",newArrayList[position].heading)
                intent.putExtra("imageId",newArrayList[position].titleImage)
                intent.putExtra("news",news[position])
                startActivity(intent)

            }


        })

    }
    private fun chap_lam_adn_jaune() {

        for(i in 10..21){

            val news = News(imageId[i],heading[i])
            newArrayList.add(news)

        }

        tempArrayList.addAll(newArrayList)


        val adapter = MyAdapter(tempArrayList)

        newRecylerview.adapter = adapter
        adapter.setOnItemClickListener(object : MyAdapter.onItemClickListener{
            override fun onItemClick(position: Int) {

                //  Toast.makeText(this@MainActivity,"You Clicked on item no. $position",Toast.LENGTH_SHORT).show()

                val intent = Intent(this@MainActivity2,NewsActivity::class.java)
                intent.putExtra("heading",newArrayList[position].heading)
                intent.putExtra("imageId",newArrayList[position].titleImage)
                intent.putExtra("news",news[position])
                startActivity(intent)

            }


        })

    }
    private fun chap_lam_adn_orangeV() {

        for(i in 22..22){

            val news = News(imageId[i],heading[i])
            newArrayList.add(news)

        }

        tempArrayList.addAll(newArrayList)


        val adapter = MyAdapter(tempArrayList)

        newRecylerview.adapter = adapter
        adapter.setOnItemClickListener(object : MyAdapter.onItemClickListener{
            override fun onItemClick(position: Int) {

                //  Toast.makeText(this@MainActivity,"You Clicked on item no. $position",Toast.LENGTH_SHORT).show()

                val intent = Intent(this@MainActivity2,NewsActivity::class.java)
                intent.putExtra("heading",newArrayList[position].heading)
                intent.putExtra("imageId",newArrayList[position].titleImage)
                intent.putExtra("news",news[position])
                startActivity(intent)

            }


        })

    }
    private fun chap_lam_adn_orangeR() {

        for(i in 23..28){

            val news = News(imageId[i],heading[i])
            newArrayList.add(news)

        }

        tempArrayList.addAll(newArrayList)


        val adapter = MyAdapter(tempArrayList)

        newRecylerview.adapter = adapter
        adapter.setOnItemClickListener(object : MyAdapter.onItemClickListener{
            override fun onItemClick(position: Int) {

                //  Toast.makeText(this@MainActivity,"You Clicked on item no. $position",Toast.LENGTH_SHORT).show()

                val intent = Intent(this@MainActivity2,NewsActivity::class.java)
                intent.putExtra("heading",newArrayList[position].heading)
                intent.putExtra("imageId",newArrayList[position].titleImage)
                intent.putExtra("news",news[position])
                startActivity(intent)

            }


        })

    }
    private fun chap_lam_adn_bleu() {

        for(i in 29..32){

            val news = News(imageId[i],heading[i])
            newArrayList.add(news)

        }

        tempArrayList.addAll(newArrayList)


        val adapter = MyAdapter(tempArrayList)

        newRecylerview.adapter = adapter
        adapter.setOnItemClickListener(object : MyAdapter.onItemClickListener{
            override fun onItemClick(position: Int) {

                //  Toast.makeText(this@MainActivity,"You Clicked on item no. $position",Toast.LENGTH_SHORT).show()

                val intent = Intent(this@MainActivity2,NewsActivity::class.java)
                intent.putExtra("heading",newArrayList[position].heading)
                intent.putExtra("imageId",newArrayList[position].titleImage)
                intent.putExtra("news",news[position])
                startActivity(intent)

            }


        })

    }
    private fun chap_lam_adn_gris() {

        for(i in 33..36){

            val news = News(imageId[i],heading[i])
            newArrayList.add(news)

        }

        tempArrayList.addAll(newArrayList)


        val adapter = MyAdapter(tempArrayList)

        newRecylerview.adapter = adapter
        adapter.setOnItemClickListener(object : MyAdapter.onItemClickListener{
            override fun onItemClick(position: Int) {

                //  Toast.makeText(this@MainActivity,"You Clicked on item no. $position",Toast.LENGTH_SHORT).show()

                val intent = Intent(this@MainActivity2,NewsActivity::class.java)
                intent.putExtra("heading",newArrayList[position].heading)
                intent.putExtra("imageId",newArrayList[position].titleImage)
                intent.putExtra("news",news[position])
                startActivity(intent)

            }


        })

    }
    private fun chap_lam_adn_rose() {

        for(i in 37..39){

            val news = News(imageId[i],heading[i])
            newArrayList.add(news)

        }

        tempArrayList.addAll(newArrayList)


        val adapter = MyAdapter(tempArrayList)

        newRecylerview.adapter = adapter
        adapter.setOnItemClickListener(object : MyAdapter.onItemClickListener{
            override fun onItemClick(position: Int) {

                //  Toast.makeText(this@MainActivity,"You Clicked on item no. $position",Toast.LENGTH_SHORT).show()

                val intent = Intent(this@MainActivity2,NewsActivity::class.java)
                intent.putExtra("heading",newArrayList[position].heading)
                intent.putExtra("imageId",newArrayList[position].titleImage)
                intent.putExtra("news",news[position])
                startActivity(intent)

            }


        })

    }
    private fun chap_lam_adn_vert() {

        for(i in 40..40){

            val news = News(imageId[i],heading[i])
            newArrayList.add(news)

        }

        tempArrayList.addAll(newArrayList)


        val adapter = MyAdapter(tempArrayList)

        newRecylerview.adapter = adapter
        adapter.setOnItemClickListener(object : MyAdapter.onItemClickListener{
            override fun onItemClick(position: Int) {

                //  Toast.makeText(this@MainActivity,"You Clicked on item no. $position",Toast.LENGTH_SHORT).show()

                val intent = Intent(this@MainActivity2,NewsActivity::class.java)
                intent.putExtra("heading",newArrayList[position].heading)
                intent.putExtra("imageId",newArrayList[position].titleImage)
                intent.putExtra("news",news[position])
                startActivity(intent)

            }


        })

    }
    private fun chap_lam_adn_beige() {

        for(i in 41..43){

            val news = News(imageId[i],heading[i])
            newArrayList.add(news)

        }

        tempArrayList.addAll(newArrayList)


        val adapter = MyAdapter(tempArrayList)

        newRecylerview.adapter = adapter
        adapter.setOnItemClickListener(object : MyAdapter.onItemClickListener{
            override fun onItemClick(position: Int) {

                //  Toast.makeText(this@MainActivity,"You Clicked on item no. $position",Toast.LENGTH_SHORT).show()

                val intent = Intent(this@MainActivity2,NewsActivity::class.java)
                intent.putExtra("heading",newArrayList[position].heading)
                intent.putExtra("imageId",newArrayList[position].titleImage)
                intent.putExtra("news",news[position])
                startActivity(intent)

            }


        })

    }
*/



}