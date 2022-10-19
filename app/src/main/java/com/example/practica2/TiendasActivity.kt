package com.example.practica2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.practica2.clases.CentroComercial
import com.example.practica2.clases.Tienda
import com.example.practica2.databinding.ActivityScrollingBinding
import com.example.practica2.databinding.ActivityTiendasBinding

class TiendasActivity : AppCompatActivity() {

    lateinit var binding: ActivityTiendasBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTiendasBinding.inflate(layoutInflater)
        setContentView(binding.root)

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


        var id: Int = 0
        val extras = intent.extras
        if (extras != null) {
            id = extras.getInt("idcc")

            if (id == 1) {
                for ((index, tienda) in bonaire.listaTiendas.withIndex()) {
                    if (index == 0) {
                        binding.tvNombreTienda1.text = tienda.nombre
                        binding.tvDescripcionTienda1.text = tienda.descripcion
                    }
                    if (index == 1) {
                        binding.tvNombreTienda2.text = tienda.nombre
                        binding.tvDescripcionTienda2.text = tienda.descripcion
                    }
                    if (index == 2) {
                        binding.tvNombreTienda3.text = tienda.nombre
                        binding.tvDescripcionTienda3.text = tienda.descripcion
                    }
                    if (index == 3) {
                        binding.tvNombreTienda4.text = tienda.nombre
                        binding.tvDescripcionTienda4.text = tienda.descripcion
                    }
                }
            }else if (id == 2){
                for ((index, tienda) in saler.listaTiendas.withIndex()) {
                    if (index == 0) {
                        binding.tvNombreTienda1.text = tienda.nombre
                        binding.tvDescripcionTienda1.text = tienda.descripcion
                    }
                    if (index == 1) {
                        binding.tvNombreTienda2.text = tienda.nombre
                        binding.tvDescripcionTienda2.text = tienda.descripcion
                    }
                    if (index == 2) {
                        binding.tvNombreTienda3.text = tienda.nombre
                        binding.tvDescripcionTienda3.text = tienda.descripcion
                    }
                    if (index == 3) {
                        binding.tvNombreTienda4.text = tienda.nombre
                        binding.tvDescripcionTienda4.text = tienda.descripcion
                    }
                }
            }else if (id == 3){
                for ((index, tienda) in arenas.listaTiendas.withIndex()) {
                    if (index == 0) {
                        binding.tvNombreTienda1.text = tienda.nombre
                        binding.tvDescripcionTienda1.text = tienda.descripcion
                    }
                    if (index == 1) {
                        binding.tvNombreTienda2.text = tienda.nombre
                        binding.tvDescripcionTienda2.text = tienda.descripcion
                    }
                    if (index == 2) {
                        binding.tvNombreTienda3.text = tienda.nombre
                        binding.tvDescripcionTienda3.text = tienda.descripcion
                    }
                    if (index == 3) {
                        binding.tvNombreTienda4.text = tienda.nombre
                        binding.tvDescripcionTienda4.text = tienda.descripcion
                    }
                }
            }else if (id == 4){
                for ((index, tienda) in mn4.listaTiendas.withIndex()) {
                    if (index == 0) {
                        binding.tvNombreTienda1.text = tienda.nombre
                        binding.tvDescripcionTienda1.text = tienda.descripcion
                    }
                    if (index == 1) {
                        binding.tvNombreTienda2.text = tienda.nombre
                        binding.tvDescripcionTienda2.text = tienda.descripcion
                    }
                    if (index == 2) {
                        binding.tvNombreTienda3.text = tienda.nombre
                        binding.tvDescripcionTienda3.text = tienda.descripcion
                    }
                    if (index == 3) {
                        binding.tvNombreTienda4.text = tienda.nombre
                        binding.tvDescripcionTienda4.text = tienda.descripcion
                    }
                }
            }
        }
    }
}