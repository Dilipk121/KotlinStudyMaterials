fun main() {
    var santro = Car("Santro","Petrol",15000)
    var scorpio = Car(name = "Scorpio",type = "Disel", kmRum = 25000)

    println(santro.name + " " + santro.type + " " +  santro.kmRum)
    santro.driveCar()

    println(scorpio.name + " " + scorpio.type + " " +  scorpio.kmRum)
    scorpio.applyBrakes()
}

//properties
class Car(var name :String, var type:String, var kmRum :Int){

    fun driveCar(){
        println("$name Car is Driving")
    }
    fun applyBrakes(){
        println("$name Applied Breaks")
    }
}