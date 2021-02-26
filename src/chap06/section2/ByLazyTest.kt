package chap06.section2

class LazyTest {
    init {
        println("init block") // (2)
    }

    val subject by lazy {
        println("lazy initialized") // (6)
        "Kotlin Programming" // (7)
    }

    fun flow(){
        println("not initialized") // (4)
        println("subject one : $subject") // (5)
        println("subject two : $subject") // (8)
    }
}

fun main() {
    var test = LazyTest() // (1)
    test.flow() // (3)
}