package com.example.metalball

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    var n = reader.nextInt()
    var r = 2

    while(n > 1) {
        n--
        r =+ r * 2
    }
    println(r)

}
