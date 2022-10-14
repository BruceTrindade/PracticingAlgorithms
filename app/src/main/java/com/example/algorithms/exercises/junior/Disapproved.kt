package com.example.algorithms.exercises.junior

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    val n = reader.nextInt()
    var count = n
    var ar = ""

  //  if (na > na2) println(na)

    while (count != 0) {
        var npA = 10
        var naA = ""
        val na = reader.next()
        val np = reader.nextInt()
        if (np < npA) {
            if (np == npA) {
                if (na > naA) {
                    ar = na
                } else ar = naA
            } else {
                ar = na
            }
            npA = np
            naA = na
        }
        count--
    }
    println(ar)
}
