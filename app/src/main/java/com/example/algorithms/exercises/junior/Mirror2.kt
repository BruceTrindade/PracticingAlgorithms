package com.example.algorithms.exercises.junior

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)

    do {
        val n = reader.nextInt()
        if (n < 0) {
            println("${n * -1}")
        } else if (n > 0) {
            println("${n * -1}")
        }
    } while (n != 0)
}
