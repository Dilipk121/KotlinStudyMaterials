fun main() {
    var animal = "Dog"

    if (animal=="Horse"){
        println("Animal is Horse")
    }
    else if (animal == "Cat"){
        println("Animal is Cat")
    }
    else if (animal == "Dog"){
        println("Animal is Dog")
    }
    else{
        println("Animal is not Found!!")
    }

    //replace this code by using when() function

    when(animal){
       "Horse" -> println("animal is horse")
        "Cat" -> println("animal is cat")
        "Dog" -> println("animal is dog")
        else -> println("animal is not in the list!!")
    }

    //use when() as a expression

    var result = when(animal){
        "Horse" -> "animal == horse"
        "Cat" -> "animal == cat"
        "Dog" -> "animal == dog"
        else -> "animal == not found"
    }
    println(result)

    //
    var x = 12

    var res = when(x){
        11 -> "Eleven"
        12 -> "twelve"
        13 -> "thirteen"
        else -> "not found"
    }
    println(res)



}