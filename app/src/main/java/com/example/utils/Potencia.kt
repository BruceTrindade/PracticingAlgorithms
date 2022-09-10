package com.example.algorithms

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    val base = reader.nextInt()
    val expoente = reader.nextInt()
    val resultado = potencia(base, expoente)

    print(resultado)

}

fun potencia(b: Int, e: Int): Double {
    var ex = e
    var r: Double = 1.0
    while (ex != 0) {
        r *= b
        ex--
    }
    return r
}