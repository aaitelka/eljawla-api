package com.eljawla.api.utils

import ch.qos.logback.core.util.TimeUtil
import java.text.SimpleDateFormat
import java.util.*
import java.util.concurrent.TimeUnit


fun Int.toSimpleDate(): String {
    val date = Date(this.toLong() * 1000L)
    val dateFormat = SimpleDateFormat("dd-MM-yyyy")
    return dateFormat.format(date)
}