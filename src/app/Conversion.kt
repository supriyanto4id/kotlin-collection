package app


fun main() {
    val array = arrayOf(1,2,3,4,5,6,7,8,10,9)
    val range = 1..10

    val list = array.toList()
    val set = array.toSet()

    val mutableSet =range.toMutableSet()
    val mutableList =range.toMutableList()

    val listToMutablelist =list.toMutableList()

    val sortedSet = array.toSortedSet()
    println(listToMutablelist)

    println(sortedSet)
}