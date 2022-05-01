package com.example.metalball
import java.util.Scanner

/*
International Transport
Betalândia is a country that only recently opened up to foreign trade and is now preparing its first
major export. The Betalandic Trading Society (SBC) was in charge of conducting the export and
determined that, following international standards, the cargo will be transported in containers,
which are, in turn, placed on large ships for international transport.

All betaland containers are identical, measuring A meters wide, B meters long and C meters high.
A container ship can be seen as a horizontal rectangle X meters wide and Y meters long, on which
containers are placed. No part of a container may be left outside the ship. In addition, in order
to make it possible to cross bridges, the maximum height of the cargo on the ship cannot exceed
Z meters.

Due to limitations of the crane used, containers can only be loaded in line with the ship. That is,
 containers can only be placed on the ship in such a way that the width and length of the container
  are parallel to the width and length of the ship, respectively.

SBC is having trouble figuring out the maximum amount of containers that can be placed on the ship
 and asks for your help. Your task in this problem is to determine how many containers can be loaded
  on the ship respecting the above restrictions.

Prohibited
The input consists of two lines. The first line contains three integers A, B and C that represent
the dimensions of the containers, while the second line contains three other integers X, Y and Z
that represent the dimensions of the ship.

Exit
Your program should print just one line containing an integer that indicates the maximum number
of containers the ship can carry.
 */
fun main() {
    val reader = Scanner(System.`in`)

    val a = reader.nextInt()
    val b = reader.nextInt()
    val c = reader.nextInt()
    val x = reader.nextInt()
    val y = reader.nextInt()
    val z = reader.nextInt()
    val ba = 10
    var ex = 6

    val r = (x/a) * (y/b) * (z/c)

    var e = 1
    while (ex > 0) {
        e *= ba
        --ex
    }

    if (r<=e) {
        println("$r")
    } else {
        println("$e")
    }

}
