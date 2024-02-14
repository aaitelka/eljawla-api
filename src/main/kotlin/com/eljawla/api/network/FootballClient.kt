package com.eljawla.api.network

import com.eljawla.api.model.sofa.SofaEvent
import com.eljawla.api.sport.Sport
import com.eljawla.api.utils.SOFA_LIVE_EVENTS
import com.eljawla.api.utils.SOFA_SCHEDULED_EVENTS
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.service.annotation.GetExchange

interface FootballClient : Sport<SofaEvent> {

    @GetExchange(SOFA_LIVE_EVENTS)
    override fun getLiveEvents(): SofaEvent

    @GetExchange(SOFA_SCHEDULED_EVENTS.plus("/{date}"))
    override fun getScheduledEvent(@PathVariable date: String): SofaEvent
}