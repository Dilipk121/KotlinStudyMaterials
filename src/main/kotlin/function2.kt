fun main() {

    var add1 = add(45,65)
    println(add1)
    var add2 = add(12.25,25.55)
    println(add2)
    var add3 = add(15,25,45.75)
    println(add3)

    var add4 = addnum(a=5,b=10)
    println(add4)
    var add5 = addnum(b=20,a=30)
    println(add5)

    //store fun value into variable
    var sum =::addnum
    println(sum(5,10))

}

fun add(a : Int,b: Int ):Int{
    return a+b
}

fun add(a : Int,b: Int ,c : Double): Double {
    return a+b+c
}

fun add(a : Double,b: Double ):Double{
    return a+b
}

//named arguments
fun addnum(a: Int,b: Int):String{
    return ("a=  $a," + " b= $b")
}