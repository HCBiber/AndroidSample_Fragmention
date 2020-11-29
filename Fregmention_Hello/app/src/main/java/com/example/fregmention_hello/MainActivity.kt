package com.example.fregmention_hello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickOnceki(v : View)
    {
        val FragmnaYonetici = supportFragmentManager

        val FragmanTransaction = FragmnaYonetici.beginTransaction();

       val Fragman_BirAc = Fragmnet_Bir()

       // FragmanTransaction.add(R.id.frameLayout , Fragman_BirAc ).commit()
        FragmanTransaction.replace(R.id.frameLayout , Fragman_BirAc ).commit()

    }

    fun clickSonraki(v : View)
    {
        val FragmnaYonetici = supportFragmentManager

        val FragmanTransaction = FragmnaYonetici.beginTransaction();

        val Fragman_BirAc = Fragmnet_Iki()

       // FragmanTransaction.add(R.id.frameLayout , Fragman_BirAc ).commit()

        FragmanTransaction.replace(R.id.frameLayout , Fragman_BirAc ).commit()

    }
}