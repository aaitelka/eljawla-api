package com.eljawla.api.model.sofa


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

//https://api.sofascore.com/api/v1/unique-tournament/8/media
//https://api.sofascore.com/api/v1/tournament/2/media
//https://api.sofascore.com/api/v1/player/991011/media

@Serializable
data class SofaMedia(
    @SerialName("media")
    val media: List<Media?>? = null
) {
    @Serializable
    data class Media(
        @SerialName("title")
        val title: String? = null, // Granada 0-1 Atlético Madrid
        @SerialName("subtitle")
        val subtitle: String? = null, // Full Highlights
        @SerialName("url")
        val url: String? = null, // https://www.youtube.com/watch?v=m-118hNCDj4&pp=ygUQZ3JhbmFkYSBhdGxldGljbw%3D%3D
        @SerialName("thumbnailUrl")
        val thumbnailUrl: String? = null, // https://img.youtube.com/vi/m-118hNCDj4/hqdefault.jpg
        @SerialName("mediaType")
        val mediaType: Int? = null, // 1
        @SerialName("doFollow")
        val doFollow: Boolean? = null, // false
        @SerialName("keyHighlight")
        val keyHighlight: Boolean? = null, // true
        @SerialName("id")
        val id: Int? = null, // 5318202
        @SerialName("createdAtTimestamp")
        val createdAtTimestamp: Int? = null, // 1706011060
        @SerialName("sourceUrl")
        val sourceUrl: String? = null, // https://www.youtube.com/watch?v=m-118hNCDj4&pp=ygUQZ3JhbmFkYSBhdGxldGljbw%3D%3D
        @SerialName("forCountries")
        val forCountries: List<String?>? = null
    )
}