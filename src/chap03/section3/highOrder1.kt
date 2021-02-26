package chap03.section3

fun sum(a: Int, b: Int) = a+b

fun mul(a: Int, b: Int) = a*b

fun main() {
    val result = sum(10, 3)
    val result2 = mul(sum(3,3), 2)

    println("result : $result, result2 : $result2")
    println(funcFunc())

    val result3 : Int
    val multi = {x:Int, y:Int ->
        println("x*y")
        x*y
    }
    val multi2 : (Int, Int) -> Int = {x, y -> x*y}

    result3 = multi(10,20)
    println(result3);

    val greet : () -> Unit = { println("Hello")}
    greet()

    val nestedLambda : () -> () -> Unit = { {println("World!")} }
    nestedLambda()()
}

fun funcFunc() : Int{
    return sum(2,2)
}