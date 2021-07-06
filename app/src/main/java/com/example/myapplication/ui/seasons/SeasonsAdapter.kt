package com.example.myapplication.ui.seasons

import android.view.LayoutInflater
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.myapplication.data.model.Season
import com.example.myapplication.databinding.ItemEpisodeBinding
import com.example.myapplication.ui.main.BaseAdapter
import com.example.myapplication.ui.main.BaseViewHolder

class SeasonsAdapter(private val listener: (item: Season)-> Unit): BaseAdapter() {

    var videoArray = mutableListOf<Season>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        val binding = ItemEpisodeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return  SeasonsViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return videoArray.size
    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        setupGalleryViewHolder(holder as SeasonsViewHolder, position)
    }

    private fun setupGalleryViewHolder(holder: SeasonsViewHolder, position: Int) {
        val item = videoArray[position]
        holder.bind(item)
        holder.itemView.setOnClickListener {
            listener.invoke(item)
        }
    }

    fun addItems(items: MutableList<Season>) {
        videoArray = items
        notifyDataSetChanged()
    }
}

class SeasonsViewHolder(var binding: ItemEpisodeBinding): BaseViewHolder(binding.root){
    fun bind(item: Season) {
        binding.tvSeasons.text = item.title
        Glide.with(binding.ivPreviewImage.context).load(item.urlImage).into(binding.ivPreviewImage)
    }
}

//interface SeasonClickListener {
//    fun onItemClick(item: Season)
//}
