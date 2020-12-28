package com.example.recicleviewexample

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class CCatalogAdapter (catalogArray:ArrayList<CCatalog>, context:Context):
    RecyclerView.Adapter<CCatalogAdapter.ViewHolder>() {

    var t_catalogArray = catalogArray
    var t_context = context

    class ViewHolder(view:View):RecyclerView.ViewHolder(view) {

        val txtTitle = view.findViewById<TextView>(R.id.txtTitle)
        val txtContent = view.findViewById<TextView>(R.id.txtContent)
        val txtPrice = view.findViewById<TextView>(R.id.txtPrice)

        fun bind(catalogItem:CCatalog, context: Context) {
            txtTitle.text = catalogItem.title
            txtContent.text = catalogItem.content
            txtPrice.text = catalogItem.price.toString()

            itemView.setOnClickListener() {
                Toast.makeText(context,"Pressed ${catalogItem.title}",Toast.LENGTH_SHORT).show()
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(t_context)
        return ViewHolder(inflater.inflate(R.layout.catalog_item,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var itemCatalog = t_catalogArray.get(position)
        holder.bind(itemCatalog, t_context)
    }

    override fun getItemCount(): Int {
        return t_catalogArray.size
    }
}