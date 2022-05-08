package com.example.metalball

/*
Pairs from 1 to 100
Write a program that displays the even numbers between 1 and 100, inclusive.

Prohibited
In this problem there is no input.

Exit
Print all even numbers between 1 and 100, including one on each line if applicable.
 */

import java.util.Scanner

fun main() {
    for (i in 1..100) {
        if (i % 2 == 0) println(i)
    }
}
