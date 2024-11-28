package pe.edu.cibertec.advancedui.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO: 6. Conectar el recycler view con su adapter
        recyclerView = findViewById(R.id.recyclerView)
        val adapter = CategoriesRVAdapter()
        recyclerView.adapter = adapter
        // TODO: 7. Manipular el adapter para agregar items a mostrar/actualizar/borrar
        adapter.updateItems(CATEGORIES)
    }
}