package chap03.section4

fun main() {
    shorFunc(2, { println("hi")})
    shorFunc(3, { println("hi hi")})
}

inline fun shorFunc(a : Int, noinline out : (Int) -> Unit){
    println("Before Calling out()")
    out(a)
    println("After Calling out()")
}