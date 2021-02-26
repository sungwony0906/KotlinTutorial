package chap05.section5

open class Base {
    protected var i = 1
    protected fun protectedFunc() {
        i += 1
    }
    fun access(){
        protectedFunc()
    }
}

class Derived : Base(){
    var j = i + 1
    fun derivedFunc() : Int{
        protectedFunc()
        return i
    }
}

class Other {
    fun other() {
        val base = Base()

    }
}

fun main() {
    val base = Base()

}