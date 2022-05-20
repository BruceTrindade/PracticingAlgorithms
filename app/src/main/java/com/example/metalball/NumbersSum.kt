package com.example.metalball

import java.util.Scanner

/*
Adding
Given a list of N integers, find the sum of all of them.

Prohibited
The input is composed of a single test case. The first line contains a positive integer N.
The next N lines each contain an integer X, representing the N numbers to be added.

Exit
Your program should produce a single line of output, containing the sum of all N integers.
 */

fun main() {
    val reader = Scanner(System.`in`)
    val n = reader.nextInt()
    var arrayint = Array<Int>(n) { reader.nextInt() }

    val sum = arrayint.sum()
    println(sum)


}