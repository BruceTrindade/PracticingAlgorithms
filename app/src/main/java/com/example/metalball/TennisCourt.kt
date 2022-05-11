package com.example.metalball

import java.util.Scanner

/*
A tennis court is shaped like a rectangle whose sides measure 36 feet by 78 feet, which corresponds
to a rectangle measuring 432 inches by 936 inches. In the last Australian Grand Slam, Rafael Nadal
lost to Novak Djokovic, one of the most beautiful tennis games of recent times.

Often, a play is so fast, and the ball is so close to the edge of the court, that the referee can
make a decision that can be contested by one of the players. For this, there is the “teima-teima”,
which uses the recorded image of the game to decide if the ball was inside or outside the half of
the court corresponding to one of the players.

Consider that Rafael Nadal's semi-block corresponds to a rectangle in which two vertices have
coordinates (0,0) and (432, 468), where all numbers are in inches. You must write a program to,
given the (X, Y) coordinates of the ball's point of contact with the ground, determine whether a
ball hit the ground inside or outside the semi-court. Note that if the ball hits the dividing line
it is considered an inside ball.

Prohibited
The input is given on a single line, which contains two integers X and Y, which correspond to the
coordinates of the point (X, Y) of the ball's contact with the ground, in inches.

Exit
Your program should print a single line, containing the word in if the ball hits inside the
semi-court, and the word out otherwise.
 */

fun main() {
    val reader = Scanner(System.`in`)

    val x = reader.nextInt()
    val y = reader.nextInt()

    when {
        x < 0 || y < 0 -> println("fora")
        x <= 432 && y <= 468 -> println("dentro")
        else -> println("fora")
    }

}
