fun main() {
    val totalLines = 7
    val maxStars = 7

    for (i in 1..totalLines) {
        val numSpacesBefore = if (i <= totalLines / 2) totalLines / 2 - i + 1 else i - totalLines / 2 - 1
        val numStars = if (i <= totalLines / 2) 2 * i - 1 else 2 * (maxStars - i) + 1

        print(" ".repeat(numSpacesBefore))
        println("*".repeat(numStars))
    }
}