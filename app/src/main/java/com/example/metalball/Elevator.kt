package com.example.metalball

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    var count = 1
    var p = 0
    val n = reader.nextInt() //contador
    val c = reader.nextInt() // max

    while (count <= n) {
        val s = reader.nextInt()
        val e = reader.nextInt()
        p = (p-s) + e
        if (p > c) {
            println("S")
            count = n + 1
        }
        if (count == n) {
            println("N")
        }
        count += 1
    }
}
