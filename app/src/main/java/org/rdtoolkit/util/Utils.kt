package org.rdtoolkit.util

import com.google.android.play.core.assetpacks.s
import java.text.SimpleDateFormat
import java.util.*

fun getFormattedTimeForSpan(span : Long) : String{
    val minutes: Int = (span / (60 * 1000)).toInt()
    val seconds: Int = (span / 1000 % 60).toInt()
    return String.format("%d:%02d", minutes, seconds)
}

fun getIsoUTCTimestamp(input : Date) : String? {
    val formatter = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZZZZZ")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    return formatter.format(input)
}

fun randompatientID():String{
    val charPool_prefix : List<Char> =('A'..'Z').toList()
    val charPool_number:List<Char> =('0'..'9').toList()
    var id_prefix=List(3){charPool_prefix.random()}.joinToString("")
    var id_number=List(3){charPool_number.random()}.joinToString("")
    return id_prefix+id_number
}


fun randomtestId():String{
    val charPool_prefix : List<Char> =('A'..'Z').toList()
    val charPool_number:List<Char> =('0'..'9').toList()
    var id_prefix=List(1){charPool_prefix.random()}.joinToString("")
    var id_number=List(4){charPool_number.random()}.joinToString("")
    return id_prefix+id_number
}




