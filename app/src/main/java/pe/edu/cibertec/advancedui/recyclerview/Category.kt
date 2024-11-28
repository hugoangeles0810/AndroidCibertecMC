package pe.edu.cibertec.advancedui.recyclerview

import androidx.annotation.DrawableRes

// TODO: 2. Definir la clase item, encargada de contener la información por cada listado
data class Category(
    val id: String,
    val name: String,
    @DrawableRes
    val image: Int
)

val CATEGORIES = listOf(
    Category("1", "Electronics", R.drawable.ic_electronics),
    Category("2", "Musics", R.drawable.ic_musics),
    Category("3", "Fashion", R.drawable.ic_fashion),
    Category("4", "Digital Service", R.drawable.ic_digital),
    Category("5", "Plants", R.drawable.ic_plants),
    Category("6", "Home", R.drawable.ic_home),
    Category("7", "Electronics II", R.drawable.ic_electronics),
    Category("8", "Musics II", R.drawable.ic_musics),
    Category("9", "Fashion II", R.drawable.ic_fashion),
    Category("10", "Digital Service II", R.drawable.ic_digital),
    Category("11", "Plants II", R.drawable.ic_plants),
    Category("12", "Home II", R.drawable.ic_home)
)
