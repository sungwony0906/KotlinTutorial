package chap05.section3.person

class Person(firstName : String
             , out : Unit = println("[Primary Constructor] parameter")) {
    val fName = println("[Property] Person fName : $firstName")

    init {
        println("[init] Person init block")
    }

    constructor(firstName: String, age: Int,
                out: Unit = println("[Secondary Constructor] parameter")) : this(firstName) {
        println("[Secondary Constructor] Body : $firstName, $age")
    }
}

fun main() {
    val p1 = Person("kildong", 30)
    println()
    p1.fName
    println()
    val p2 = Person("Dooly")
}