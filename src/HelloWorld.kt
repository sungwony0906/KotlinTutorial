import com.example.edu.Person as User

fun main() {
    println("Hello Kotlin!")

    val person = User("kildong", 20)
    val person2 = Person(20, "noname", "Programmer")

    println(person.name)
    println(person2.name)
}

class Person(val no: Int, val name: String, val jobTitle: String)