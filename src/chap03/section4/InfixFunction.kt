package chap03.section4

fun main() {
    val multi = 3
    val test = multi multiply 5;
    println(test)
}

infix fun Int.multiply(a : Int) : Int {
    return this * a
}