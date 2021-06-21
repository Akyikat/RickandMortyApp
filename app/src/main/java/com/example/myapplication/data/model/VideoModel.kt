package com.example.myapplication.data.model

data class VideoModel(
    val url: String,
    val name: String = "",
    val previewImage: String = ""
)

fun getVideo(): MutableList<VideoModel> {
    return mutableListOf<VideoModel>().apply {
        add(VideoModel("https://static.bulbul.kg/mp4/9/73409.94a48ab333575954b93499ae4b9d51ba.240.mp4"))
        add(VideoModel("https://static.bulbul.kg/mp4/9/73409.94a48ab333575954b93499ae4b9d51ba.240.mp4"))
        add(VideoModel("https://static.bulbul.kg/mp4/9/73409.94a48ab333575954b93499ae4b9d51ba.240.mp4"))
        add(VideoModel("https://static.bulbul.kg/mp4/9/73409.94a48ab333575954b93499ae4b9d51ba.240.mp4"))
        add(VideoModel("https://static.bulbul.kg/mp4/9/73409.94a48ab333575954b93499ae4b9d51ba.240.mp4"))
        add(VideoModel("https://static.bulbul.kg/mp4/9/73409.94a48ab333575954b93499ae4b9d51ba.240.mp4"))
        add(VideoModel("https://static.bulbul.kg/mp4/9/73409.94a48ab333575954b93499ae4b9d51ba.240.mp4"))
        add(VideoModel("https://static.bulbul.kg/mp4/9/73409.94a48ab333575954b93499ae4b9d51ba.240.mp4"))
        add(VideoModel("https://static.bulbul.kg/mp4/9/73409.94a48ab333575954b93499ae4b9d51ba.240.mp4"))
    }
}