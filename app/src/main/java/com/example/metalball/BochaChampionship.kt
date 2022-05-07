package com.example.metalball

import java.util.*

fun main() {
    val reader = Scanner(System.`in`)
    var arrayint = Array<Int>(3) { reader.nextInt() }
    val ints = arrayint.toList()
    val order = ints.sorted()
    println(order[1])

}