package app

fun main() {
    val list1 = listOf("supr", "Kurniawan", "Dimas Akhamd prasetiyo")
    val(listMatch, ListNotMatch) =list1.partition { it.length >= 5 }
    println(list1)
    println(listMatch)
    println(ListNotMatch)
}