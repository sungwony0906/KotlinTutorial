package chap03.section4

fun main() {
    shortFunc(3){
        println("First call : $it")
        return
    }
}

inline fun shortFunc(a : Int, out : (Int) -> Unit) {
    println("Before calling out()")
    out(a)
    println("After calling out()")
}