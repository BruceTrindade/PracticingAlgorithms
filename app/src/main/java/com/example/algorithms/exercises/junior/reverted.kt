package com.example.algorithms

import java.util.*

fun main() {
    val reader = Scanner(System.`in`)
    val n = reader.nextInt()
    var arrayint = Array<Int>(n) { reader.nextInt() }

    println(arrayint.reversed().toString().replace("[", "").replace("]", "").replace(",",""))

}