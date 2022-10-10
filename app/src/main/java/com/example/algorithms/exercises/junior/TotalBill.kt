package com.example.algorithms.exercises.junior

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    val n = reader.nextInt()
    val arrayint = Array<Int>(n) { reader.nextInt() }
    val t = reader.nextInt()
    val sum = arrayint.sum()

    if (t == sum) println("Acertou")
    else println("Errou")
}
