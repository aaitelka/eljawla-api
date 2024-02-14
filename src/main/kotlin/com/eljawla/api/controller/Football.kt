package com.eljawla.api.controller

import org.springframework.http.ResponseEntity

interface Sport<T> {

    fun getLiveEvents(): ResponseEntity<T>

    fun getEventsByDate(date: String): ResponseEntity<T>
}