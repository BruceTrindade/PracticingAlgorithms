package com.example.metalball

/*
Hobby with Cards
Beatriz likes to play cards with her friends. To train memory and logical thinking, she invented a
little hobby with cards. She takes the top five cards from the top of a well-shuffled deck, and
places them in sequence, from left to right, on the table, face down.

Then she looks, for a brief moment, at each of the cards in the sequence (and then puts them back on
the table, face down). Using only her memory, Beatriz must now tell if the sequence of cards is sorted
in ascending, descending, or unsorted order.

From so much playing, she's getting tired, and she doesn't trust her own judgment to know if she's
right or wrong. So she asked you to write a program that, given a sequence of five cards, determines
whether the given sequence is sorted ascending, descending, or not sorted.

entry
The entry consists of a single line containing the five cards of the sequence. Card values are represented
by integers between 1 and 13. The five cards have different values.

Exit
Your program should produce a single line, containing a single uppercase character: 'C' if the given
sequence is sorted in ascending order, 'D' if it is sorted in descending order, or 'N' otherwise.

restrictions
The value of each card is an integer between 1 and 13.
 */

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    var arrayint = Array<Int>(5) { reader.nextInt() }
    val al = arrayint.toList()
    val arrayC = arrayint.sorted()
    val arrayD = arrayint.sortedDescending()

    if(al == arrayC){
        println("C")
    } else if (al == arrayD){
        println("D")
    } else {
        println("N")
    }

}
