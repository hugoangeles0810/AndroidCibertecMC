package pe.edu.cibertec.advancedui.recyclerview

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Categoria Electronics
        val tvTitle1 = findViewById<TextView>(R.id.tvTitle1)
        tvTitle1.text = "Electronics"
        val ivPhoto1 = findViewById<ImageView>(R.id.ivImage1)
        ivPhoto1.setImageResource(R.drawable.ic_electronics)

        // Categoria Electronics
        val tvTitle2 = findViewById<TextView>(R.id.tvTitle2)
        tvTitle2.text = "Musics"
        val ivPhoto2 = findViewById<ImageView>(R.id.ivImage2)
        ivPhoto2.setImageResource(R.drawable.ic_musics)
    }
}