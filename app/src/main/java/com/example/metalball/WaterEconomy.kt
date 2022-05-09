package com.example.metalball

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)

    val n = reader.nextInt()

    when {
        n <= 10 -> println("7")
        n in 11..30 -> println (((n-11)+1)+7)
        n in 31..100 -> println ( (((n-31+1)*2)+7) + (30-11+1))
        n > 101 -> println ((((30-11+1))+7)+(((100-31+1)*2))+(((n-101)+1)*5))
    }


}
