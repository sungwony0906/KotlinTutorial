package chap06.section3

class Person {
    var id : Int = 0
    var name : String = "Youngdeok"
    companion object {
        var language : String = "Korean"
        fun work(){
            println("working...")
        }
    }
}

fun main() {
    var person = Person()
    println(Person.language)
    Person.language = "English"
    println(Person.language)
    Person.work()
}