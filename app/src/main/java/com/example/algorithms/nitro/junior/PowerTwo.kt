package com.example.algorithms

import java.util.Scanner
import kotlin.math.exp

fun main() {
    val reader = Scanner(System.`in`)
    val base = reader.nextInt()
    val expoente = reader.nextInt()
    var ex = expoente
    var r  = 1
    while (ex != 0) {
        r *= base
        ex--
    }
    println(r)
   // println(powerOf(n,e)) 32

}

fun powerOf(number: Int, exponent: Int): Int {
    var c = number
    var r = exponent
    while (r > 1) {
        r--
        c += c  * number
    }
    return c
}

