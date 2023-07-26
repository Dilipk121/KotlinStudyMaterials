fun main() {
    for (i in 1..10){
        println("value of i = $i")
    }

    // use of step
    for (i in 1..20 step 2){
        println("value of i = $i")
    }

    // until
    for (i in 1 until 5){
        println("Hello for-loop-until " + i)
    }

    for (i in 10 downTo 1){
        println("Hello Android "+ i)
    }

    // 5 table
    val num = 5
    for (i in 1..10){
        println(" $num x $i = " + num*i)
    }
}