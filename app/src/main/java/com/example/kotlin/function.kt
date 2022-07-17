package com.example.kotlin

import java.util.*


fun main() {
    test()

  //  address("rua", 12, 41340, null, "abc")
 //   address(road = "rua", cep = 41340, number = 12, complement =  "abc")
}

fun test(
    word: String = "oi",
    wordOne: String = "a",
) {
    println(word + wordOne)
}

fun testOne(
    word: String = "oi",
    wordOne: String = "a",
) {
    println(word + wordOne)
}

fun testTwo(
    word: Int = 2,
    wordOne: Int = 3,
): Int {
    //vc eé obrigado a colocar um return quando vc precisa que algo seja retornado, exemplo de quando não precisa seria o exemplo de android no slid
    return word + wordOne
}

fun address(road: String,
            number: Int,
            cep: Int,
            referencePoint: String? = null,
            complement: String,
) {
    //e se quisermos passar referencePoint como sem ponto de referencia? e alguem passar null? podemos usar o elvis
    // referencePoint ?: "Sem"
    println("Endereço do pedido: rua $road, número $number, cep $cep  "+ if(referencePoint != null) "$referencePoint" else "sem ponto de referencia" )
    complement
}