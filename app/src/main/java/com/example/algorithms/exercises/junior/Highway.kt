package com.example.algorithms.exercises.junior

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    val c = reader.nextInt()
    val b = reader.next()
    var up = 0

    for (i in b.indices) {
        when (b[i]) {
            'P' -> up += 2
            'C' -> up += 2
            'A' -> up += 1
            'D' -> up += 0
        }
    }

    println(up)
}
