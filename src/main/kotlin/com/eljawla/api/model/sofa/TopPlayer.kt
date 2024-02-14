package com.eljawla.api.model.sofa


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TopPlayer(
    @SerialName("topPlayers")
    val topPlayers: List<TopPlayer> = listOf()
) {
    @Serializable
    data class TopPlayer(
        @SerialName("event")
        val event: Event = Event(),
        @SerialName("totalPass")
        val totalPass: Int = 0, // 49
        @SerialName("accuratePass")
        val accuratePass: Int = 0, // 35
        @SerialName("totalLongBalls")
        val totalLongBalls: Int? = 0, // 6
        @SerialName("accurateLongBalls")
        val accurateLongBalls: Int? = 0, // 3
        @SerialName("goalAssist")
        val goalAssist: Int? = 0, // 1
        @SerialName("totalCross")
        val totalCross: Int? = 0, // 1
        @SerialName("accurateCross")
        val accurateCross: Int? = 0, // 1
        @SerialName("aerialWon")
        val aerialWon: Int? = 0, // 1
        @SerialName("duelLost")
        val duelLost: Int? = 0, // 13
        @SerialName("duelWon")
        val duelWon: Int? = 0, // 20
        @SerialName("challengeLost")
        val challengeLost: Int? = 0, // 2
        @SerialName("dispossessed")
        val dispossessed: Int? = 0, // 7
        @SerialName("totalContest")
        val totalContest: Int? = 0, // 12
        @SerialName("wonContest")
        val wonContest: Int? = 0, // 10
        @SerialName("bigChanceCreated")
        val bigChanceCreated: Int? = 0, // 1
        @SerialName("shotOffTarget")
        val shotOffTarget: Int? = 0, // 1
        @SerialName("onTargetScoringAttempt")
        val onTargetScoringAttempt: Int? = 0, // 3
        @SerialName("blockedScoringAttempt")
        val blockedScoringAttempt: Int? = 0, // 1
        @SerialName("goals")
        val goals: Int? = 0, // 2
        @SerialName("interceptionWon")
        val interceptionWon: Int? = 0, // 2
        @SerialName("totalTackle")
        val totalTackle: Int? = 0, // 6
        @SerialName("wasFouled")
        val wasFouled: Int? = 0, // 3
        @SerialName("fouls")
        val fouls: Int? = 0, // 2
        @SerialName("minutesPlayed")
        val minutesPlayed: Int = 0, // 90
        @SerialName("touches")
        val touches: Int = 0, // 99
        @SerialName("rating")
        val rating: Double = 0.0, // 9.8
        @SerialName("possessionLostCtrl")
        val possessionLostCtrl: Int = 0, // 30
        @SerialName("team")
        val team: Team = Team(),
        @SerialName("player")
        val player: Player = Player(),
        @SerialName("keyPass")
        val keyPass: Int? = 0, // 2
        @SerialName("ratingVersions")
        val ratingVersions: RatingVersions = RatingVersions(),
        @SerialName("aerialLost")
        val aerialLost: Int? = 0, // 2
        @SerialName("totalOffside")
        val totalOffside: Int? = 0, // 1
        @SerialName("expectedGoals")
        val expectedGoals: Double? = 0.0, // 1.7306
        @SerialName("expectedAssists")
        val expectedAssists: Double? = 0.0, // 0.0912763
        @SerialName("totalClearance")
        val totalClearance: Int? = 0, // 2
        @SerialName("goodHighClaim")
        val goodHighClaim: Int? = 0, // 1
        @SerialName("savedShotsFromInsideTheBox")
        val savedShotsFromInsideTheBox: Int? = 0, // 5
        @SerialName("penaltySave")
        val penaltySave: Int? = 0, // 1
        @SerialName("saves")
        val saves: Int? = 0, // 8
        @SerialName("punches")
        val punches: Int? = 0, // 2
        @SerialName("goalsPrevented")
        val goalsPrevented: Double? = 0.0, // 2.2017
        @SerialName("bigChanceMissed")
        val bigChanceMissed: Int? = 0, // 1
        @SerialName("hitWoodwork")
        val hitWoodwork: Int? = 0, // 1
        @SerialName("outfielderBlock")
        val outfielderBlock: Int? = 0, // 2
        @SerialName("totalKeeperSweeper")
        val totalKeeperSweeper: Int? = 0, // 1
        @SerialName("accurateKeeperSweeper")
        val accurateKeeperSweeper: Int? = 0 // 1
    ) {
        @Serializable
        data class Event(
            @SerialName("tournament")
            val tournament: Tournament = Tournament(),
            @SerialName("customId")
            val customId: String = "", // Xvjcscguc
            @SerialName("status")
            val status: Status = Status(),
            @SerialName("winnerCode")
            val winnerCode: Int = 0, // 2
            @SerialName("homeTeam")
            val homeTeam: HomeTeam = HomeTeam(),
            @SerialName("awayTeam")
            val awayTeam: AwayTeam = AwayTeam(),
            @SerialName("homeScore")
            val homeScore: HomeScore = HomeScore(),
            @SerialName("awayScore")
            val awayScore: AwayScore = AwayScore(),
            @SerialName("id")
            val id: Int = 0, // 11453461
            @SerialName("startTimestamp")
            val startTimestamp: Int = 0, // 1705862700
            @SerialName("slug")
            val slug: String = "", // west-ham-women-tottenham-fc-women
            @SerialName("finalResultOnly")
            val finalResultOnly: Boolean = false, // false
            @SerialName("hasXg")
            val hasXg: Boolean? = false // true
        ) {
            @Serializable
            data class Tournament(
                @SerialName("name")
                val name: String = "", // The FA Women's Super League
                @SerialName("slug")
                val slug: String = "", // the-fa-womens-super-league
                @SerialName("category")
                val category: Category = Category(),
                @SerialName("uniqueTournament")
                val uniqueTournament: UniqueTournament = UniqueTournament(),
                @SerialName("priority")
                val priority: Int = 0, // 20
                @SerialName("id")
                val id: Int = 0 // 15635
            ) {
                @Serializable
                data class Category(
                    @SerialName("name")
                    val name: String = "", // England
                    @SerialName("slug")
                    val slug: String = "", // england
                    @SerialName("sport")
                    val sport: Sport = Sport(),
                    @SerialName("id")
                    val id: Int = 0, // 1
                    @SerialName("flag")
                    val flag: String = "", // england
                    @SerialName("alpha2")
                    val alpha2: String = "" // EN
                ) {
                    @Serializable
                    data class Sport(
                        @SerialName("name")
                        val name: String = "", // Football
                        @SerialName("slug")
                        val slug: String = "", // football
                        @SerialName("id")
                        val id: Int = 0 // 1
                    )
                }

                @Serializable
                data class UniqueTournament(
                    @SerialName("name")
                    val name: String = "", // The FA Women's Super League
                    @SerialName("slug")
                    val slug: String = "", // the-fa-womens-super-league
                    @SerialName("primaryColorHex")
                    val primaryColorHex: String = "", // #1c0f32
                    @SerialName("secondaryColorHex")
                    val secondaryColorHex: String = "", // #fc4342
                    @SerialName("category")
                    val category: Category = Category(),
                    @SerialName("userCount")
                    val userCount: Int = 0, // 18653
                    @SerialName("id")
                    val id: Int = 0, // 1044
                    @SerialName("displayInverseHomeAwayTeams")
                    val displayInverseHomeAwayTeams: Boolean = false // false
                ) {
                    @Serializable
                    data class Category(
                        @SerialName("name")
                        val name: String = "", // England
                        @SerialName("slug")
                        val slug: String = "", // england
                        @SerialName("sport")
                        val sport: Sport = Sport(),
                        @SerialName("id")
                        val id: Int = 0, // 1
                        @SerialName("flag")
                        val flag: String = "", // england
                        @SerialName("alpha2")
                        val alpha2: String = "" // EN
                    ) {
                        @Serializable
                        data class Sport(
                            @SerialName("name")
                            val name: String = "", // Football
                            @SerialName("slug")
                            val slug: String = "", // football
                            @SerialName("id")
                            val id: Int = 0 // 1
                        )
                    }
                }
            }

            @Serializable
            data class Status(
                @SerialName("code")
                val code: Int = 0, // 100
                @SerialName("description")
                val description: String = "", // Ended
                @SerialName("type")
                val type: String = "" // finished
            )

            @Serializable
            data class HomeTeam(
                @SerialName("name")
                val name: String = "", // West Ham Women
                @SerialName("slug")
                val slug: String = "", // west-ham-women
                @SerialName("shortName")
                val shortName: String = "", // West Ham
                @SerialName("gender")
                val gender: String = "", // F
                @SerialName("sport")
                val sport: Sport = Sport(),
                @SerialName("userCount")
                val userCount: Int = 0, // 3850
                @SerialName("nameCode")
                val nameCode: String = "", // WHU
                @SerialName("disabled")
                val disabled: Boolean? = false, // false
                @SerialName("national")
                val national: Boolean = false, // false
                @SerialName("type")
                val type: Int = 0, // 0
                @SerialName("id")
                val id: Int = 0, // 297802
                @SerialName("teamColors")
                val teamColors: TeamColors = TeamColors()
            ) {
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
                data class TeamColors(
                    @SerialName("primary")
                    val primary: String = "", // #66192c
                    @SerialName("secondary")
                    val secondary: String = "", // #59b3e4
                    @SerialName("text")
                    val text: String = "" // #59b3e4
                )
            }

            @Serializable
            data class AwayTeam(
                @SerialName("name")
                val name: String = "", // Tottenham FC Women
                @SerialName("slug")
                val slug: String = "", // tottenham-fc-women
                @SerialName("shortName")
                val shortName: String = "", // Tottenham
                @SerialName("gender")
                val gender: String = "", // F
                @SerialName("sport")
                val sport: Sport = Sport(),
                @SerialName("userCount")
                val userCount: Int = 0, // 6052
                @SerialName("nameCode")
                val nameCode: String = "", // TOT
                @SerialName("disabled")
                val disabled: Boolean? = false, // false
                @SerialName("national")
                val national: Boolean = false, // false
                @SerialName("type")
                val type: Int = 0, // 0
                @SerialName("id")
                val id: Int = 0, // 273547
                @SerialName("teamColors")
                val teamColors: TeamColors = TeamColors()
            ) {
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
                data class TeamColors(
                    @SerialName("primary")
                    val primary: String = "", // #ffffff
                    @SerialName("secondary")
                    val secondary: String = "", // #000066
                    @SerialName("text")
                    val text: String = "" // #000066
                )
            }

            @Serializable
            data class HomeScore(
                @SerialName("current")
                val current: Int = 0, // 3
                @SerialName("display")
                val display: Int = 0, // 3
                @SerialName("period1")
                val period1: Int = 0, // 1
                @SerialName("period2")
                val period2: Int = 0, // 2
                @SerialName("normaltime")
                val normaltime: Int = 0 // 3
            )

            @Serializable
            data class AwayScore(
                @SerialName("current")
                val current: Int = 0, // 4
                @SerialName("display")
                val display: Int = 0, // 4
                @SerialName("period1")
                val period1: Int = 0, // 2
                @SerialName("period2")
                val period2: Int = 0, // 2
                @SerialName("normaltime")
                val normaltime: Int = 0 // 4
            )
        }

        @Serializable
        data class Team(
            @SerialName("name")
            val name: String = "", // Tottenham FC Women
            @SerialName("slug")
            val slug: String = "", // tottenham-fc-women
            @SerialName("shortName")
            val shortName: String = "", // Tottenham
            @SerialName("gender")
            val gender: String = "", // F
            @SerialName("sport")
            val sport: Sport = Sport(),
            @SerialName("userCount")
            val userCount: Int = 0, // 6052
            @SerialName("nameCode")
            val nameCode: String = "", // TOT
            @SerialName("disabled")
            val disabled: Boolean? = false, // false
            @SerialName("national")
            val national: Boolean = false, // false
            @SerialName("type")
            val type: Int = 0, // 0
            @SerialName("id")
            val id: Int = 0, // 273547
            @SerialName("teamColors")
            val teamColors: TeamColors = TeamColors()
        ) {
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
            data class TeamColors(
                @SerialName("primary")
                val primary: String = "", // #ffffff
                @SerialName("secondary")
                val secondary: String = "", // #000066
                @SerialName("text")
                val text: String = "" // #000066
            )
        }

        @Serializable
        data class Player(
            @SerialName("name")
            val name: String = "", // Grace Clinton
            @SerialName("slug")
            val slug: String = "", // grace-clinton
            @SerialName("shortName")
            val shortName: String = "", // G. Clinton
            @SerialName("position")
            val position: String = "", // M
            @SerialName("jerseyNumber")
            val jerseyNumber: String = "", // 8
            @SerialName("userCount")
            val userCount: Int = 0, // 97
            @SerialName("id")
            val id: Int = 0, // 1066034
            @SerialName("marketValueCurrency")
            val marketValueCurrency: String = "", // EUR
            @SerialName("dateOfBirthTimestamp")
            val dateOfBirthTimestamp: Int = 0, // 1049068800
            @SerialName("fieldTranslations")
            val fieldTranslations: FieldTranslations? = FieldTranslations(),
            @SerialName("firstName")
            val firstName: String? = "",
            @SerialName("lastName")
            val lastName: String? = ""
        ) {
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
                    val ar: String = "" // توريس, فيران
                )

                @Serializable
                class ShortNameTranslation
            }
        }

        @Serializable
        data class RatingVersions(
            @SerialName("original")
            val original: Double = 0.0, // 9.8
            @SerialName("alternative")
            val alternative: Double = 0.0 // 9.8
        )
    }
}