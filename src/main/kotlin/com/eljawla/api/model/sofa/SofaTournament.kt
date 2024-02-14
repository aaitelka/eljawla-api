package com.eljawla.api.model.sofa


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SofaTournament(
    @SerialName("tournament")
    val tournament: Tournament? = null
)

@Serializable
data class Tournament(
    @SerialName("name")
    val name: String = "", // Africa Cup of Nations, Group E
    @SerialName("slug")
    val slug: String = "", // africa-cup-of-nations-group-e
    @SerialName("category")
    val category: Category = Category(),
    @SerialName("uniqueTournament")
    val uniqueTournament: UniqueTournament = UniqueTournament(),
    @SerialName("priority")
    val priority: Int = 0, // 628
    @SerialName("id")
    val id: Int = 0 // 72223
)
