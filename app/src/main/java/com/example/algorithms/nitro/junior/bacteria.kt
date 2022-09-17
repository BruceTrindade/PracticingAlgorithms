package com.example.algorithms.nitro.junior

import java.util.Scanner
import kotlin.math.ln

fun main() {
    val reader = Scanner(System.`in`)
    val n = reader.nextInt()
    var count = n
    var comparatorBact = 1.0
    var betterBact = 1
    var position = 0
    while (count != 0) {
        val base = reader.nextInt().toDouble()
        val exponent = reader.nextInt()
        val resultado1 = exponent * ln(base)
        if (resultado1 > comparatorBact) {
            betterBact = position
        }
        if (comparatorBact < resultado1) comparatorBact = resultado1
        count--
        position++
    }
    println(betterBact)
}

/*
fun potencia(b: Int, e: Int): Double {
    var ex = e
    var r: Double = 1.0
    while (ex != 0) {
        r *= b
        ex--
    }
    return r
}
*/

/*
import java.util.Scanner

fun main() {
  val reader = Scanner(System.`in`)
  val n = reader.nextInt()
  // val arr = Array<Int>(n/2) { reader.nextInt() }
  var count = n
  var tt = 1
  var finalQ = 1
  var count2 = 0
  while (count != 0) {
    val base = reader.nextInt()
    val expoente = reader.nextInt()

    var ex = expoente
    var r  = 1

    while (ex != 0) {
        r *= base
        ex--
    }

    if(tt > r) {
      finalQ = count2
    }

    tt = r
    count--
    count2++

  }

  println(finalQ)

}

 */
