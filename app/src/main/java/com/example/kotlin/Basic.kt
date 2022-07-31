package com.example.kotlin

import java.util.Scanner

fun main() {

    val reader = Scanner(System.`in`)
    val x = reader.nextInt()
    //essa variavel vai armazenar um valor inteiro que o usuario digitar na ide
    val y = reader.nextInt()

    println("somando os numeros que vc digitou:${x+y}")

}
