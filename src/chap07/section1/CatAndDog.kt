package chap07.section1

import chap03.section6.c

open class Animal(val name : String)

class Dog(name: String, override var category: String) : Animal(name), Pet {

    override var species : String = "Dog"
    override fun feeding() {
        TODO("Not yet implemented")
    }
}

class Master {
    fun playWithPet(pet: Pet){
        println("Enjoy with my ${pet.species}.")
    }
}

fun main() {
    val mater = Master()
    val dog = Dog("Toto", "small")
    val cat = Cat("Coco", "BigFat")
    mater.playWithPet(dog)
    mater.playWithPet(cat)
}