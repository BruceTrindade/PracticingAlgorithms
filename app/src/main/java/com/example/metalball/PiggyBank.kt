package com.example.metalball

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    var teste = 1
    var count = 1
    var dif = 0

    do {
        val n = reader.nextInt()

        if (n != 0) {
            println("Teste ${teste}")

            while (count <= n) {
                val j = reader.nextInt()
                val z = reader.nextInt()
                dif += (j - z)
                println("${dif}")
                count++
            }

            teste++
            count = 1
        }
        println("\n")
    } while (n != 0)

}