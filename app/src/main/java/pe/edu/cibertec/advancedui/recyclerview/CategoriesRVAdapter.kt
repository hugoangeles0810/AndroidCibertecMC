package pe.edu.cibertec.advancedui.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CategoriesRVAdapter(
    private val items: List<Category>
) : RecyclerView.Adapter<CategoriesRVAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.view_item_category, parent, false)

        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val category = items[position]
        holder.bind(category)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val tvTitle: TextView = itemView.findViewById(R.id.tvTitle)
        private val ivPhoto: ImageView = itemView.findViewById(R.id.ivImage)

        fun bind(category: Category) {
            tvTitle.text = category.name
            ivPhoto.setImageResource(category.image)
        }
    }
}