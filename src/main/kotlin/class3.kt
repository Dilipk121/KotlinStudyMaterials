fun main() {

    var human1 = Human()
    human1.name = "Rahul"
    human1.age = 25

    println(human1.name + " "+ human1.age)

    var bird1 = Bird("Koyal","Black")
    var bird2 = Bird("Parot","Green")

    println(bird1.name +" "+ bird1.color)
    println(bird2.name +" "+ bird2.color)

}

class Bird(name:String,color:String){
    var name:String = name
    var color:String = color
}

class Human(){
    var name:String = ""
    var age:Int = 0

}