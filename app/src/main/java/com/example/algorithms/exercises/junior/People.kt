package com.example.algorithms.exercises.junior

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    val n = reader.nextInt()
    val mlInt = MutableList(n) { reader.nextLong() }
    val m = reader.nextInt()
    val mlMs = MutableList(m) { reader.nextLong() }

    for (i in mlMs.indices) {
        mlInt.remove(mlMs[i])
    }

    println(mlInt.toString().replace("[", "").replace("]", "").replace(",", ""))
}

/*
    for (i in arrInt.indices) {
        for (j in arrMs.indices) {
            if (arrInt[i] == arrMs[j]) {
                t.remove(arrInt[i])
            }
        }
    }
*/
