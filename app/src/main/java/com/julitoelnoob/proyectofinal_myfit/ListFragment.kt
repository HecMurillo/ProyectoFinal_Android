package com.julitoelnoob.proyectofinal_myfit

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListFragment : Fragment() {

    private var food : List<Food> = emptyList()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_list, container, false)

        initData()
        val recyclerView =
            view.findViewById<RecyclerView>(
                R.id.countriesRecycler
            )
        val adapter = FoodAdapter(food)
        //Lista anchura completa
        val layoutManager = LinearLayoutManager(container?.context)
        //Cuadricula 2X2
        //val gridLayoutManager = GridLayoutManager(container?.context, 2)

        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = adapter

        return view
    }

    private fun initData() {

        food = listOf(
            Food(1, "Egg", "18 grams", "calories: 50 for 100 grams ", "https://www.rionegro.com.ar/wp-content/uploads/2020/10/yema-de-huevo.jpg"),
            Food(2, "Meat", "12 grams", "calories: 80 for 100 grams", "https://th.bing.com/th/id/OIP.VdrUJiecvLlKvDOZJ9ONGQHaFP?rs=1&pid=ImgDetMain"),
            Food(3, "Tuna", "16 grams", "calories: 50 for 100 grams", "https://th.bing.com/th/id/OIP.UxXEpgQAVNgAbbfG6MScLwHaEJ?rs=1&pid=ImgDetMain"),
            Food(4, "Chiken", "17 grams", "calories: 60 for 100 grams", "https://th.bing.com/th/id/OIP.enWB2AZ4uv-rflb7TkQxaAHaHe?rs=1&pid=ImgDetMain"),
            Food(5, "Bacon", "12 grams", "calories: 60 for 100 grams", "https://th.bing.com/th/id/R.3b9928e46447c48cf4ef36b59e4ae80e?rik=nRUg2gRT7g9lyA&pid=ImgRaw&r=0"),
            Food(6, "Sausage", "11 grams", "calories: 60 for 100 grams", "https://th.bing.com/th/id/OIP.linwW5a1gvtjkGJcGwQQJwHaEm?rs=1&pid=ImgDetMain"),
            Food(7, "Pork Meat", "16 grams", "calories: 60 for 100 grams", "https://th.bing.com/th/id/R.52b06fe1c38db8e6eb838ffc24f00a42?rik=YR6%2fbzbvh2fy2g&pid=ImgRaw&r=0"),
            Food(8, "Serrain ham", "13 grams", "calories: 60 for 100 grams", "https://th.bing.com/th/id/OIP.I_-wIs3Z9-kzea7cHCVnuQHaFB?rs=1&pid=ImgDetMain"),
            Food(9, "Fish", "18 grams", "calories: 60 for 100 grams", "https://th.bing.com/th/id/OIP.RdT0MGrrVgJglvwlwSD02AHaE7?rs=1&pid=ImgDetMain"),
            Food(10, "shrimp", "15 grams", "calories: 60 for 100 grams", "https://th.bing.com/th/id/R.dba3bda3a935d08bff795714fd6b114c?rik=Aa1l4Yi1%2bnhKqQ&pid=ImgRaw&r=0")
        )
    }
}