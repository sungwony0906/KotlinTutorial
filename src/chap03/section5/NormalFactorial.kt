package chap03.section5

fun main() {
    val number = 4
    val result : Long

    result = factorial(number)
    println("Factorial : $number -> $result")
}

tailrec fun factorial(n : Int, run : Int = 1) : Long {
    return if(n==1) run.toLong() else factorial(n-1, run*n)
}