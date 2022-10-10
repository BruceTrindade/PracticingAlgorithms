package com.example.algorithms.exercises.midlevel

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    var n = reader.nextInt()
    var s = 0

    while (n > 1) {
        n--
        val l = reader.nextInt()
        val c = reader.nextInt()
        if(l > c) s += c
    }

    println(s)

}
