package com.example.algorithms.nitro.junior
import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    val n = reader.nextInt()
    var count = n
    var tt = 1.0
    var finalQ = 1
    var count2 = 0
    while (count != 0) {
        val base = reader.nextInt()
        val expoente = reader.nextInt()
        val resultado = potencia(base, expoente)
        if(resultado > tt) {
            finalQ = count2
        }
        println(count2)
        println(resultado)
        tt = resultado
        count--
        count2++

    }

    println(finalQ)

}

fun potencia(b: Int, e: Int): Double {
    var ex = e
    var r: Double = 1.0
    while (ex != 0) {
        r *= b
        ex--
    }
    return r
}

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