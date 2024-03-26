fun main() {
    println("Number of pyramid levels:")
    val pyramidLevels = readLine()?.toIntOrNull() ?: 0

    if (pyramidLevels <= 0) {
        println("Enter a positive integer greater than zero.")
    } else {
        for (i in 1..pyramidLevels) {
            for (j in 1..i) {
                print("*")
            }
            println()
        }
    }
}