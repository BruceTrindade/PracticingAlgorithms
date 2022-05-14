package com.example.metalball

import java.util.Scanner

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