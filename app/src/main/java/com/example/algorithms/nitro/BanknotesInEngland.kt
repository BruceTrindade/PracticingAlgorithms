package com.example.algorithms
/*
banknotes in england
Rosy is a talented high school teacher who has won many awards for the quality of her class.
Her recognition was such that she was invited to teach at a school in England. Even speaking English
well, Rosy was a little apprehensive about the responsibility, but decided to accept the proposal
and face it as a good challenge.

Everything went well for Rosy until the day of the test. Used to giving marks from 0 (zero) to 100
(one hundred), she did the same in the first test of the students in England. However, students found
it strange, as in England the grading system is different: grades must be given as grades A to E.
Grade A is the highest while grade E is the lowest.

Talking to other teachers, she was suggested to use the following table, relating numerical grades
to concept grades:

The problem is that Rosy has already given the grades in the number system, and will have to convert
the grades to the letter system. However, Rosy needs to prepare the next classes (to maintain the
quality that made her famous), and doesn't have enough time to convert the grades manually.

Task
You must write a program that takes a grade in the number system and determines the corresponding
concept.

Prohibited
The input contains a single set of tests, which must be read from the standard input device
(usually the keyboard). The entry contains a single line with an integer N (0 ≤ N ≤ 100),
representing a test score in the number system.

Exit
Your program should print, on standard output, a letter (A, B, C, D, or E in capital letters)
representing the concept corresponding to the grade given in the input.
 */
import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)

    val N = reader.nextInt()

    when(N) {
        0 -> println("E")
        in 1..35 -> println("D")
        in 36..60 -> println("C")
        in 61..85 -> println("B")
        in 86..100 -> println("A")
    }

}
