package chap07.section2

data class Customer(var name: String, var email: String) {
    var job: String = "Unknown"
    constructor(name: String, email: String, _job:String) : this(name,email){
        job = _job
    }
    init {
        this.name = "Mr/Ms " + this.name
    }
}

fun main() {

    val cus1 = Customer("Kildong", "kil@mail.com")
    println(cus1)
    val (name, email) = cus1
    println("name is $name , email is $email")

    val n1 = cus1.component1()
    val n2 = cus1.component2()

    println("name is $n1 , email is $n2")

    val lam1 = {
        (name, email) : Customer ->
        println(name)
        println(email)
    }

    lam1(cus1)
}