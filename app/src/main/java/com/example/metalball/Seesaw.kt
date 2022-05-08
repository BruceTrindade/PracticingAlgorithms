package com.example.metalball

/*
playground seesaw
Johnny has just changed schools and the first thing he noticed about the new school is that the
playground seesaw is not symmetrical, one end is longer than the other. After playing a few times
with a friend of the same weight, he realized that when he is at one end, the seesaw is off-balance
to his side (i.e. he is on the bottom and the friend on the top), but when they switch sides, the
seesaw shifts to the friend's side. Not understanding the situation, Joãozinho asked another friend
from another grade for help, who explained that the length of the side interferes with the balance
of the seesaw, as the seesaw will be balanced when:

P1 ∗ C1 = P2 ∗ C2

where P1 and P2 are the weights of the child on the left and right sides, respectively, and C1 and
C2 are the lengths of the seesaw on the left and right sides, respectively.

With the equation, Joãozinho can already tell if the seesaw is balanced or not, but, in addition,
he wants to know which way the seesaw will descend if it is unbalanced.


Prohibited
The first and only line of the input contains 4 integers, P1, C1, P2 and C2, in that order. If the
seesaw is balanced, print '0'. If it is unbalanced so that the left child is on the bottom, print
'-1', otherwise print '1'.
 */

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)

    val p1 = reader.nextInt()
    val c1 = reader.nextInt()
    val p2 = reader.nextInt()
    val c2 = reader.nextInt()

    val r1 = p1*c1
    val r2 = p2*c2

    when {
        r1 == r2 -> println("0")
        r1 > r2 -> println("-1")
        r2 > r1 -> println("1")
    }
}
