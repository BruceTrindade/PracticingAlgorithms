package com.example.metalball
import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)

    val p = reader.nextInt()
    val r = reader.nextInt()
    //essa questão não possui teste para restrição
    if ((p > 1 || p < 0 ) || (r > 1 || r < 0)){
        println("the number cannot be accepted")
    }

    when {
        p == 0 && r == 0 -> println ("C")
        p == 0 && r == 1 -> println ("C")
        p == 1 && r == 0 -> println ("B")
        p == 1 && r == 1 -> println ("A")

    }

}
