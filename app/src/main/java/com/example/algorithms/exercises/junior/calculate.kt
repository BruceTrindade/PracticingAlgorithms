import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    val c = reader.next()
    val a = reader.nextDouble()
    val b = reader.nextDouble()

    operation(c,a,b)

}

fun operation(cc: String, aa: Double, bb: Double) {
    var result = 0.0
    when (cc) {
        "+" -> result = aa + bb
        "-" -> result = aa - bb
        "/" -> result = aa / bb
        "*" -> result = aa * bb
    }
    if (cc == "/")  return println("${String.format("%.1f",result)}")
    else return  println("${String.format("%.0f",result)}")
}