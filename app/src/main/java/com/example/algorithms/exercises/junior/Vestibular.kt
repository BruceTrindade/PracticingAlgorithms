import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    val n = reader.nextInt()
    val nota = reader.next()
    val gab = reader.next()
    var count = n
    var count2 = 0
    var resultado = 0

    while (count > 0) {
        if (nota[count2] == gab[count2]) {
            resultado++
        }
        count--
        count2++
    }
    println(resultado)
}

/*
        for (j in gab.indices) {
            if (nota[i] == gab[j]) {

            }
        }
 */