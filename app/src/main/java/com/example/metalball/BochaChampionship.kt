package com.example.metalball

import java.util.*

/*
World Bocce Competition
The OBI (International Bocce Organization) is responsible for organizing the world bocce competition.
Unfortunately this sport is not very popular, and in an attempt to increase its popularity, it was
decided that the champion and runner-up of each national headquarters would be called for the World
Grand Final, instead of just the first place.

Tumbolia is a small country that had already held its national competition when the new rule was
instituted, and the local committee did not keep track of who was runner-up. Fortunately, they stored
the scores of all competitors - which were only three, due to the small size of the country.
It is also known that the scores of all players were different, so that there was no tie between any
of them.

It remains now to find out who was the runner-up and for that the committee needs help.

Prohibited
The first and only line of the entry consists of three integers separated by spaces, A, B and C,
the scores of the 3 competitors.

Exit
Print a single line in the output, containing only an integer, the runner-up's score.
 */

fun main() {
    val reader = Scanner(System.`in`)
    var arrayint = Array<Int>(3) { reader.nextInt() }
    val ints = arrayint.toList()
    val order = ints.sorted()
    println(order[1])

}