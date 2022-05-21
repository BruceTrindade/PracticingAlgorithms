package com.example.metalball

import java.util.Scanner

/*
Carlos traveled to another country and rented a car, on the day of the return he was notified that
there were 300 reais in fines for speeding. After long conversations he realized that the speedometer
was set to miles per hour, so while he thought it was 80km/h it was actually 80mph. Remember that
1 km/h corresponds to 0.62137 mph.

Task
Write a program that converts the value in miles/h to Km/h.

Prohibited
The input consists of a single N number.

Exit
Your program should print a single line, containing the value converted to Km/h (with two decimal
places).
 */

fun main() {
    val reader = Scanner(System.`in`)
    val n = reader.nextInt()
    val kmmph = 0.62137
    println("${String.format("%.2f", n/kmmph)}")
}