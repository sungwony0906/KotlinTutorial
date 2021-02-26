package chap07.section1

interface Pet {
    var category: String // abstract 키워드가 없어도 기본은 추상 프로퍼티
    var species: String
    val msgTags : String
        get() = "I'm your levly pet" // val의 경우 getter의 구현이 가능
    fun feeding() // 마찬가지로 추상 메서드
    fun patting() { // 일반 메서드
        println("Keep patting!")
    }
}

class Cat(name : String, override var category: String) : Pet {
    override var species: String = "Cat"

    override fun feeding() {
        println("Feed")
    }
}