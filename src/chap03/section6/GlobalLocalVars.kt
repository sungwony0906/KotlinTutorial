package chap03.section6

var global = 10

fun main() {

    val local1 = 20
    val local2 = 21

    fun nestedFunc() {
        global += 1
        val local1 = 30
        println("nestedfunc local1 : $local1")
        println("nestedfunc local2 : $local2")
        println("nestedFunc global : $global")
    }

    nestedFunc()
    outsideFunc()
    println("main global : $global")
    println("main local1 : $local1")
    println("main local2 : $local2")
}

fun outsideFunc() {
    global += 1
    val outVal = "outside"
    println("outsideFunc global : $global")
    println("outsideFunc outVal : $outVal")
}