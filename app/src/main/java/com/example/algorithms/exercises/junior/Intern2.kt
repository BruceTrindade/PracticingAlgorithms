package com.example.algorithms.exercises.junior

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    var count = 0
    var turma = 0
    var primeiroNumero = 0
    var segundoNumero = 0
    var terceiroNumero = 0
    var conta = 0
    var n = 0
    var x = 0

    do {
        n = reader.nextInt()
        var code = Array<Int>(n) { 0 }
        var note = Array<Int>(n) { 0 }
        var c = Array<Int>(n) { 0 }

        while (x < n) {
            code[x] = reader.nextInt()
            note[x] = reader.nextInt()
            x++
        }

        for ((index, value) in code.withIndex()) {
            primeiroNumero = value
            for ((index, value) in note.withIndex()) {
                segundoNumero = value
            }
            if ((index + 1) != n) terceiroNumero = note[index + 1]
            if (segundoNumero >= terceiroNumero) {
                c[index] = primeiroNumero
                conta = segundoNumero
            }
        }

        println("\nTurma ${turma + 1}")
        println(c.toString().replace("[", "").replace("]", "").replace(",", "") + "\n")
    } while (n != 0)
}
