package pe.edu.ilp.appcoleccionlibro.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import pe.edu.ilp.appcoleccionlibro.Libro
import pe.edu.ilp.appcoleccionlibro.R

class LibroAdapter(private val libroList: List<Libro>): RecyclerView.Adapter<LibroViewHolder>() {

    //Devuelve el contenido de la lista al viewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LibroViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return LibroViewHolder(layoutInflater.inflate(R.layout.item_libro,parent,false)
        )
    }

    override fun onBindViewHolder(holder: LibroViewHolder, position: Int) {
        val item = libroList[position]
        holder.render(item)
    }

    //Devolver el tamaño de lista
    override fun getItemCount(): Int {
        return libroList.size
    }
}