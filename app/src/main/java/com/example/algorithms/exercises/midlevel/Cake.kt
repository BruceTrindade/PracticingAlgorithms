package com.example.algorithms.exercises.midlevel

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    val a = reader.nextInt()
    val b = reader.nextInt()
    val c = reader.nextInt()

    if (a < 2 || b < 3 || c < 5) println("0")
    else {
        val aa = a / 2
        val bb = b / 3
        val cc = c / 5
        when {
            aa <= bb && aa <= cc -> println(aa)
            bb <= aa && bb <= cc -> println(bb)
            else -> println(cc)
        }
    }
}
