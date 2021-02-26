package chap05.section1

class Bird (var name : String, var wing: Int, var beak: String, var color:String){
    init {
        println("---초기화 블록 시작---")
        this.sing(3)
        println("---초기화 블록 끝---")
    }
    fun fly() {
        println("FLY")
    }
    fun sing(vol : Int) = println("Sing $vol")
}

fun main() {
    val coco = Bird("mybird", 2, "long", "yellow")
    coco.color = "BLUE"

    println(coco.name)
    println(coco.color)
    coco.fly()
    coco.sing(2)

    val coco2 = Bird("newBird", 3, "short", "blue")
    println(coco2.name)
    println(coco2.color)
}