package chap06.section1

class Person(_id: Int, _name:String, _age: Int){

    //property
    var id : Int = _id
        get() = field // property를 참조하는 변수로 보조 필드(backing field)로 불림

    var name: String = _name
        get() = field
        set(value) {
            field = value
        }

    var age: Int = _age
        get() = field
        set(value) {
            field = value * 2
        }
}

class Person2(var id:Int, val name:String, val age:Int)

fun main() {
    var person = Person(1, "Kildong", 30)
    person.id = 2
    person.age = 30
    println(person.id)
    println(person.age)
}