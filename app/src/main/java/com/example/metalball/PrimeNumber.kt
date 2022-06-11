package com.example.metalball

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)

    val n = reader.nextInt()
    if (number(n) == 2) println ("sim")
    else println("nao")
}

fun number(num: Int): Int {
    var c = 1
    var x = 1
    while (c < num) {
        c += 1
        if (num % c == 0) x += 1
    }
    return x
}
