package app

fun main() {
    val list = listOf("Supri", "Mildy", "Yanto")

    println(list.getOrNull(0))
    println(list.getOrElse(5){i->"TIdak Ada data"})
    println(list.subList(0,2))

    val sortedList =list.sorted()
    println(sortedList.binarySearch("Mildy"))
    println(sortedList.binarySearch("Yanto"))
    println(sortedList.binarySearch("Supri"))

    val numbers = listOf(1,1,2,4,4,5,5,6,6,7,8,9,9,2,3,4,4,5,5,6,6)

    println(numbers.indexOf(2))
    println(numbers.lastIndexOf(2))


}