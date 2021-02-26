package chap02.section4

fun main() {

    val num = 4

    println(num.shl(1))
    println(num shl 1)

    println(num.shr(1)) // 0100 -> 0001
    println(num shr 1)
    println(num.ushr(1))
}