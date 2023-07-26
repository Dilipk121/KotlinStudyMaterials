fun main() {
    var i = 20
    println(i.plus(10))
    println(i.toFloat())
    println(i.toLong())

    var person1 = Person("Rahul",25)
    var person2 = Person("Vikash",17)

    println(person1.canVote())
    println(person2.canVote())

    //now change person2 age
    person2.age = 20

    println(person2.canVote())


}

class Person(var name:String, var age:Int){
    fun canVote():Boolean{
        return age >= 18
    }
}
