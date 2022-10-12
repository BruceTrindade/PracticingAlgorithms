package com.example.algorithms.exercises.junior

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    val mlStr = reader.next()
    var str = ""

    for (i in mlStr.indices) {
        if (mlStr[i] == '-') {
            str += "-"
        } else {
            str += returnNumber(mlStr[i])
        }
    }

    println(str)
}

private fun returnNumber(letter: Char): Char {
    var number: Char
    when {
        letter == 'A' || letter == 'B' || letter == 'C' -> number = '2'
        letter == 'D' || letter == 'E' || letter == 'F' -> number = '3'
        letter == 'G' || letter == 'H' || letter == 'I' -> number = '4'
        letter == 'J' || letter == 'K' || letter == 'L' -> number = '5'
        letter == 'M' || letter == 'N' || letter == 'O' -> number = '6'
        letter == 'P' || letter == 'Q' || letter == 'R' || letter == 'S' -> number = '7'
        letter == 'T' || letter == 'U' || letter == 'V' -> number = '8'
        letter == 'W' || letter == 'X' || letter == 'Y' || letter == 'Z' -> number = '9'
        else -> number = letter
    }
    return number
}
