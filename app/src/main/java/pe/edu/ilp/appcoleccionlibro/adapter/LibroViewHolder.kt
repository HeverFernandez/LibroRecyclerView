package pe.edu.ilp.appcoleccionlibro.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import pe.edu.ilp.appcoleccionlibro.Libro
import pe.edu.ilp.appcoleccionlibro.R

class LibroViewHolder(view: View): RecyclerView.ViewHolder(view) {

    val titulo = view.findViewById<TextView>(R.id.tvTitulo)
    val publisher = view.findViewById<TextView>(R.id.tvPublicacion)
    val autor = view.findViewById<TextView>(R.id.tvAutor)

    fun render(libro: Libro){
        titulo.text = libro.titulo
        publisher.text = libro.apublicacion
        autor.text = libro.autor
    }


}