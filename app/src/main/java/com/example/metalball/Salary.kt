package com.example.metalball

import java.util.Scanner

/*
Hobby with Cards
Beatriz likes to play cards with her friends. To train memory and logical thinking, she invented a
little hobby with cards. She takes the top five cards from the top of a well-shuffled deck, and
places them in sequence, from left to right, on the table, face down.

Then she looks, for a brief moment, at each of the cards in the sequence (and then puts them back on
the table, face down). Using only her memory, Beatriz must now tell if the sequence of cards is sorted
in ascending, descending, or unsorted order.

From so much playing, she's getting tired, and she doesn't trust her own judgment to know if she's
right or wrong. So she asked you to write a program that, given a sequence of five cards, determines
whether the given sequence is sorted ascending, descending, or not sorted.

entry
The entry consists of a single line containing the five cards of the sequence. Card values are represented
by integers between 1 and 13. The five cards have different values.

Exit
Your program should produce a single line, containing a single uppercase character: 'C' if the given
sequence is sorted in ascending order, 'D' if it is sorted in descending order, or 'N' otherwise.

restrictions
The value of each card is an integer between 1 and 13.
 */

fun main() {
    val reader = Scanner(System.`in`)
    val salario = reader.nextFloat()

    calcularSalario(salario)

}

private fun calcularSalario(salar: Float) {
    val porcentagem = porcentagemSalarial(salar)
    val reajuste = salar * porcentagem
    val resultado = salar + reajuste
    return  println("Novo salario: ${String.format("%.2f",resultado)}\nReajuste ganho: ${String.format("%.2f",reajuste)}\nEm percentual: ${String.format("%.0f",porcentagem * 100)} %")
}

private fun porcentagemSalarial(sala: Float): Float {
    var porcentagem = 0f
    when (sala) {
        in 0f..400.00f -> porcentagem = 0.15f
        in 400.01f..800.00f -> porcentagem = 0.12f
        in 800.01f..1200.00f -> porcentagem = 0.1f
        in 1200.01f..2000.00f -> porcentagem = 0.07f
        in 2000.01f..Float.MAX_VALUE -> porcentagem = 0.04f
    }
    return porcentagem
}