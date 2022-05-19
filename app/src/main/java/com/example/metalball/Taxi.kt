package com.example.metalball

/*
Tabajara Taxi
Companhia de Táxi Tabajara (CTT) is one of the largest transport companies in the country. It has a
vast fleet of cars and operates in all major cities. Recently, CTT modernized its fleet, acquiring a
batch of 500 bi-fuel cars (cars that can use both alcohol and gasoline as fuel). In addition to
greater comfort for passengers and lower maintenance costs, new cars can bring additional cost
savings: as the price of gasoline is subject to very sudden variations and it can be an advantage,
at certain times, to use alcohol as fuel. . However, cars perform better using gasoline, that is, in
general, a car travels more kilometers per liter of gasoline than per liter of alcohol.

Task
You must write a program that, given the price of a liter of alcohol, the price of a liter of
gasoline and the kilometers per liter that a bi-fuel car makes with each of these fuels, determines
whether it is more economical to fill CTT's cars with alcohol or gasoline. If there is no difference
in cost between fueling with alcohol or gasoline, CTT prefers to use gasoline.

Prohibited
The input consists of a line containing four real numbers with precision to two decimal places A, G,
Ra and Rg , representing respectively the price per liter of alcohol, the price per liter of gasoline,
the efficiency (km/l) of the car using alcohol and the efficiency (km/l) of the car using gasoline.

Exit
The output must consist of a single line containing the character 'A' if it is more economical to
fill the fleet with alcohol or the character 'G' if it is more economical or indifferent to fill the
fleet with gasoline.
 */

import java.util.Scanner

fun main() {

    val reader = Scanner(System.`in`)
    val a = reader.nextDouble()
    val g = reader.nextDouble()
    val ra = reader.nextDouble()
    val rg = reader.nextDouble()

    val alcohol = a / ra
    val gasoline = g / rg

    when {
        alcohol == gasoline -> println("G")
        alcohol > gasoline -> println("G")
        alcohol < gasoline -> println("A")
    }

}
