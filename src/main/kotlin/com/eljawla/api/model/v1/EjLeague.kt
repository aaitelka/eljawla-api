package com.eljawla.api.model.v1


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class EjLeague(
    @SerialName("get")
    val `get`: String? = null, // leagues
    @SerialName("parameters")
    val parameters: Parameters? = null,
    @SerialName("errors")
    val errors: List<Unit?>? = null,
    @SerialName("results")
    val results: Int? = null, // 1
    @SerialName("paging")
    val paging: Paging? = null,
    @SerialName("response")
    val response: List<Response?>? = null
) {
    @Serializable
    data class Parameters(
        @SerialName("id")
        val id: String? = null // 39
    )

    @Serializable
    data class Paging(
        @SerialName("current")
        val current: Int? = null, // 1
        @SerialName("total")
        val total: Int? = null // 1
    )

    @Serializable
    data class Response(
        @SerialName("league")
        val league: League? = null,
        @SerialName("country")
        val country: Country? = null,
        @SerialName("seasons")
        val seasons: List<Season?>? = null
    ) {
        @Serializable
        data class League(
            @SerialName("id")
            val id: Int? = null, // 39
            @SerialName("name")
            val name: String? = null, // Premier League
            @SerialName("type")
            val type: String? = null, // League
            @SerialName("logo")
            val logo: String? = null // https://media.api-sports.io/football/leagues/39.png
        )

        @Serializable
        data class Country(
            @SerialName("name")
            val name: String? = null, // England
            @SerialName("code")
            val code: String? = null, // GB
            @SerialName("flag")
            val flag: String? = null // https://media.api-sports.io/flags/gb.svg
        )

        @Serializable
        data class Season(
            @SerialName("year")
            val year: Int? = null, // 2010
            @SerialName("start")
            val start: String? = null, // 2010-08-14
            @SerialName("end")
            val end: String? = null, // 2011-05-17
            @SerialName("current")
            val current: Boolean? = null, // false
            @SerialName("coverage")
            val coverage: Coverage? = null
        ) {
            @Serializable
            data class Coverage(
                @SerialName("fixtures")
                val fixtures: Fixtures? = null,
                @SerialName("standings")
                val standings: Boolean? = null, // true
                @SerialName("players")
                val players: Boolean? = null, // true
                @SerialName("top_scorers")
                val topScorers: Boolean? = null, // true
                @SerialName("top_assists")
                val topAssists: Boolean? = null, // true
                @SerialName("top_cards")
                val topCards: Boolean? = null, // true
                @SerialName("injuries")
                val injuries: Boolean? = null, // false
                @SerialName("predictions")
                val predictions: Boolean? = null, // true
                @SerialName("odds")
                val odds: Boolean? = null // false
            ) {
                @Serializable
                data class Fixtures(
                    @SerialName("events")
                    val events: Boolean? = null, // true
                    @SerialName("lineups")
                    val lineups: Boolean? = null, // true
                    @SerialName("statistics_fixtures")
                    val statisticsFixtures: Boolean? = null, // false
                    @SerialName("statistics_players")
                    val statisticsPlayers: Boolean? = null // false
                )
            }
        }
    }
}