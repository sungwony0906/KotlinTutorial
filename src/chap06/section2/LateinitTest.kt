package chap06.section2

class Person{
    lateinit var name: String
    fun test() {
        if (!::name.isInitialized) {
            println("not Initialized")
        } else {
            println("Initialized")
        }
    }
}

fun main() {
    val person = Person()
    person.test()
    person.name = "Kildong"
    person.test()
    println(person.name)
}