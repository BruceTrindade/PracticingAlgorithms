package com.example.metalball

import java.util.Scanner


fun main() {
    val reader = Scanner(System.`in`)
    var c = 1
    do {

        val v = reader.nextInt()
        if (v > 0) {
            println("Teste $c")
            verify(v)
            c += 1
        }
    } while (v != 0)

}

fun verify(d: Int) {
    var i = 0
    var j = 0
    var k = 0
    var l = 0
    var cc = d
    while (cc > 0) {
        when {
            cc >= 50 -> {
                cc -= 50
                i += 1
            }
            cc >= 10 -> {
                j += 1
                cc -= 10
            }
            cc >= 5 -> {
                k += 1
                cc -= 5
            }
            cc >= 1 -> {
                l += 1
                cc -= 1
            }
        }
    }
    return println("$i $j $k $l\n")
}
