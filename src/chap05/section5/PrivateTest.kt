package chap05.section5

private class PrivateTest{
    private var i = 1
    private fun privateFunc(){ //private
        i += 1
    }
    fun access(){ //public
        privateFunc()
    }
}

class OtherClass {
    private val pc = PrivateTest()
}

fun main() {
    val pc = PrivateTest()
    pc.access()
}