fun main() {
    //default constructor call
    var cal1 = Calculator()

    println(cal1.add(45,20))
    println(cal1.multiply(4,20))

    cal1.message = "Calculator is working good"

    println(cal1.message)

}
class Calculator {

    //lateinit
    lateinit var message:String

    fun add(a:Int,b:Int):Int{
        return a+b
    }

    fun multiply(a:Int,b:Int):Int{
        return a*b
    }
}
