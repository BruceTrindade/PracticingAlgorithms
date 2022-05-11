package com.example.metalball

import java.util.Scanner

/*
Above average
Professor Micael wants to reward the best students in his programming logic course. Since his class
is full of very smart people, he knows that most students will have an above average grade.

Task
Write a program to help the teacher know how many students score above the class average.

Prohibited
The input consists of two lines. The first line contains an integer N , the number of students in
the class. The second line contains N integers, which is the list of students' grades.

Exit
Your program should print just one line containing just one number indicating the number of students
with an above average grade.
 */

fun main() {
    val reader = Scanner(System.`in`)

    var n = reader.nextInt()
    var arrayint = Array<Int>(n) { reader.nextInt() }
    var s = 0

    for (num in arrayint) {
        s += num
    }

    val m = s/n
    var c = 0

    for (num in arrayint) {
        if (num > m) c ++

    }

    println(c)

}
