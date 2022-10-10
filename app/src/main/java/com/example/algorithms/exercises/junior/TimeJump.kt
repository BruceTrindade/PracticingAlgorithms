package com.example.algorithms

import java.util.Scanner
import kotlin.math.round

fun main() {
    val reader = Scanner(System.`in`)
    val d = reader.nextDouble()
    val ds = reader.nextDouble()
    var r = d/ds
    val round = round(r)

    if(r > round) {
        println(round.toInt() + 1)
    } else println(round.toInt())
}