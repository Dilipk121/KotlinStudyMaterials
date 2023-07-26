fun main() {
    //function call
    message("Rahuk Kumar", 32)

   var add = addtwo(10,20)
    println(add)

    var three = addthree(91,20,84)
    println(three)

    printmsg(5)
}

//function create
fun message(name : String ,age : Int){
    println("Name is $name and Age is $age")
}

// return type Int define
fun addtwo(x:Int , y:Int): Int {
    var add = x+y
    return add
}

    //inline fun statement
fun addthree(a1:Int,a2:Int,a3:Int) = a1+a2+a3

//default Arg
fun printmsg(count:Int){
    for (i in 1..count){
        println("Value $i")
    }
}