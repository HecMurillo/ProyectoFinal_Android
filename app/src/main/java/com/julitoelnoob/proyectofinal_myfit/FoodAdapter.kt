package com.julitoelnoob.proyectofinal_myfit

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class FoodAdapter(private var countries: List<Food>): RecyclerView.Adapter<FoodAdapter.CountryViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {

        val inflador = LayoutInflater.from(parent.context)

        val view = inflador.inflate(R.layout.item_food, parent, false)
        return CountryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        val country = countries[position]
        holder.render(country)

        //aquí se aplica la lógica. ej: onClickListener
    }

    override fun getItemCount(): Int {
        return countries.size
    }

    class CountryViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val name: TextView = view.findViewById(R.id.country_name)
        val capital: TextView = view.findViewById(R.id.country_capital)
        val continent: TextView = view.findViewById(R.id.country_continent)
        val image: ImageView = view.findViewById(R.id.country_image)

        fun render(country: Food) {
            name.text = country.name + ", "
            capital.text = country.protein
            continent.text = country.calories
            Picasso.get().load(country.image).into(image)
        }
    }
}