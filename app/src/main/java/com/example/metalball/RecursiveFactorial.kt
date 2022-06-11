package com.example.metalball

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    val n = reader.nextLong()
    if (n<0 || n>12) println("Number must be between 0 and 12")
    else println("${fat(n)}")
}

fun fat(f: Long): Long = when(f) {
    in 0..1 -> 1L
    in 2..f -> f*fat(f - 1)
    else -> throw IllegalArgumentException("Negative number")
}
