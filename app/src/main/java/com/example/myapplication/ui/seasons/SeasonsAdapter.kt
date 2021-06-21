package com.example.myapplication.ui.seasons

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.myapplication.data.model.VideoModel
import com.example.myapplication.databinding.ItemEpisodeBinding
import com.example.myapplication.ui.main.BaseAdapter
import com.example.myapplication.ui.main.BaseViewHolder

class SeasonsAdapter: BaseAdapter() {

    var videoArray = mutableListOf<VideoModel>()

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
    }

    fun addItems(items: MutableList<VideoModel>) {
        videoArray = items
        notifyDataSetChanged()
    }

}

class SeasonsViewHolder(var binding: ItemEpisodeBinding): BaseViewHolder(binding.root){
    fun bind(item: VideoModel) {
        binding.tvSeasons.text = item.url
    }
}
