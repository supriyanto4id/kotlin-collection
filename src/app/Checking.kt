package app

fun main() {
    val range = (1..10).toList()

    println(range.contains(5))
    println(range.containsAll(listOf(1,2,11)))
    println(range.isEmpty())
    println(range.isNotEmpty())
}