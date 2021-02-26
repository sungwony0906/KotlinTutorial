package chap06.section2

import kotlin.properties.Delegates

class User {
    var name : String by Delegates.observable("NONAME") {
        prop, old, new ->
        println("$old -> $new")
    }
}

fun main() {
    var user = User()
    user.name = "HOHO"
    user.name = "Kildong"
}