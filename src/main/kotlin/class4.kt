fun main() {

    println("Animal Class Created")

    var animal1 = Animal("Elephant","Grey")
    println(animal1.name + " "+ animal1.color)
    animal1.eating()

    var animal2 = Animal("Horse","White")
    println(animal2.name + " "+ animal2.color)
    animal2.eating()

}
class Animal(name:String,color:String){
    var name:String = name
    var color:String = color

    init {
        println("$name is looking beautiful in $color")
    }

    fun eating(){
        println("$name is eating grass")
    }

}