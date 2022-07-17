package com.example.kotlin

import kotlinx.coroutines.*

fun main() = runBlocking { // this: CoroutineScope
    launch { // launch a new coroutine and continue
       //novo quadrado
       // delay(2000L) // non-blocking delay for 1 second (default time unit is ms)
        println("World!") // print after delay
    }
   //quadrado principal
    println("Hello") // main coroutine continues while a previous one is delayed
}