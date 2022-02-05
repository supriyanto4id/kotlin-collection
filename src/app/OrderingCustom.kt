package app

data class Fruit(val name:String, val qyt:Int)

fun main() {
    val fruit = listOf(
        Fruit("Apple", 12),
        Fruit("Strawberry", 10),
        Fruit("Banan", 2)
    )

    println(fruit.sortedBy { it.name })



}
