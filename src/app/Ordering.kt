package app

fun main() {
    val number = listOf(5,6,2,1,5,6,7,8,9,1,)

    val sortedAsc = number.sorted()
    val sortedDesc = number.sortedDescending()

    println(sortedAsc)
    println(sortedDesc)
}