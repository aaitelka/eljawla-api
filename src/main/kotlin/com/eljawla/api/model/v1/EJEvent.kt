package com.eljawla.api.model.v1


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class EJEvent(
    @SerialName("get")
    val `get`: String?,
    @SerialName("parameters")
    val parameters: Parameters?,
    @SerialName("errors")
    val errors: List<Unit>?,
    @SerialName("results")
    val results: Int?,
    @SerialName("paging")
    val paging: Paging?,
    @SerialName("response")
    val response: List<Response>?
) {
    @Serializable
    data class Parameters(
        @SerialName("date")
        val date: String?,
    )

    @Serializable
    data class Paging(
        @SerialName("current")
        val current: Int?,
        @SerialName("total")
        val total: Int?,
    )

    @Serializable
    data class Response(
        @SerialName("key")
        val key: String?,
        @SerialName("fixture")
        val fixture: Fixture?,
        @SerialName("league")
        val league: League?,
        @SerialName("teams")
        val teams: Teams?,
        @SerialName("goals")
        val goals: Goals?,
        @SerialName("score")
        val score: Score?
    ) {
        @Serializable
        data class Fixture(
            @SerialName("id")
            val id: Int?,
            @SerialName("referee")
            val referee: String?,
            @SerialName("timezone")
            val timezone: String?,
            @SerialName("date")
            val date: String?,
            @SerialName("timestamp")
            val timestamp: Int?,
            @SerialName("periods")
            val periods: Periods?,
            @SerialName("venue")
            val venue: Venue?,
            @SerialName("status")
            val status: Status?,
        ) {
            @Serializable
            data class Periods(
                @SerialName("first")
                val first: Int?,
                @SerialName("second")
                val second: Int?,
            )

            @Serializable
            data class Venue(
                @SerialName("id")
                val id: Int?,
                @SerialName("name")
                val name: String?,
                @SerialName("city")
                val city: String?,
            )

            @Serializable
            data class Status(
                @SerialName("long")
                val long: String?,
                @SerialName("short")
                val short: String?,
                @SerialName("elapsed")
                val elapsed: Int?,
            )
        }

        @Serializable
        data class League(
            @SerialName("id")
            val id: Int?,
            @SerialName("name")
            val name: String?,
            @SerialName("country")
            val country: Country?,
            @SerialName("logo")
            val logo: String?,
            @SerialName("season")
            val season: String?,
            @SerialName("round")
            val round: String?,
        )

        @Serializable
        data class Country(
            @SerialName("id")
            val id: Int?,
            @SerialName("name")
            val name: String?,
            @SerialName("alpha")
            val alpha: String?,
            @SerialName("flag")
            val flag: String?,
        )

        @Serializable
        data class Teams(
            @SerialName("home")
            val home: Home?,
            @SerialName("away")
            val away: Away?,
        ) {
            @Serializable
            data class Home(
                @SerialName("id")
                val id: Int?,
                @SerialName("name")
                val name: Name?,
                @SerialName("logo")
                val logo: String?,
                @SerialName("winner")
                val winner: Boolean?,
            )

            @Serializable
            data class Away(
                @SerialName("id")
                val id: Int?,
                @SerialName("name")
                val name: Name?,
                @SerialName("logo")
                val logo: String?,
                @SerialName("winner")
                val winner: Boolean?,
            )

            @Serializable
            data class Name(
                val ar: String?,
                val en: String?,
            )
        }

        @Serializable
        data class Goals(
            @SerialName("home")
            val home: Int?,
            @SerialName("away")
            val away: Int?
        )

        @Serializable
        data class Score(
            @SerialName("halftime")
            val halftime: Halftime?,
            @SerialName("fulltime")
            val fullTime: FullTime?,
            @SerialName("extratime")
            val extraTime: ExtraTime?,
            @SerialName("penalty")
            val penalty: Penalty?,
        ) {
            @Serializable
            data class Halftime(
                @SerialName("home")
                val home: Int?,
                @SerialName("away")
                val away: Int?,
            )

            @Serializable
            data class FullTime(
                @SerialName("home")
                val home: Int?,
                @SerialName("away")
                val away: Int?,
            )

            @Serializable
            data class ExtraTime(
                @SerialName("home")
                val home: Int?,
                @SerialName("away")
                val away: Int?,
            )

            @Serializable
            data class Penalty(
                @SerialName("home")
                val home: Int?,
                @SerialName("away")
                val away: Int?,
            )
        }
    }
}