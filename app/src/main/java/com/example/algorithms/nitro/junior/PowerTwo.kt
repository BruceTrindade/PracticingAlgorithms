package com.example.algorithms

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    val n = reader.nextInt()

    println(powerOf(n,2))

}

fun powerOf(number: Int, exponent: Int): Int {
    var c = number
    var r = exponent
    while (c > 1) {
        c--
        r =+r  * exponent
    }
    return r
}

