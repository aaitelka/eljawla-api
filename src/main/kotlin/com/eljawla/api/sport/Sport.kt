package com.eljawla.api.sport

interface Sport<T> {

    fun getLiveEvents(): T

    fun getScheduledEvent(date: String): T



}