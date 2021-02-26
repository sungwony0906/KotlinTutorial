package chap03.section6

fun a() = f()
fun b() = println("b")
fun e() = println("g")

fun c(){
    fun e() = println("e")
    fun d() = e()
}

fun f() = println("f")

fun main(){
    a()
    e()
}