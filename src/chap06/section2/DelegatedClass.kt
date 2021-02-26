package chap06.section2

interface Car {
    fun go () : String
}

class VanImpl (val power:String) : Car {
    override fun go() = "는 집을 적재하며 $power 마력을 가집니다."
}

class SportImpl (val power:String) : Car {
    override fun go() = "는 경주용이며 $power 마력을 가집니다."
}

class CarModel(val model:String, impl: Car) : Car by impl{
//    override fun go() : String{
//        return "TEST"
//    }

    fun carInfo(){
        println("$model ${go()}")
    }
}

fun main() {
    val myDamas = CarModel("Damas 2020", VanImpl("100"))
    val my350z = CarModel("350Z 2008", SportImpl("350"))

    myDamas.carInfo()
    my350z.carInfo()
}