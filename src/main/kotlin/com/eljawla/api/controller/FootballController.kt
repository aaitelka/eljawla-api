package com.eljawla.api.controller

import com.eljawla.api.dto.asEJEvent
import com.eljawla.api.model.v1.EJEvent
import com.eljawla.api.network.FootballClient
import com.eljawla.api.sport.Sport
import com.eljawla.api.utils.FOOTBALL
import com.eljawla.api.utils.LIVE_EVENTS
import com.eljawla.api.utils.SCHEDULED_EVENTS
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(FOOTBALL)
class FootballController @Autowired constructor(private val footballClient: FootballClient) :
    Sport<ResponseEntity<EJEvent>> {

    @GetMapping("")
    fun running() = ResponseEntity.ok("Server Running")

    @CrossOrigin(origins = ["http://localhost:3000"])
    @GetMapping(LIVE_EVENTS)
    override fun getLiveEvents(): ResponseEntity<EJEvent> =
        ResponseEntity.ok(footballClient.getLiveEvents().asEJEvent())

    @CrossOrigin(origins = ["http://localhost:3000"])
    @GetMapping(SCHEDULED_EVENTS.plus("/{date}"))
    override fun getScheduledEvent(@PathVariable date: String): ResponseEntity<EJEvent> =
        ResponseEntity.ok(footballClient.getScheduledEvent(date).asEJEvent())
}
