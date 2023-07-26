fun main() {

    var p1 = Persona("Rahul",25)
    println(p1.age)
    p1.age = 13
    println(p1.age)
    println(p1.name)

}

class Persona(nameParam:String,ageParam:Int){

    var name:String = nameParam
        get() {
            return field.uppercase()
        }
    var age:Int = ageParam
        set(value) {
            if(value > 18){
                field = value
            }
            else{
                println("Age can't be less than 18")
            }
        }





}