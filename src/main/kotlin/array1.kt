fun main() {

    //string type array
    var arr = arrayOf("one","two","three")

    println(arr[0])
    println(arr[1])
    println(arr.get(2))
    arr.set(2,"Four")
    println(arr.get(2))

    println("_____________________")
    println(arr[0])
    println(arr[1])
    println(arr.get(2))// now its set at the value of three


    var arr1 = arrayOf(12,13,14,15,16,17)
    for (i:Int in arr1 ) {
    println("$i")
    }

    // print with array index numbers
    for ((i:Int,e:Int) in arr1.withIndex() ) {
        println("$e --index[$i]")
    }
}