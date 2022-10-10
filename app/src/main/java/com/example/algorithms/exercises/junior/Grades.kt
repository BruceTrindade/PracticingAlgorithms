package com.example.algorithms.exercises.junior

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    val n = reader.nextInt()
    var count = n
    val arr = Array<Int>(101) { 0 }
    var resultado = 0

    while (count != 0) {
        val notas = reader.nextInt()
        arr[notas] += 1
        count--
    }

    for (i in arr.indices) {
        if (arr[i] >= arr[resultado]) {
            if (resultado < i) resultado = i
        }
    }
    println(resultado)
}
