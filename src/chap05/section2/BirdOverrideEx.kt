package chap05.section2.override

open class Bird(var name : String, var wing : Int, var beak : String, var color : String){
    fun fly() = println("fly")
    open fun sing(vol : Int) = println("sing $vol")
}

class Bird2 (name : String, wing : Int, beak : String, color : String) : Bird(name, wing, beak, color) {
    fun singhitone() = println("Happy Song!")
}

class Lark (name : String,
            wing : Int,
            beak : String,
            color : String,
            var language : String)
    : Bird(name, wing, beak, color){

    fun speak() = println("Speak $language")
        override fun sing(vol : Int) {
            super.sing(vol)
            println("I'm a man vol $vol")
            speak()
        }

}

fun main() {
    var lark = Lark("myBird", 2, "short", "blue", "korean")
    lark.sing(3)
}