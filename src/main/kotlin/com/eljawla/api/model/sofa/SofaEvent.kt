package com.eljawla.api.model.sofa


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

data class SofaEvent(
    @SerialName("events")
    val events: List<Event> = listOf()
)

@Serializable
data class Event(
    @SerialName("tournament")
    val tournament: Tournament = Tournament(),
    @SerialName("season")
    val season: Season? = Season(),
    @SerialName("roundInfo")
    val roundInfo: RoundInfo? = RoundInfo(),
    @SerialName("customId")
    val customId: String = "", // EUbsGWb
    @SerialName("status")
    val status: Status = Status(),
    @SerialName("homeTeam")
    val homeTeam: Team = Team(),
    @SerialName("awayTeam")
    val awayTeam: Team = Team(),
    @SerialName("homeScore")
    val homeScore: Score = Score(),
    @SerialName("awayScore")
    val awayScore: Score = Score(),
    @SerialName("time")
    val time: Time? = Time(),
    @SerialName("changes")
    val changes: Changes = Changes(),
    @SerialName("hasGlobalHighlights")
    val hasGlobalHighlights: Boolean = false, // false
    @SerialName("hasEventPlayerStatistics")
    val hasEventPlayerStatistics: Boolean? = false, // true
    @SerialName("hasEventPlayerHeatMap")
    val hasEventPlayerHeatMap: Boolean? = false, // true
    @SerialName("detailId")
    val detailId: Int? = 0, // 1
    @SerialName("crowdsourcingDataDisplayEnabled")
    val crowdsourcingDataDisplayEnabled: Boolean = false, // false
    @SerialName("id")
    val id: Int = 0, // 11761891
    @SerialName("statusTime")
    val statusTime: StatusTime? = StatusTime(),
    @SerialName("crowdsourcingEnabled")
    val crowdsourcingEnabled: Boolean = false, // false
    @SerialName("startTimestamp")
    val startTimestamp: Int = 0, // 1705780800
    @SerialName("slug")
    val slug: String = "", // mali-tunisia
    @SerialName("lastPeriod")
    val lastPeriod: String? = "", // period1
    @SerialName("finalResultOnly")
    val finalResultOnly: Boolean = false, // false
    @SerialName("isEditor")
    val isEditor: Boolean? = false, // false
    @SerialName("hasXg")
    val hasXg: Boolean? = false, // true
    @SerialName("awayRedCards")
    val awayRedCards: Int? = 0, // 1
    @SerialName("coverage")
    val coverage: Int? = 0, // -1
    @SerialName("homeRedCards")
    val homeRedCards: Int? = 0, // 1
    @SerialName("winnerCode")
    val winnerCode: Int? = 0 // 1
)

@Serializable
data class Category(
    @SerialName("name")
    val name: String = "", // Africa
    @SerialName("slug")
    val slug: String = "", // africa
    @SerialName("sport")
    val sport: Sport = Sport(),
    @SerialName("id")
    val id: Int = 0, // 1466
    @SerialName("country")
    val country: Country? = Country(),
    @SerialName("flag")
    val flag: String = "", // africa
    @SerialName("alpha2")
    val alpha2: String? = "" // ES
)

@Serializable
data class Season(
    @SerialName("name")
    val name: String = "", // Africa Cup of Nations 2024
    @SerialName("year")
    val year: String = "", // 2024
    @SerialName("editor")
    val editor: Boolean = false, // false
    @SerialName("id")
    val id: Int = 0, // 56021
    @SerialName("seasonCoverageInfo")
    val seasonCoverageInfo: SeasonCoverageInfo? = SeasonCoverageInfo()
) {
    @Serializable
    data class SeasonCoverageInfo(
        @SerialName("editorCoverageLevel")
        val editorCoverageLevel: Int = 0 // 3
    )
}

@Serializable
data class RoundInfo(
    @SerialName("round")
    val round: Int = 0, // 2
    @SerialName("name")
    val name: String? = "", // Round of 32
    @SerialName("slug")
    val slug: String? = "", // round-of-32
    @SerialName("cupRoundType")
    val cupRoundType: Int? = 0 // 16
)

@Serializable
data class Status(
    @SerialName("code")
    val code: Int = 0, // 6
    @SerialName("description")
    val description: String = "", // 1st half
    @SerialName("type")
    val type: String = "" // inprogress
)

@Serializable
data class Time(
    @SerialName("initial")
    val initial: Int? = 0, // 0
    @SerialName("max")
    val max: Int? = 0, // 2700
    @SerialName("extra")
    val extra: Int? = 0, // 540
    @SerialName("currentPeriodStartTimestamp")
    val currentPeriodStartTimestamp: Int? = 0, // 1705780846
    @SerialName("injuryTime1")
    val injuryTime1: Int? = 0, // 0
    @SerialName("injuryTime2")
    val injuryTime2: Int? = 0 // 0
)

@Serializable
data class Changes(
    @SerialName("changes")
    val changes: List<String>? = listOf(),
    @SerialName("changeTimestamp")
    val changeTimestamp: Int = 0 // 1705780919
)

@Serializable
data class StatusTime(
    @SerialName("prefix")
    val prefix: String = "",
    @SerialName("initial")
    val initial: Int = 0, // 0
    @SerialName("max")
    val max: Int = 0, // 2700
    @SerialName("timestamp")
    val timestamp: Int = 0, // 1705780846
    @SerialName("extra")
    val extra: Int = 0 // 540
)

@Serializable
data class Team(
    @SerialName("name")
    val name: String = "", // Tunisia
    @SerialName("slug")
    val slug: String = "", // tunisia
    @SerialName("shortName")
    val shortName: String = "", // Tunisia
    @SerialName("gender")
    val gender: String? = "", // M
    @SerialName("sport")
    val sport: Sport = Sport(),
    @SerialName("userCount")
    val userCount: Int = 0, // 73535
    @SerialName("nameCode")
    val nameCode: String = "", // TUN
    @SerialName("ranking")
    val ranking: Int? = 0, // 28
    @SerialName("disabled")
    val disabled: Boolean? = false, // false
    @SerialName("national")
    val national: Boolean = false, // true
    @SerialName("type")
    val type: Int = 0, // 0
    @SerialName("id")
    val id: Int = 0, // 4729
    @SerialName("country")
    val country: Country? = Country(),
    @SerialName("subTeams")
    val subTeams: List<Unit> = listOf(),
    @SerialName("teamColors")
    val teamColors: TeamColors = TeamColors(),
    @SerialName("fieldTranslations")
    val fieldTranslations: FieldTranslations? = FieldTranslations()
) {
    @Serializable
    data class TeamColors(
        @SerialName("primary")
        val primary: String = "", // #ffffff
        @SerialName("secondary")
        val secondary: String = "", // #ffffff
        @SerialName("text")
        val text: String = "" // #ffffff
    )
}


@Serializable
data class Sport(
    @SerialName("name")
    val name: String = "", // Football
    @SerialName("slug")
    val slug: String = "", // football
    @SerialName("id")
    val id: Int = 0 // 1
)

@Serializable
data class Country(
    @SerialName("alpha2")
    val alpha2: String? = "", // TN
    @SerialName("name")
    val name: String? = "" // Tunisia
)

@Serializable
data class Score(
    @SerialName("current")
    val current: Int = 0, // 0
    @SerialName("display")
    val display: Int = 0, // 0
    @SerialName("period1")
    val period1: Int? = 0, // 0
    @SerialName("normaltime")
    val normaltime: Int? = 0, // 0
    @SerialName("period2")
    val period2: Int? = 0, // 0
    @SerialName("extra1")
    val extra1: Int? = 0, // 0
    @SerialName("extra2")
    val extra2: Int? = 0, // 0
    @SerialName("overtime")
    val overtime: Int? = 0, // 0
    @SerialName("penalties")
    val penalties: Int? = 0 // 0
)

@Serializable
data class FieldTranslations(
    @SerialName("nameTranslation")
    val nameTranslation: NameTranslation = NameTranslation(),
    @SerialName("shortNameTranslation")
    val shortNameTranslation: ShortNameTranslation? = ShortNameTranslation()
) {
    @Serializable
    data class NameTranslation(
        @SerialName("ar")
        val ar: String = "" // إستويانتوس دي لابلادا
    )

    @Serializable
    class ShortNameTranslation
}