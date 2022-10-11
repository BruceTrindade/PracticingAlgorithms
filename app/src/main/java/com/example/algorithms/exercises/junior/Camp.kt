package com.example.algorithms.exercises.junior

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    val n = reader.nextInt()
    val arrInt = Array<Int>(n) { reader.nextInt() }
    val mlS = MutableList(n) { 0 }

    for (i in arrInt.indices) {
        when (i) {
            0 -> mlS.add(i, arrInt[i] + arrInt[i + 1])
            n - 1 -> mlS.add(i, arrInt[i] + arrInt[i - 1])
            else -> mlS.add(i, arrInt[i] + (arrInt[i + 1] + arrInt[i - 1]))
        }
        println(mlS[i])
    }
}
