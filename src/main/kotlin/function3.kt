import kotlin.math.pow

fun main() {

    var fn = ::addmore
    println(fn(20.0,10.0))

    fn = ::power
    println(fn(2.0,5.0))

}
fun addmore(a:Double,b:Double): Double {
    return a + b
}

fun power(a:Double,b:Double): Double {
    return a.pow(b)
}