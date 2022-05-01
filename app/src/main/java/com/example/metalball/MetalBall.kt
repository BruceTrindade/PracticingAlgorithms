package com.example.metalball
import java.util.Scanner
/*
Metal ball
Fliper is a type of game where a metal ball falls through a maze of paths until it reaches the
bottom of the maze. The amount of points the player earns depends on the path the ball follows.
The player can control the ball's path by changing the position of some of the maze doors.

Each door can be in position 0, which means facing left, or in position 1, which means facing right.
Consider the flipper in the figure below, which has two doors. Door P is at position 1 and door R is
at position 0. This way, the ball will fall through path B.

You must write a program that, given the positions of the P and R ports, in this figure, tells you
which of the three paths, A, B or C, the ball will fall!

Prohibited
The input consists of only one line containing two numbers P and R, indicating the positions of
the two doors of the figure's flipper.

Exit
The output of your program must also be just one line, containing an uppercase letter that
indicates the path through which the ball will fall: 'A', 'B' or 'C'.

Restrictions
The P number can be 0 or 1. The R number can be 0 or 1.
 */
fun main() {
    val reader = Scanner(System.`in`)

    val p = reader.nextInt()
    val r = reader.nextInt()

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
