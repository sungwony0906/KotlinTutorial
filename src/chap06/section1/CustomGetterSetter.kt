package chap06.section1

class User(_id: Int, _name: String, _age:Int){
    val id: Int = _id
    var name : String = _name
        set(value){
            println(value)
            field = value
        }
}