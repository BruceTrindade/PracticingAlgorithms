package com.example.metalball
import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)

    val a = reader.nextInt()
    val b = reader.nextInt()
    val c = reader.nextInt()
    val x = reader.nextInt()
    val y = reader.nextInt()
    val z = reader.nextInt()
    val ba = 10
    var ex = 6

    val r = (x/a) * (y/b) * (z/c)

    var e = 1
    while (ex > 0) {
        e *= ba
        --ex
    }

    if (r<=e) {
        println("$r")
    } else {
        println("$e")
    }

}
