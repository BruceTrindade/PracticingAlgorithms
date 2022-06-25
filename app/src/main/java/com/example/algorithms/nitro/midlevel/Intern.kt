package com.example.algorithms.nitro.midlevel

import java.util.*
/*
3
1 85
2 91
3 73
0
saida 2

5
12300 81
12601 99
15023 76
10111 99
212 99
0

//
//            for ((index, value) in list.withIndex()) {
//                if (index < list[n-1]!!) {
//                    if (value == (list[index + 1])) println(value)
//                } else {
//                    if (value == (list[index])) println(value)
//                }
//            }
//
//        }
 */
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
        var code = Array<Int?>(n) { null }
        var note = Array<Int?>(n) { null }
        var c = Array<Int?>(n) { null }

        while (x < n) {
            code[x] = reader.nextInt()
            note[x] = reader.nextInt()
            x++
        }

        while (count < n) {
            primeiroNumero = code[count]!!
            segundoNumero = note[count]!!
            if((count + 1) != n) terceiroNumero = note[count+1]!!
            if (segundoNumero >= terceiroNumero) {
                c[count] = primeiroNumero
                conta = segundoNumero
            }
            count++
        }
        count = 0
        println("\nTurma ${turma++}")
        println(c.filterNotNull().toString().replace("[", "").replace("]", "").replace(",","") + "\n")


    } while (n != 0)
}

/*
638
package com.example.algorithms.nitro.midlevel

import java.util.*
/*
3
1 85
2 91
3 73
0
saida 2

5
12300 81
12601 99
15023 76
10111 99
212 99
0

//
//            for ((index, value) in list.withIndex()) {
//                if (index < list[n-1]!!) {
//                    if (value == (list[index + 1])) println(value)
//                } else {
//                    if (value == (list[index])) println(value)
//                }
//            }
//
//        }
 */
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
        var code = Array<Int?>(n) { null }
        var note = Array<Int?>(n) { null }
        var c = Array<Int?>(n) { null }

        while (x < n) {
            code[x] = reader.nextInt()
            note[x] = reader.nextInt()
            x++
        }

        for ((index, value) in code.withIndex()) {
            primeiroNumero = value!!
            for ((index, value) in note.withIndex()) {
                segundoNumero = value!!
            }
            if((index + 1) != n) terceiroNumero = note[index+1]!!
            if (segundoNumero >= terceiroNumero) {
                c[index] = primeiroNumero
                conta = segundoNumero
            }
        }

        println("\nTurma ${turma+1}")
        println(c.filterNotNull().toString().replace("[", "").replace("]", "").replace(",","") + "\n")


    } while (n != 0)
}

/*
638
 */
 */