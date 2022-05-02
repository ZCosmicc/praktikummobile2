package com.example.sports.ui.slideshow

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sports.R

class SlideshowAdapter(
    private val context: SlideshowFragment,
    private val dataset: List<SlideshowViewModel>
) : RecyclerView.Adapter<SlideshowAdapter.SlideshowViewHolder>() {

    class SlideshowViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val textView2: TextView = view.findViewById(R.id.item_desc)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SlideshowViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return SlideshowViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: SlideshowViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.textView2.text = context.resources.getString(item.stringResourceIds)
        holder.imageView.setImageResource(item.imageResourceId)
    }

    override fun getItemCount() = dataset.size
}