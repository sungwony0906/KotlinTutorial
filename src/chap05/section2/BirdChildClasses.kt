package chap05.section2

open class Bird(var name : String, var wing : Int, var beak : String, var color : String){
    fun fly() = println("fly")
    fun sing(vol : Int) = println("sing $vol")
}

class Bird2 (name : String, wing : Int, beak : String, color : String) : Bird(name, wing, beak, color) {
    fun singhitone() = println("Happy Song!")
}

class Lark : Bird{
    constructor(name : String,
                wing : Int,
                beak : String,
                color : String,
                language : String) : super(name, wing, beak, color){
        this.name = name
        this.wing = wing
        this.beak = beak
        this.color = color
    }
}