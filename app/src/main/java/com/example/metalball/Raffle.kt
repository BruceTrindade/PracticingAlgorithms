package com.example.metalball

/*
The final year students decided to organize a fair to raise funds for the graduation party.
The party promised to be a success, as the father of one of the graduates, Teófilo, owner of a
computer store, decided to donate a computer to be drawn by lot among those who attended.

The students prepared tents for quentaos, popcorn, sweets, rehearsed the gang and put on sale
tickets numbered sequentially from 1. The ticket number would be used for the computer drawing.

It was agreed that Theophilus would decide the method of drawing lots; in principle the draw would,
of course, be computerized.

The place chosen for the party was the school gym. The entrance of the participants was through the
main door, which has a roulette wheel, where one person passes at a time. At the entrance, an
employee entered, in a list on the school's computer, the ticket number, in the order in which the
participants arrived.

After all the participants had entered, Teófilo started working on the computer to prepare the draw.
Checking the gift list, he noticed a notable feature: there was only one case, in the entire list,
in which the participant who had the ticket numbered with i, had been the i-th person to enter the
gym.

Teófilo was so delighted with the coincidence that he decided that the drawing would not be
necessary: this person would be the winner of the computer.

Task
Knowing the list of participants, in order of arrival, your task is to determine the number of the
winning ticket, knowing that the winner is the only participant who has the ticket number equal to
their entry position in the party.

Prohibited
The input is made up of several test sets. The first line of a test set contains a positive integer
N that indicates the number of party attendees.

The next line contains the sequence, in order of entry, of the N tickets of the people who attended
the party. The end of the entry is indicated when N = 0. For each test set in the entry there will
be a single winner.

Exit
For each test set of input your program should produce three lines. The first line identifies the
test set, in the format "Test n", where n is numbered starting from 1. The second line should
contain the winner's ticket number as determined by your program. The third line must be left blank.
The spelling shown in the Example Output below must be strictly followed.
 */
import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    var count = 1
    do {
        val n = reader.nextInt()
        var arrayint = Array<Int>(n) { reader.nextInt() }
        for ((index, value) in arrayint.withIndex()) {
            if ((index + 1) == value ) println("Test $count \n" + value + "\n")
        }
        count += 1
    } while (n != 0)

}
