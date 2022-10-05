package com.example.algorithms.nitro.junior

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    val a = reader.next().single()
    val l = reader.nextLine()
    val c = l.trim().split("\\s+")
    var plv = 0
    for (i in c.indices) {
        if (l[i].isWhitespace()) {
            var si = i - 1
            while (si > -1) {
                if (l[si] == a) {
                   plv += 1
                }
                if (l[si].isWhitespace()) {
                    si = 0
                }
                else si--
            }
        }
    }
    println(plv)
}
