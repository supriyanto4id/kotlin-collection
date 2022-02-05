package app

fun main() {
    val list1 = listOf("supr", "Kurniawan", "Dimas Akhamd prasetiyo")

    println(list1.any {it.length > 5})
    println(list1.all { it.length >4 })
}