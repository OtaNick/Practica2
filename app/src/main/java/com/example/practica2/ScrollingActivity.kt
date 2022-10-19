package com.example.practica2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.practica2.clases.CentroComercial
import com.example.practica2.clases.Tienda
import com.example.practica2.databinding.ActivityScrollingBinding

class ScrollingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityScrollingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityScrollingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var i = Intent(this, TiendasActivity::class.java)

        loadImageBonaire()
        loadImageSaler()
        loadImageArenas()
        loadImageMN4()


        //Tiendas
        val zara = Tienda("Zara","Tienda de ropa, pertenece a Inditex")
        val game = Tienda("Game","Tienda de videojuegos")
        val snipes = Tienda("Snipes","Tienda de ropa para jovenes")
        val mcdonals = Tienda("McDonal's","Tienda comida rapida")
        val alcampo = Tienda("Alcampo","supermercado, vende de todo")

        //Listas
        val listaBonaire = mutableListOf(zara, alcampo, snipes, game)
        val listaSaler = mutableListOf(mcdonals, alcampo, snipes, zara)
        val listaArenas = mutableListOf(alcampo, mcdonals, game, zara)
        val listaMN4 = mutableListOf(zara, snipes, alcampo, mcdonals)

        //Centros comerciales
        val bonaire = CentroComercial(1,"Bonaire","Autovía del Este, Km. 345, 46960, Valencia",listaBonaire.size,listaBonaire)
        val saler = CentroComercial(2,"Saler","Av. del Professor López Piñero, 16, 46013 València",listaSaler.size,listaSaler)
        val arenas = CentroComercial(3,"Arenas","Gran Via de les Corts Catalanes, 373, 385, 08015 Barcelona",listaArenas.size,listaArenas)
        val mn4 = CentroComercial(4,"MN4","C. Alcalde José Puertes, 46910 Alfafar, Valencia",listaMN4.size,listaMN4)

        //Textos de CardViews
        binding.content.tvNombreBonaire.text = bonaire.nombre+ "\n" + bonaire.direccion
        binding.content.tvTiendasBonaire.text = "${bonaire.nTiendas} Tiendas"

        binding.content.tvNombreSaler.text = saler.nombre+ "\n" + saler.direccion
        binding.content.tvTiendasSaler.text = "${saler.nTiendas} Tiendas"

        binding.content.tvNombreArenas.text = arenas.nombre+ "\n" + arenas.direccion
        binding.content.tvTiendasArenas.text = "${arenas.nTiendas} Tiendas"

        binding.content.tvNombreMN4.text = mn4.nombre+ "\n" + mn4.direccion
        binding.content.tvTiendasMN4.text = "${mn4.nTiendas} Tiendas"

        //Clics de CardViews
        binding.content.cvBonaire.setOnClickListener() {
            i.putExtra("idcc", bonaire.id)
            startActivity(i)
        }
        binding.content.cvSaler.setOnClickListener() {
            i.putExtra("idcc", saler.id)
            startActivity(i)
        }
        binding.content.cvArenas.setOnClickListener() {
            i.putExtra("idcc", arenas.id)
            startActivity(i)
        }
        binding.content.cvMN4.setOnClickListener() {
            i.putExtra("idcc", mn4.id)
            startActivity(i)
        }
    }

    private fun loadImageBonaire(url: String = "https://www.guiagps.com/wp-content/uploads/2020/06/tiendas-moda.jpg") {
        Glide.with(this)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .centerCrop()
            .into(binding.content.imgBonaire)
    }

    private fun loadImageSaler(url: String = "https://static1.lasprovincias.es/www/multimedia/201909/26/media/cortadas/saler1-kiV-U90250867601qaF-1248x770@Las%20Provincias.jpg") {
        Glide.with(this)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .centerCrop()
            .into(binding.content.imgSaler)
    }
    private fun loadImageArenas(url: String = "https://v2r8c2i8.stackpathcdn.com/wp-content/uploads/2016/04/shoppinglasarenasembarcelona.jpg") {
        Glide.with(this)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .centerCrop()
            .into(binding.content.imgArenas)
    }
    private fun loadImageMN4(url: String = "https://www.hiansa.com/wp-content/uploads/2021/02/CC-MN4-5.jpg") {
        Glide.with(this)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .centerCrop()
            .into(binding.content.imgMN4)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_scrolling, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}