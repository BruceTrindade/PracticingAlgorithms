package com.example.algorithms.nitro.junior

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    val n = reader.nextInt()
    val arr = Array<Int>(n) { reader.nextInt() }
    val equalT = arr.sum()/2
    var result = 0

    for (i in arr.indices) {
        result += arr[i]
        if (result == equalT) println(i+1)


    }

}
