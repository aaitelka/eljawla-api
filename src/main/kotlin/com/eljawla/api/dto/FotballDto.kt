package com.eljawla.api.dto

import com.eljawla.api.model.sofa.SofaEvent
import com.eljawla.api.model.v1.EJEvent
import com.eljawla.api.utils.toSimpleDate


fun SofaEvent.asEJEvent(): EJEvent {
    return EJEvent(
        get = "fixtures",
        parameters = EJEvent.Parameters(date = null),
        errors = listOf(),
        results = events.count(),
        paging = EJEvent.Paging(current = 1, total = events.count() / 10),
        response = events.map { event ->
            EJEvent.Response(
                key = event.customId,
                fixture = EJEvent.Response.Fixture(
                    id = event.id,
                    referee = null,
                    timezone = null,
                    date = event.startTimestamp.toSimpleDate(),
                    timestamp = event.startTimestamp,
                    periods = EJEvent.Response.Fixture.Periods(
                        first = event.time?.injuryTime1,
                        second = event.time?.injuryTime2
                    ),
                    venue = EJEvent.Response.Fixture.Venue(id = 0, name = null, city = null),
                    status = EJEvent.Response.Fixture.Status(
                        long = event.status.description,
                        short = event.status.type,
                        elapsed = event.statusTime?.extra?.div(6)
                    )
                ),
                league = EJEvent.Response.League(
                    id = event.tournament.uniqueTournament.id,
                    name = event.tournament.uniqueTournament.name,
                    country = EJEvent.Response.Country(
                        id = 0,
                        name = event.tournament.category.country?.name,
                        alpha = event.tournament.category.country?.alpha2,
                        flag = "https://www.sofascore.com/static/images/flags/${event.tournament.category.alpha2?.lowercase()}.png",
                    ),
                    logo = "https://api.sofascore.app/api/v1/unique-tournament/${event.tournament.uniqueTournament.id}/image/dark",
                    season = event.season?.year.orEmpty(),
                    round = event.roundInfo?.name.orEmpty()
                ),
                teams = EJEvent.Response.Teams(
                    home = EJEvent.Response.Teams.Home(
                        id = event.homeTeam.id,
                        name = EJEvent.Response.Teams.Name(
                            ar = event.homeTeam.fieldTranslations?.nameTranslation?.ar,
                            en = event.homeTeam.name
                        ),
                        logo = "https://api.sofascore.app/api/v1/team/${event.homeTeam.id}/image",
                        winner = false
                    ),
                    away = EJEvent.Response.Teams.Away(
                        id = event.awayTeam.id,
                        name = EJEvent.Response.Teams.Name(
                            ar = event.awayTeam.fieldTranslations?.nameTranslation?.ar,
                            en = event.awayTeam.name
                        ),
                        logo = "https://api.sofascore.app/api/v1/team/${event.awayTeam.id}/image",
                        winner = false
                    )
                ),
                goals = EJEvent.Response.Goals(
                    home = event.homeScore.current,
                    away = event.awayScore.current
                ),
                score = EJEvent.Response.Score(
                    halftime = EJEvent.Response.Score.Halftime(
                        home = event.homeScore.period1,
                        away = event.awayScore.period1
                    ),
                    fullTime = EJEvent.Response.Score.FullTime(
                        home = event.homeScore.normaltime,
                        away = event.awayScore.normaltime
                    ),
                    extraTime = EJEvent.Response.Score.ExtraTime(
                        home = event.homeScore.extra1?.plus(
                            event.homeScore.extra2!!
                        ),
                        away = event.awayScore.extra1?.plus(
                            event.awayScore.extra2!!
                        )
                    ),
                    penalty = EJEvent.Response.Score.Penalty(
                        home = event.homeScore.penalties,
                        away = event.awayScore.penalties
                    )
                )
            )
        }
    )
}
