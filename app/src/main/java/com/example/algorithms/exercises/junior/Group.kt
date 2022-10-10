package com.example.algorithms

import java.util.Scanner

/*
separating into groups
Camila is a teacher and coordinator at the programmers school in São Miguel. She decided to separate
the students according to the size of the name.
Students with names of up to 4 letters are in group A, group B is composed of names that have 5 to
10 letters and group C is composed of names that have more than 10 letters.

Input
The single line of entry contains the student's name.

Exit
Your program should output a word indicating which group the student belongs to.
 */

fun main() {
    val reader = Scanner(System.`in`)
    val name =reader.nextLine()

    when {
        name.length in 1..4 -> println("GROUP A")
        name.length in 5..10 -> println("GROUP B")
        name.length > 9 -> println("GROUP C")
    }

}
