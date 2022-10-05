package com.example.algorithms.nitro.junior

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    val n = reader.nextInt()
    val arrInt = Array<Int>(n) { reader.nextInt() }
    val m = reader.nextInt()
    val arrMs = Array<Int>(m) { reader.nextInt() }
    val t = arrInt.toMutableList()

    for (i in arrInt.indices) {
        for (j in arrMs.indices) {
            if (arrInt[i] == arrMs[j]) {
                t.remove(arrInt[i])
            }
        }
    }

    for (i in t.indices) {
        print("${t[i]} ")
    }
}
