fun main() {

    var car1 = AutoMobile("Santro","Petrol")
    println("Name- " + car1.name +" Tyre "+ car1.tyre +" MaxSeating "+ car1.maxseating + " EngineType "+ car1.engineType )


    var car2 = AutoMobile("scorpio",5,7,"Disel")
    println("Name- " + car1.name +" Tyre "+ car1.tyre +" MaxSeating "+ car1.maxseating + " EngineType "+ car1.engineType )

    var auto1 = auto("Bajaj")
    println("${auto1.name} Runs")


}

class AutoMobile(var name:String,var tyre:Int,var maxseating:Int,var engineType:String){

   init {
       println("$name comes in List")
   }
    constructor(name:String,engineType: String) :this(name,4,5,engineType)

}

class auto(name:String,fualType:String="CNG"){

    var name:String = name

    init {
        println("$name is Boom Boom, runs on $fualType")
    }

}