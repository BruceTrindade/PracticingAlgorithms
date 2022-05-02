package com.example.metalball

import java.util.Scanner

/*
Brazilian championship
Two teams, Cormengo and Flaminthians, participate in a soccer championship, along with other teams.
Each win counts three points, each draw one point. A team that has more points is better ranked in
the championship. In the event of a tie in the number of points, the team with the highest goal
difference is ranked higher.

If the number of points and goal difference are the same for both teams then both teams are tied
for the championship. Given the numbers of wins and draws, and the goal difference of the two teams,
your task is to determine which of the two is better ranked, or if they are tied
for the championship.

Prohibited
The input is described in a single line, which contains six integers, separated by a blank space:
Cv, Ce, Cs, Fv, Fe and Fs, which are, respectively, the number of wins by Cormengo,
the number of draws by Cormengo, Cormengo's goal difference, Flaminthians' number of wins,
Flaminthians' number of draws, and Flaminthians' goal difference.

Exit
Your program must print a single line. If Cormengo is ranked better than Flaminthians,
the line must contain only the letter 'C', if Flaminthians is ranked better than Cormengo,
the line must contain only the letter 'F', and if the two teams are tied the line must only
contain the character '='.
 */
fun main() {
    val reader = Scanner(System.`in`)

    val cv = reader.nextInt()
    val ce = reader.nextInt()
    val cs = reader.nextInt()
    val fv = reader.nextInt()
    val fe = reader.nextInt()
    val fs = reader.nextInt()

    val cPointsNumber = (cv*3) + ce
    val fPointsNumber = (fv*3) + fe

    val r = when {
        cPointsNumber > fPointsNumber -> "C"
        fPointsNumber > cPointsNumber -> "F"
        cs < fs-> "F"
        cs > fs-> "C"
        cs == fs-> "="
        else -> "0"
    }

    println("$r")


}
