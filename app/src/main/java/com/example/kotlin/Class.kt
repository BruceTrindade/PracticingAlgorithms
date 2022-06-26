package com.example.kotlin


fun main() {

    val pessoa = Person("Bruce", true)

    println(
        "Nome: ${pessoa.name}, Estudante: ${if(pessoa.isStudent) "sim" else "não"}"
    )

}

class Person(
    val name: String,
    val isStudent: Boolean,
) {

}