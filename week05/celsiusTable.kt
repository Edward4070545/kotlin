fun celsius(fahrenheit: Double): Double {
    return (5.0 / 9.0) * (fahrenheit - 32)
}

fun main() {
    println("Fahrenheit    Celsius")
    println("----------------------")
    for (fahrenheit in 0..20) {
        val celsiusTemp = celsius(fahrenheit.toDouble())
        println("$fahrenheit           $celsiusTemp")
    }
}
