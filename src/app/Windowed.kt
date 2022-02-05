package app

fun main() {
    val number = listOf(1,2,3,4,5)
    println(number.windowed(3,1, false))
    println(number.windowed(3,1, true))
    println(number.windowed(3,1, true){it.size})
}