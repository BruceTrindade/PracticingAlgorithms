package com.example.algorithms

import java.util.Scanner

/*
Mirror
Through a plane mirror metaphorically and mathematically speaking, you can mirror numbers,
so mirroring a number on a number line will get its opposite number.
Gustavo wants to exemplify this technique using the set of integers. Help him in this task

Task
Write a program that, given an integer, displays its opposite in the set of integers.

Prohibited
It consists of an integer N, where N > 0. The program must run until it receives the number 0 as
input.

Exit
For each N your program should print the opposite of N in the integer set.
 */

fun main() {
    val reader = Scanner(System.`in`)
    do {
        val n = reader.nextInt()
        if(n > 0) println("${n * -1}")
        else if (n != 0) println("${n * -1}")
    } while (n != 0)
}
