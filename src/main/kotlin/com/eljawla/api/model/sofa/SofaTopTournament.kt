package com.eljawla.api.model.sofa


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SofaTopTournament(
    @SerialName("uniqueTournaments")
    val uniqueTournaments: List<UniqueTournament> = listOf()
)

@Serializable
data class UniqueTournament(
    @SerialName("name")
    val name: String = "", // Africa Cup of Nations
    @SerialName("slug")
    val slug: String = "", // africa-cup-of-nations
    @SerialName("primaryColorHex")
    val primaryColorHex: String? = "", // #00752e
    @SerialName("secondaryColorHex")
    val secondaryColorHex: String? = "", // #edc73e
    @SerialName("category")
    val category: Category = Category(),
    @SerialName("userCount")
    val userCount: Int = 0, // 329365
    @SerialName("id")
    val id: Int = 0, // 270
    @SerialName("country")
    val country: Country? = Country(),
    @SerialName("hasEventPlayerStatistics")
    val hasEventPlayerStatistics: Boolean = false, // true
    @SerialName("crowdsourcingEnabled")
    val crowdsourcingEnabled: Boolean = false, // false
    @SerialName("hasPerformanceGraphFeature")
    val hasPerformanceGraphFeature: Boolean = false, // false
    @SerialName("displayInverseHomeAwayTeams")
    val displayInverseHomeAwayTeams: Boolean = false // false
) {

    @Serializable
    class Country
}
