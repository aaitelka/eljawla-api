package com.eljawla.api.model.sofa


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SofaPlayer(
    @SerialName("topPlayers")
    val topPlayers: List<TopPlayer?>? = null
) {
    @Serializable
    data class TopPlayer(
        @SerialName("event")
        val event: Event? = null,
        @SerialName("totalPass")
        val totalPass: Int? = null, // 46
        @SerialName("accuratePass")
        val accuratePass: Int? = null, // 42
        @SerialName("totalLongBalls")
        val totalLongBalls: Int? = null, // 1
        @SerialName("accurateLongBalls")
        val accurateLongBalls: Int? = null, // 1
        @SerialName("goalAssist")
        val goalAssist: Int? = null, // 1
        @SerialName("aerialLost")
        val aerialLost: Int? = null, // 2
        @SerialName("aerialWon")
        val aerialWon: Int? = null, // 1
        @SerialName("duelLost")
        val duelLost: Int? = null, // 4
        @SerialName("duelWon")
        val duelWon: Int? = null, // 9
        @SerialName("dispossessed")
        val dispossessed: Int? = null, // 1
        @SerialName("totalContest")
        val totalContest: Int? = null, // 1
        @SerialName("wonContest")
        val wonContest: Int? = null, // 1
        @SerialName("shotOffTarget")
        val shotOffTarget: Int? = null, // 1
        @SerialName("onTargetScoringAttempt")
        val onTargetScoringAttempt: Int? = null, // 4
        @SerialName("blockedScoringAttempt")
        val blockedScoringAttempt: Int? = null, // 2
        @SerialName("goals")
        val goals: Int? = null, // 2
        @SerialName("totalTackle")
        val totalTackle: Int? = null, // 4
        @SerialName("wasFouled")
        val wasFouled: Int? = null, // 3
        @SerialName("fouls")
        val fouls: Int? = null, // 1
        @SerialName("minutesPlayed")
        val minutesPlayed: Int? = null, // 90
        @SerialName("touches")
        val touches: Int? = null, // 72
        @SerialName("rating")
        val rating: Double? = null, // 9.4
        @SerialName("possessionLostCtrl")
        val possessionLostCtrl: Int? = null, // 8
        @SerialName("team")
        val team: Team? = null,
        @SerialName("player")
        val player: Player? = null,
        @SerialName("keyPass")
        val keyPass: Int? = null, // 1
        @SerialName("ratingVersions")
        val ratingVersions: RatingVersions? = null,
        @SerialName("totalClearance")
        val totalClearance: Int? = null, // 2
        @SerialName("lastManTackle")
        val lastManTackle: Int? = null, // 1
        @SerialName("goodHighClaim")
        val goodHighClaim: Int? = null, // 1
        @SerialName("savedShotsFromInsideTheBox")
        val savedShotsFromInsideTheBox: Int? = null, // 4
        @SerialName("penaltySave")
        val penaltySave: Int? = null, // 1
        @SerialName("saves")
        val saves: Int? = null, // 7
        @SerialName("punches")
        val punches: Int? = null, // 1
        @SerialName("totalCross")
        val totalCross: Int? = null, // 9
        @SerialName("accurateCross")
        val accurateCross: Int? = null, // 3
        @SerialName("bigChanceCreated")
        val bigChanceCreated: Int? = null, // 1
        @SerialName("bigChanceMissed")
        val bigChanceMissed: Int? = null, // 1
        @SerialName("interceptionWon")
        val interceptionWon: Int? = null, // 2
        @SerialName("hitWoodwork")
        val hitWoodwork: Int? = null, // 1
        @SerialName("challengeLost")
        val challengeLost: Int? = null, // 1
        @SerialName("outfielderBlock")
        val outfielderBlock: Int? = null, // 1
        @SerialName("totalOffside")
        val totalOffside: Int? = null // 1
    )

    @Serializable
    data class Event(
        @SerialName("tournament")
        val tournament: Tournament? = null,
        @SerialName("customId")
        val customId: String? = null, // VzksLDX
        @SerialName("status")
        val status: Status? = null,
        @SerialName("winnerCode")
        val winnerCode: Int? = null, // 2
        @SerialName("homeTeam")
        val homeTeam: Team? = null,
        @SerialName("awayTeam")
        val awayTeam: Team? = null,
        @SerialName("homeScore")
        val homeScore: Score? = null,
        @SerialName("awayScore")
        val awayScore: Score? = null,
        @SerialName("id")
        val id: Int? = null, // 11764749
        @SerialName("startTimestamp")
        val startTimestamp: Int? = null, // 1706212800
        @SerialName("slug")
        val slug: String? = null, // skn-st-polten-olympique-lyonnais
        @SerialName("finalResultOnly")
        val finalResultOnly: Boolean? = null // false
    )

    @Serializable
    data class Player(
        @SerialName("name")
        val name: String? = null, // Sara Däbritz
        @SerialName("firstName")
        val firstName: String? = null,
        @SerialName("lastName")
        val lastName: String? = null,
        @SerialName("slug")
        val slug: String? = null, // sara-dabritz
        @SerialName("shortName")
        val shortName: String? = null, // S. Däbritz
        @SerialName("position")
        val position: String? = null, // M
        @SerialName("jerseyNumber")
        val jerseyNumber: String? = null, // 8
        @SerialName("userCount")
        val userCount: Int? = null, // 408
        @SerialName("id")
        val id: Int? = null, // 151104
        @SerialName("marketValueCurrency")
        val marketValueCurrency: String? = null, // EUR
        @SerialName("dateOfBirthTimestamp")
        val dateOfBirthTimestamp: Int? = null, // 792806400
        @SerialName("fieldTranslations")
        val fieldTranslations: FieldTranslations? = null
    )
}

@Serializable
data class RatingVersions(
    @SerialName("original")
    val original: Double? = null, // 9.4
    @SerialName("alternative")
    val alternative: Double? = null // 9.9
)
