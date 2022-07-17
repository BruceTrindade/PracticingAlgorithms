package com.example.kotlin
/*
fun main() {
    val x: String? = "2"

    if (x is String) {
        print(x.length) // x is automatically cast to String
    }

    val a: Int? = 2

    if (a is Int) {
        // 'a' is smart cast to Int
        val b = a * 2 // b is also Int
    }
}*/

fun main() {

    // Smart Casting
    val studentWithRealObject: Any? = Student()

    if (studentWithRealObject is Student){
        println("Student name: ${studentWithRealObject.name}")
        println("Student age: ${studentWithRealObject.age}")
    }

}

data class Student(
    val name: String = "Bruce Trindade",
    val age: Int = 27
) {
}