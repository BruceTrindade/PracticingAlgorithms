package com.example.kotlin


fun  main() {

    val col = Cores.BLUE

    val c = when(col) {
        Cores.BLUE -> "A bola é azul"
        Cores.GREEN -> "A bola é verde"
        Cores.RED -> "A bola é vermelha"
    }

    println(c)

}

enum class Cores {
    RED,
    GREEN,
    BLUE,

  //  fun test(){}
}